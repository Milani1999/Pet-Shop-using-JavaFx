package com.example.petshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage myscene;

    @Override
    public void start(Stage stage) throws IOException {
        myscene=stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load());
        stage.setTitle("Pet Accessories Shop!");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        myscene.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        ProductManage Pm = new ProductManage();
        //Pm.fillData();
        AppManager Am = new AppManager();
        // Pm.Remove.setDisable(true);
        Am.DbConnectHere();
        Am.AddFromDB();
        launch();
    }
}