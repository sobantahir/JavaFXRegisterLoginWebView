package controllers;

/**
 * @author Soban
 * date 11/06/2024
 * Controller class for user login page in a JavaFX application.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;

	/**
	 * Handles the action when the login button is pressed.
	 * @param event The ActionEvent triggered when the login button is pressed
	 * @throws IOException If there is an error reading the user credentials file
	 */
	public void loginButtonPressed(ActionEvent event) throws IOException {
		String username = tfUsername.getText();
		String password = pfPassword.getText();
		boolean isValid = false;

		try (BufferedReader reader = new BufferedReader(new FileReader("username&passwords.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				if (parts[0].equals(username) && parts[1].equals(password)) {
					isValid = true;
					break;
				}
			}
		}
		if (isValid) {
			// Switch scenes to WebView.fxml
			Parent root = FXMLLoader.load(getClass().getResource("/view/WebView.fxml"));
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			appStage.setScene(scene);
		} else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Login Failed");
			alert.setHeaderText(null);
			alert.setContentText("Invalid username or password");
			alert.showAndWait();
		}
	}
}
