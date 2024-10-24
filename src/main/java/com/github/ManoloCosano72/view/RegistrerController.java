package com.github.ManoloCosano72.view;

import com.github.ManoloCosano72.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrerController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldMail;
    @FXML
    private TextField fieldPassword;
    @FXML
    private Button createButton;
    @FXML
    private ImageView returnButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void goToMessagePanel() throws IOException {
        App.setRoot("messagePanel");
    }
    @FXML
    private void returnButton() throws IOException {
        App.setRoot("main");
    }
}
