package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Birds extends AppManager{

    @FXML
    private Button Animals;

    @FXML
    private Button Birds;

    @FXML
    private Button Chick;

    @FXML
    private Button Lbirs;

    @FXML
    private Button Logout;

    @FXML
    private Button Parrot;

    @FXML
    private Button Piegon;

    @FXML
    void OnClickAnimals(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("Animals.fxml");

    }

    @FXML
    void OnClickBirds(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("Birds.fxml");

    }

    @FXML
    void OnClickChick(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Chick");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickLbirds(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("LBirds");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickLogout(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("hello-view.fxml");

    }

    @FXML
    void OnClickParrot(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Parrot");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickPigeon(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Pigeon");
        login.changeScene("ProductPage.fxml");

    }

    public void OnClickBack(ActionEvent actionEvent) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("NextPage.fxml");
    }

}
