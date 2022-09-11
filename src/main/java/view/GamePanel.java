/*
 * Created by JFormDesigner on Sun Sep 11 11:57:47 MDT 2022
 */

package view;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author User #9
 */
public class GamePanel extends JFrame {
	public GamePanel() {
		initComponents();
	}

	public JPanel getLeftSidePanel() {
		return leftSidePanel;
	}

	public void setLeftSidePanel(JPanel leftSidePanel) {
		this.leftSidePanel = leftSidePanel;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("bundle.Login");
		topPanel = new JPanel();
		letterPanel = new JPanel();
		label19 = new JLabel();
		label20 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		label23 = new JLabel();
		label24 = new JLabel();
		label25 = new JLabel();
		label26 = new JLabel();
		label27 = new JLabel();
		label28 = new JLabel();
		numberPanel = new JPanel();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		label16 = new JLabel();
		label17 = new JLabel();
		label18 = new JLabel();
		gridPanel = new JPanel();
		label5 = new JLabel();
		timerLabel = new JLabel();
		label2 = new JLabel();
		xValueField = new JTextField();
		ammoLabel = new JLabel();
		label1 = new JLabel();
		yValueField = new JTextField();
		hitOrMissPanel = new JScrollPane();
		splitPane1 = new JSplitPane();
		leftSidePanel = new JPanel();
		label6 = new JLabel();
		rightSidePanel = new JPanel();
		label7 = new JLabel();
		fireButton = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new GridBagLayout());
		((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {67, 11, 48, 9, 75, 10, 105, 11, 246, 41, 0};
		((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 9, 0, 0};
		((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//======== topPanel ========
		{
			topPanel.setLayout(new GridBagLayout());
			((GridBagLayout)topPanel.getLayout()).columnWidths = new int[] {36, 440, 0};
			((GridBagLayout)topPanel.getLayout()).rowHeights = new int[] {32, 411, 0};
			((GridBagLayout)topPanel.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
			((GridBagLayout)topPanel.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

			//======== letterPanel ========
			{
				letterPanel.setLayout(new GridLayout(0, 10));

				//---- label19 ----
				label19.setText(bundle.getString("GamePanel.label19.text"));
				label19.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label19);

				//---- label20 ----
				label20.setText(bundle.getString("GamePanel.label20.text"));
				label20.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label20);

				//---- label21 ----
				label21.setText(bundle.getString("GamePanel.label21.text"));
				label21.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label21);

				//---- label22 ----
				label22.setText(bundle.getString("GamePanel.label22.text"));
				label22.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label22);

				//---- label23 ----
				label23.setText(bundle.getString("GamePanel.label23.text"));
				label23.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label23);

				//---- label24 ----
				label24.setText(bundle.getString("GamePanel.label24.text"));
				label24.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label24);

				//---- label25 ----
				label25.setText(bundle.getString("GamePanel.label25.text"));
				label25.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label25);

				//---- label26 ----
				label26.setText(bundle.getString("GamePanel.label26.text"));
				label26.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label26);

				//---- label27 ----
				label27.setText(bundle.getString("GamePanel.label27.text"));
				label27.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label27);

				//---- label28 ----
				label28.setText(bundle.getString("GamePanel.label28.text"));
				label28.setHorizontalAlignment(SwingConstants.CENTER);
				letterPanel.add(label28);
			}
			topPanel.add(letterPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));

			//======== numberPanel ========
			{
				numberPanel.setLayout(new GridLayout(10, 0));

				//---- label9 ----
				label9.setText(bundle.getString("GamePanel.label9.text"));
				numberPanel.add(label9);

				//---- label10 ----
				label10.setText(bundle.getString("GamePanel.label10.text"));
				numberPanel.add(label10);

				//---- label11 ----
				label11.setText(bundle.getString("GamePanel.label11.text"));
				numberPanel.add(label11);

				//---- label12 ----
				label12.setText(bundle.getString("GamePanel.label12.text"));
				numberPanel.add(label12);

				//---- label13 ----
				label13.setText(bundle.getString("GamePanel.label13.text"));
				numberPanel.add(label13);

				//---- label14 ----
				label14.setText(bundle.getString("GamePanel.label14.text"));
				numberPanel.add(label14);

				//---- label15 ----
				label15.setText(bundle.getString("GamePanel.label15.text"));
				numberPanel.add(label15);

				//---- label16 ----
				label16.setText(bundle.getString("GamePanel.label16.text"));
				numberPanel.add(label16);

				//---- label17 ----
				label17.setText(bundle.getString("GamePanel.label17.text"));
				numberPanel.add(label17);

				//---- label18 ----
				label18.setText(bundle.getString("GamePanel.label18.text"));
				numberPanel.add(label18);
			}
			topPanel.add(numberPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));

			//======== gridPanel ========
			{
				gridPanel.setLayout(new GridBagLayout());
				((GridBagLayout)gridPanel.getLayout()).columnWidths = new int[] {46, 46, 46, 46, 46, 46, 40, 46, 46, 45, 0};
				((GridBagLayout)gridPanel.getLayout()).rowHeights = new int[] {41, 36, 36, 36, 36, 36, 36, 36, 36, 35, 0};
				((GridBagLayout)gridPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)gridPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			}
			topPanel.add(gridPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		contentPane.add(topPanel, new GridBagConstraints(0, 0, 9, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- label5 ----
		label5.setText(bundle.getString("GamePanel.label5.text"));
		contentPane.add(label5, new GridBagConstraints(8, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- timerLabel ----
		timerLabel.setText(bundle.getString("GamePanel.timerLabel.text"));
		contentPane.add(timerLabel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- label2 ----
		label2.setText(bundle.getString("GamePanel.label2.text"));
		contentPane.add(label2, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		contentPane.add(xValueField, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- ammoLabel ----
		ammoLabel.setText(bundle.getString("GamePanel.ammoLabel.text"));
		contentPane.add(ammoLabel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- label1 ----
		label1.setText(bundle.getString("GamePanel.label1.text"));
		contentPane.add(label1, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		contentPane.add(yValueField, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//======== hitOrMissPanel ========
		{

			//======== splitPane1 ========
			{

				//======== leftSidePanel ========
				{
					leftSidePanel.setLayout(new BoxLayout(leftSidePanel, BoxLayout.Y_AXIS));

					//---- label6 ----
					label6.setText(bundle.getString("GamePanel.label6.text"));
					leftSidePanel.add(label6);
				}
				splitPane1.setLeftComponent(leftSidePanel);

				//======== rightSidePanel ========
				{
					rightSidePanel.setLayout(new BoxLayout(rightSidePanel, BoxLayout.Y_AXIS));

					//---- label7 ----
					label7.setText(bundle.getString("GamePanel.label7.text"));
					rightSidePanel.add(label7);
				}
				splitPane1.setRightComponent(rightSidePanel);
			}
			hitOrMissPanel.setViewportView(splitPane1);
		}
		contentPane.add(hitOrMissPanel, new GridBagConstraints(8, 3, 1, 4, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- fireButton ----
		fireButton.setText(bundle.getString("GamePanel.fireButton.text"));
		contentPane.add(fireButton, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel topPanel;
	private JPanel letterPanel;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JPanel numberPanel;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JPanel gridPanel;
	private JLabel label5;
	private JLabel timerLabel;
	private JLabel label2;
	private JTextField xValueField;
	private JLabel ammoLabel;
	private JLabel label1;
	private JTextField yValueField;
	private JScrollPane hitOrMissPanel;
	private JSplitPane splitPane1;
	private JPanel leftSidePanel;
	private JLabel label6;
	private JPanel rightSidePanel;
	private JLabel label7;
	private JButton fireButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	public JPanel getRightSidePanel() {
		return rightSidePanel;
	}

	public void setRightSidePanel(JPanel rightSidePanel) {
		this.rightSidePanel = rightSidePanel;
	}

	public JPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

	public JPanel getLetterPanel() {
		return letterPanel;
	}

	public void setLetterPanel(JPanel letterPanel) {
		this.letterPanel = letterPanel;
	}

	public JPanel getNumberPanel() {
		return numberPanel;
	}

	public void setNumberPanel(JPanel numberPanel) {
		this.numberPanel = numberPanel;
	}

	public JPanel getGridPanel() {
		return gridPanel;
	}

	public void setGridPanel(JPanel gridPanel) {
		this.gridPanel = gridPanel;
	}

	public JLabel getTimerLabel() {
		return timerLabel;
	}

	public void setTimerLabel(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public JTextField getxValueField() {
		return xValueField;
	}

	public void setxValueField(JTextField xValueField) {
		this.xValueField = xValueField;
	}

	public JLabel getAmmoLabel() {
		return ammoLabel;
	}

	public void setAmmoLabel(JLabel ammoLabel) {
		this.ammoLabel = ammoLabel;
	}

	public JTextField getyValueField() {
		return yValueField;
	}

	public void setyValueField(JTextField yValueField) {
		this.yValueField = yValueField;
	}

	public JScrollPane getHitOrMissPanel() {
		return hitOrMissPanel;
	}

	public void setHitOrMissPanel(JScrollPane hitOrMissPanel) {
		this.hitOrMissPanel = hitOrMissPanel;
	}

	public JButton getFireButton() {
		return fireButton;
	}

	public void setFireButton(JButton fireButton) {
		this.fireButton = fireButton;
	}
}
