package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GUI {
	
//	private GUIManager guiManager;
	private MainFrame mainFrame;
	private LoginPage loginPage;
	
	// {xPos, yPos, width, height}
	private int[] bounds;
	
	
	public GUI(/*GUIManager guiManager*/) {
//		this.guiManager = guiManager;
		mainFrame = null;
		loginPage = null;
		calculateBounds();
	}
	
	private void calculateBounds() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) (screenSize.getWidth() / 4);
		int height = (int) screenSize.getHeight();
		int yPos = 0;
		int xPos = (int) (screenSize.getWidth() - width);
		bounds = new int[]{xPos, yPos, width, height};
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
	}
	
	public void setBounds(int[] bounds) {
		this.bounds = bounds;
	}
	
	public int[] getBounds() {
		return bounds;
	}
	
	public void loginButtonClicked() {
//		guiManager.loginButtonClicked();
	}
	
	public void printLoginPage(String webAddress) {
		loginPage = new LoginPage(this, webAddress);
		loginPage.printLoginPage();
	}

}
