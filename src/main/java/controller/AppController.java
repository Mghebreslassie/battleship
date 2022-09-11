package controller;

import view.GamePanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AppController {

	private GamePanel view;
	private Timer timer;

	private int ammo;
	private ArrayList<String> targetLocations;

	private EnemyShip enemyShip;

	public AppController(GamePanel view){
		this.view = view;
		ammo = 10;
		targetLocations = new ArrayList<>();
		this.enemyShip = new EnemyShip(3,5,3,5);
		timer = new Timer();
		TimerTask tt = new TimerTask() {
			int seconds = 300;
			@Override
			public void run() {
				while (seconds > 0) {
					view.getTimerLabel().setText("%s seconds left".formatted(seconds));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					seconds--;
				}
			}
		};
		timer.schedule(tt, 0);
		setup();
	}

	private void initBoard(){
		GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0);
		for (int i = 0; i < 10; i++){

			for (int j = 0; j < 10; j++){

				JPanel jPanel = new JPanel();
				jPanel.setBackground(Color.CYAN);
				jPanel.setBorder(new LineBorder(Color.black, 2));
				jPanel.setName("%s-%s".formatted(i,j));
				gbc.gridy = j;
				gbc.gridx = i;
				view.getGridPanel().add(jPanel, gbc);
			}
		}
	}
	private void setup(){
		initBoard();
		view.getAmmoLabel().setText(String.valueOf(ammo));
		view.getFireButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String xVal = view.getxValueField().getText();
				String yVal = view.getyValueField().getText();
				String location = "%s-%s".formatted(xVal,yVal);

				//check if tried there before
				boolean sameCoords = targetLocations.contains(location);
				if (sameCoords) {
					view.getxValueField().setText("");
					view.getyValueField().setText("");
					return;
				}
				//check for hit
				//if hit change square color
				JPanel leftSidePanel = view.getLeftSidePanel();
				String missileResult = enemyShip.calculateHit(location) ? "Hit" : "Miss";
				JPanel pan = null;
				for (Component component : view.getGridPanel().getComponents()) {
					if (component.getName().equals(location)){
						pan = (JPanel) component;
					}
				}
				if (missileResult.equals("Hit")){
					pan.setBackground(Color.red);
				} else {
					pan.setBackground(Color.green);
				}
				leftSidePanel.add(new JLabel(missileResult));

				//add coords
				JPanel rightSidePanel = view.getRightSidePanel();
				rightSidePanel.add(new JLabel(location));
				targetLocations.add(location);

				//reduce ammo
				ammo--;
			}
		});
	}
	private class FiringLocations {
		 boolean hitOrMiss;
		 String location;

		public FiringLocations(boolean hitOrMiss, String location) {
			this.hitOrMiss = hitOrMiss;
			this.location = location;
		}
	}

	private class EnemyShip {

		int top, bottom, lWidth, rWidth;

		ArrayList<String> targetAreas;

		public EnemyShip(int top, int bottom, int lWidth, int rWidth) {
			// a top left, b top right, c right bottom , d left bottom
			this.top = top;
			this.bottom = bottom;
			this.lWidth = lWidth;
			this.rWidth = rWidth;
			targetAreas = new ArrayList<>();
			createShipDimensionArray();
			for (String s : targetAreas){
				System.out.println(s);
			}
		}

		private void createShipDimensionArray(){
			for (int i = top; i < bottom; i++){
				for (int j = lWidth; j < rWidth; j++){
					targetAreas.add("%s-%s".formatted(i, j));
				}
			}
		}
		public boolean calculateHit(String firingLocation){
			boolean contains = targetAreas.contains(firingLocation);
			if (contains){
				targetAreas.remove(firingLocation);
			}
			return contains;
		}
	}
}
