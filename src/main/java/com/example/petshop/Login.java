package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login extends AppManager {

    @FXML
    private Label ErrorLabel;

    @FXML
    private Button button;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    public void onLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    public void checkLogin() throws IOException{
        HelloApplication login=new HelloApplication();
        if(logIn(username.getText().toString(),password.getText().toString())){
            ErrorLabel.setText("Successful Login");
            login.changeScene("NextPage.fxml");
        }

        else{
            ErrorLabel.setText("Incorrect Username or Password!");
        }

    }

}
