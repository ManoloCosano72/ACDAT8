package com.github.ManoloCosano72.view;

import com.github.ManoloCosano72.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController extends Controller implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button enterButton;
    @FXML
    private TextField fieldMail;
    @FXML
    private TextField fieldPassword;
    @FXML
    private ImageView returnButton;
    @Override
    public void onOpen(Object input) throws Exception {

    }

    @Override
    public void onClose(Object output) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void returnButton() throws Exception {
        App.currentController.changeScene(Scenes.MAIN, null);
    }
}
