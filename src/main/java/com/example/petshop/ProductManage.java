package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProductManage extends AppManager implements Initializable
{
    public ChoiceBox ProductType;
    public ChoiceBox PetVariety;
    public Button Add;
    public TableColumn <ProductData, String>IDSearch;
    public TableColumn <ProductData, String>IDName;
    public TableColumn <ProductData, Integer>IDPrice;
    public TableView <ProductData> View;
    private String pet[] = {"DOG","CAT","RABBIT","FISH","CHICKEN","LOVE BIRDS","PARROT","PIGEON"};
    private String Type[]= {"Food Items","Food Container","Water Container","Toys","Cages"};
    @FXML
    private Button Back;

    @FXML
    Button Remove;

    @FXML
    private TextField ProductID;

    @FXML
    private TextField ProductName;

    @FXML
    private TextField Price;

    @FXML
    private TextField Stock;

    @FXML
    private TextField ProductIDForRemove;



    public void OnClickBack(ActionEvent actionEvent) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("NextPage.fxml");
    }

    public void OnClickRemove(ActionEvent actionEvent)
    {
        if(!SearchedProduct.isEmpty()) {
            try {
                System.out.println("Remove From DB");
                removeProducts(productDataSearch.getProductID());
                SearchedProduct.clear();
            } catch (Exception e) {
                //  Block of code to handle errors
            }
        }
    }

    public void OnClickSearch(ActionEvent actionEvent)
    {
        getProduct(ProductIDForRemove.getText().toString());
        ProductIDForRemove.setText("");
    }


    public void OnClickAdd(ActionEvent actionEvent)
    {
        try {
            AddProductsToDB(ProductID.getText().toString(),ProductName.getText().toString(), Float.parseFloat(Price.getText().toString()) , Integer.parseInt(Stock.getText().toString()), PetVariety.getValue().toString(), ProductType.getValue().toString());
            System.out.println("Add To DB");

            ProductID.setText("");
            ProductName.setText("");
            Price.setText("");
            Stock.setText("");
            PetVariety.setValue("");
            ProductType.setValue("");

            AddFromDB();

        }
        catch(Exception e) {
            //  Block of code to handle errors
        }

    }


    public void OnClickEdit(ActionEvent actionEvent) throws IOException {
        if(!SearchedProduct.isEmpty())
        {
            HelloApplication login=new HelloApplication();
            login.changeScene("EditPage.fxml");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ProductType.getItems().addAll(Type);
        PetVariety.getItems().addAll(pet);

        System.out.println(SearchedProduct.isEmpty());

        IDSearch.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        IDName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        IDPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));

        View.setItems(SearchedProduct);


    }

    ProductData productDataSearch;

    public void OnSelectedFromSearch(MouseEvent mouseEvent)
    {
        productDataSearch = View.getSelectionModel().getSelectedItem();
        Remove.setDisable(false);
    }




}
