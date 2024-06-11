package com.soban;

/**
 * @author Soban
 * date 07/06/2024
 * JavaFX application for user registration, login and web view with validation and file writing functionality.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	/**
	 * Start method of the JavaFX application.
     * @param primaryStage The primary stage of the JavaFX application
     * @throws Exception If there is an error loading the FXML file
	 */
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/Registration.fxml"));
		primaryStage.setTitle("JavaFXLoginWebView App");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	/**
	 * Main method
	 * @param args Command +line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}