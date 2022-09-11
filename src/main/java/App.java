import controller.AppController;
import view.GamePanel;

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		GamePanel gp = new GamePanel();
		AppController appController = new AppController(gp);

		gp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp.setLocationRelativeTo(null);
		gp.setVisible(true);
	}
}
