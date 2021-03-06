package Twitter;

import twitter4j.TwitterException;
import DataRequesterManager.DataRequestManager;
import GUIManager.GUIManager;

public class Twitter {

	private DataRequestManager dataRequestManager;
	private GUIManager guiManager;

	public Twitter() {
		dataRequestManager = new DataRequestManager(guiManager);
		guiManager = new GUIManager(dataRequestManager);
		if (dataRequestManager.isAuthExists()) {
			guiManager.printMainPanel();
		} else {
			guiManager.printLoginPanel();
		}
	}

	public static void main(String args[]) throws TwitterException {
		new Twitter();
	}

}
