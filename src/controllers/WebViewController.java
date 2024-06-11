package controllers;

/**
 * @author Soban
 * date 11/06/2024
 * Controller class for web view page in a JavaFX application via URL.
 */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebViewController implements Initializable {
	@FXML
	private WebView webView;
		
	private WebEngine engine;
	
	/**
     * Initializes the controller, setting up the WebView and loading the initial web page.
     * @param location  The location used to resolve relative paths for the root object
     * @param resources The resources used to localize the root object
     */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
		loadPage();
	}
	
	/**
     * Loads the web page (GitHub profile) into the WebView.
     */
	public void loadPage() {
		engine.load("https://github.com/sobantahir");
	}
}
