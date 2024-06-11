package controllers;

/**
 * @author Soban
 * date 11/06/2024
 * Controller class for user registration page in a JavaFX application.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

public class RegistrationController {
	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;
	
	/**
	 * Handles the action when the register button is pressed.
	 * @param event The ActionEvent triggered when the register button is pressed
	 * @throws IOException If there is an error writing to the user credentials file
	 */
	@FXML
	public void registerButtonPressed(ActionEvent event) throws IOException {
		/* Get the user name and password */
		String username = tfUsername.getText();
		String password = pfPassword.getText();
		
		if (!username.isBlank() && !password.isBlank()) {
			File file = new File("username&passwords.txt");
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
				writer.write(username + ", " + password);
				writer.newLine();
			}

			// Switch scenes to Login.fxml
			Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			appStage.setScene(scene);

		} else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Registration Failed");
			alert.setHeaderText(null);
			alert.setContentText("Enter a username or password");
			alert.showAndWait();
		}

	}
	
	 /**
     * Handles the action when the login button on the registration screen is pressed.
     * @param event The ActionEvent triggered when the login button is pressed
     * @throws IOException If there is an error loading the login screen
     */
	@FXML
	public void loginonregisterButtonPressed(ActionEvent event) throws IOException {
		// Switch scenes to Login.fxml
		Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}
}
