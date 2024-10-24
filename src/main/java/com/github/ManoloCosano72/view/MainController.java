package com.github.ManoloCosano72.view;

import com.github.ManoloCosano72.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController{
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button loginButton;
    @FXML
    private Button registrerButton;
    @FXML
    private ImageView exitButton;

    @FXML
    private void goToRegistrer() throws IOException {
        App.setRoot("registrer");
    }
    @FXML
    private void goToLogin() throws IOException {
        App.setRoot("login");
    }
    @FXML
    private void closeApp() {
        System.exit(0);
    }
}
