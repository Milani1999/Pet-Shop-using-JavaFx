package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Animals extends AppManager{
    @FXML
    private Button Animals;

    @FXML
    private Button Birds;

    @FXML
    private Button Cat;

    @FXML
    private Button Dog;

    @FXML
    private Button Fish;

    @FXML
    private Button Logout;

    @FXML
    private Button Rabbit;

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
    void OnClickLogout(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("hello-view.fxml");

    }

    @FXML
    void OnClickCat(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Cat");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickDog(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Dog");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickFish(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Fish");
        login.changeScene("ProductPage.fxml");

    }

    @FXML
    void OnClickRabbit(ActionEvent event) throws IOException {
        HelloApplication login=new HelloApplication();
        ListItemInProductPage("Rabbit");
        login.changeScene("ProductPage.fxml");

    }

    public void OnClickBack(ActionEvent actionEvent) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("NextPage.fxml");
    }
}
