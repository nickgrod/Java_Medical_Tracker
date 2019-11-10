package view_controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

/**
 * Created by nickg on 10/29/2019.
 */


public class LandingController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Initialized.");
    }


    @FXML
    public void checkLogin(){
        System.out.println(usernameField.getText());
    }
}

