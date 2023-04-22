package com.example.petshop;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ProductData
{
    private SimpleStringProperty ProductID;
    private SimpleStringProperty ProductName;
    private SimpleIntegerProperty Quantity ;
    private SimpleFloatProperty Price ;
    private SimpleStringProperty ProductType ;
    private SimpleStringProperty Pet ;

    public ProductData(String ProductID, String ProductName, Integer Quantity, Float Price) {
        this.ProductID = new SimpleStringProperty(ProductID);
        this.ProductName = new SimpleStringProperty(ProductName);
        this.Quantity = new SimpleIntegerProperty(Quantity);
        this.Price = new SimpleFloatProperty(Price);
    }

    public ProductData(String ProductID, String ProductName,  Float Price, Integer Quantity, String Pet, String ProductType) {
        this.ProductID = new SimpleStringProperty(ProductID);
        this.ProductName = new SimpleStringProperty(ProductName);
        this.Quantity = new SimpleIntegerProperty(Quantity);
        this.Price = new SimpleFloatProperty(Price);
        this.ProductType = new SimpleStringProperty(ProductType);
        this.Pet = new SimpleStringProperty(Pet);
    }


    public String getProductID() {
        return ProductID.get();
    }
    public String getProductType() {
        return ProductType.get();
    }
    public String getPetType() {
        return Pet.get();
    }

    public void setProductID(String ProductID) {
        this.ProductID = new SimpleStringProperty(ProductID);
    }

    public String getProductName() {
        return ProductName.get();
    }

    public void setProductName(String ProductName) {
        this.ProductName = new SimpleStringProperty(ProductName);
    }

    public int getQuantity() {
        return Quantity.get();
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = new SimpleIntegerProperty(Quantity);
    }

    public float getPrice()
    {
        return Price.get();
    }

    public void setPrice(Integer Price)
    {
        this.Price = new SimpleFloatProperty(Price);
    }

}
