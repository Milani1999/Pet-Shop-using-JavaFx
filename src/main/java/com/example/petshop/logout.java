package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class logout {

    @FXML
    private Button Animals;

    @FXML
    private Button Birds;

    @FXML
    private Button ProductManage;

    @FXML
    void onClickAnimals(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("Animals.fxml");

    }

    @FXML
    void onClickBirds(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("Birds.fxml");

    }

    @FXML
    public void OnClickLogout(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("hello-view.fxml");
    }

    public void OnClickProductManage(ActionEvent actionEvent) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("ProductManage.fxml");
    }
}
