package com.example.petshop;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditPage extends AppManager implements Initializable {

    public TableColumn PIDEdit;
    public TableColumn PNEdit;
    public TableColumn QEdit;
    public TableColumn PEdit;
    public TableColumn PVEdit;
    public TableColumn PTEdit;
    public TableView EditTable;
    String ProductID;
    String ProductName;
    String ProductType;
    String PetType;
    int Quantity;
    float price;

    public EditPage()
    {
        ProductID = SearchedProduct.get(0).getProductID();
        ProductName = SearchedProduct.get(0).getProductName();
        Quantity = SearchedProduct.get(0).getQuantity();
        price = SearchedProduct.get(0).getPrice();
        PetType = SearchedProduct.get(0).getPetType();
        ProductType = SearchedProduct.get(0).getProductType();
    }
    public void OnEditTableClicked(MouseEvent mouseEvent)
    {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        EditTable.setEditable(true);
        PIDEdit.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        PIDEdit.setCellFactory(TextFieldTableCell.forTableColumn());

        PNEdit.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        PNEdit.setCellFactory(TextFieldTableCell.forTableColumn());


        PEdit.setCellValueFactory(new PropertyValueFactory<>("Price"));
        PEdit.setCellFactory(TextFieldTableCell.forTableColumn(new FloatStringConverter()));


        QEdit.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        QEdit.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));


        PTEdit.setCellValueFactory(new PropertyValueFactory<>("ProductType"));
        PTEdit.setCellFactory(TextFieldTableCell.forTableColumn());


        PVEdit.setCellValueFactory(new PropertyValueFactory<>("PetType"));
        PVEdit.setCellFactory(TextFieldTableCell.forTableColumn());

        EditTable.setItems(SearchedProduct);
    }

    public void OnDone(ActionEvent actionEvent) throws IOException {
        DbConnectHere();
        EditData(SearchedProduct.get(0).getProductID(),ProductID,ProductName,price,Quantity,PetType,ProductType);
        HelloApplication login=new HelloApplication();
        login.changeScene("ProductManage.fxml");
        SearchedProduct.clear();
    }

    public void OnCancel(ActionEvent actionEvent) throws IOException {
        HelloApplication login=new HelloApplication();
        login.changeScene("ProductManage.fxml");
    }


    public void OnPiEditCancelled(TableColumn.CellEditEvent cellEditEvent)
    {
        ProductID = SearchedProduct.get(0).getProductID();
    }

    public void OnPNEditCancel(TableColumn.CellEditEvent cellEditEvent)
    {
        ProductName = SearchedProduct.get(0).getProductName();
    }

    public void OnQuantityEditCancel(TableColumn.CellEditEvent cellEditEvent)
    {
        Quantity = SearchedProduct.get(0).getQuantity();
    }

    public void OnPriceEditcancelled(TableColumn.CellEditEvent cellEditEvent)
    {
        price = SearchedProduct.get(0).getPrice();
    }

    public void OnPetVarEditCancel(TableColumn.CellEditEvent cellEditEvent)
    {
        PetType = SearchedProduct.get(0).getPetType();
    }

    public void OnProTypeEditCancel(TableColumn.CellEditEvent cellEditEvent)
    {
        ProductType = SearchedProduct.get(0).getProductType();
    }


    public void OnPIEdited(TableColumn.CellEditEvent cellEditEvent)
    {
        ProductID = cellEditEvent.getNewValue().toString();
        System.out.println(ProductID);
    }

    public void OnPNEdited(TableColumn.CellEditEvent cellEditEvent) {
        ProductName = cellEditEvent.getNewValue().toString();
    }

    public void OnQuantityEdited(TableColumn.CellEditEvent cellEditEvent) {
        Quantity = Integer.parseInt(cellEditEvent.getNewValue().toString());
    }

    public void OnPriceEdited(TableColumn.CellEditEvent cellEditEvent) {
        price = Float.parseFloat(cellEditEvent.getNewValue().toString());
    }

    public void OnPetVarEdited(TableColumn.CellEditEvent cellEditEvent) {
        PetType = cellEditEvent.getNewValue().toString();
    }

    public void OnProTypeEdited(TableColumn.CellEditEvent cellEditEvent) {
        ProductType = cellEditEvent.getNewValue().toString();
    }



}
