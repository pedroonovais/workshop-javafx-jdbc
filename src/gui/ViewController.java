package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btnTest;
	
	@FXML
	public void onBtnTestAction() {
		Alerts.showAlert("Alert Title", "Alert Header", "Hello", AlertType.CONFIRMATION);
	}
}
