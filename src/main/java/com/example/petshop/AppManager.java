package com.example.petshop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AppManager //extends ProductPage
{
    static protected ObservableList<ProductData> SearchedProduct = FXCollections.observableArrayList();
    ProductPage PP = new ProductPage();
    String PetFindr;
    String ProuctVar;

    protected class productDetails
    {
        String ID, ProductName, Pet, Type;
        float Price; int Stock;
        public productDetails(String ProductID, String productName, float price, int stock, String pet, String type)
        {
            ID = ProductID;
            ProductName = productName;
            Pet = pet;
            Price = price;
            Stock = stock;
            Type = type;

        }

    }

    static ArrayList<productDetails> product = new ArrayList<>();
    static ArrayList<productDetails> newproduct = new ArrayList<>();

    //Log In
    public Boolean logIn(String userName, String passWord)
    {
        if(userName.equals("Admin") && passWord.equals("123")) //need to connect Database.
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setPetFindr(String productFindkey)
    {
        PetFindr = productFindkey;
    }

    public String getPetFindr()
    {
        return PetFindr;
    }

    public void ListItemInProductPage(String Pet)
    {

        PP.clearList();
        System.out.println(product.size());
        for (Iterator<productDetails> i = product.iterator(); i.hasNext(); ) {
            productDetails productDetails = i.next();
            System.out.println(productDetails.ID);
            switch (Pet) {
                case "Dog":
                    if(productDetails.Pet.equals("DOG") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                        System.out.println("Yes");
                    }

                    break;
                case "Cat":
                    if(productDetails.Pet.equals("CAT") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "Rabbit":
                    if(productDetails.Pet.equals("RABBIT") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "Fish":
                    if(productDetails.Pet.equals("FISH") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "Parrot":
                    if(productDetails.Pet.equals("PARROT") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "Pigeon":
                    if(productDetails.Pet.equals("PIGEON") )
                    {
                        System.out.println("Yes");
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "LBirds":
                    if(productDetails.Pet.equals("LOVE BIRDS") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;

                case "Chick":
                    if(productDetails.Pet.equals("CHICKEN") )
                    {
                        PP.AddProductToList(productDetails.ID, productDetails.ProductName,productDetails.Stock, productDetails.Price, productDetails.Type);
                    }
                    break;
            }
        }
    }
    void ListItemsInBill()
    {

    }

    void AddItemsInBill()
    {

    }

    void RemoveItemsInBill()
    {

    }

    void BillingTotal()

    {

    }


    void AddProductsToDB(String ID, String Name, float price, int stock, String pet, String ProductVar)
    {
        DbConnectHere();
        newproduct.add(new productDetails(ID,Name,price,stock,pet,ProductVar));
        // System.out.println("ID" + " | " + "Name" +"  | " + "Stock"+ " |  "+ "Price");
        insertData();
    }

    void AddProductsFromDb(String ID, String Name, float price, int stock, String pet, String ProductVar)
    {
        product.add(new productDetails(ID,Name,price,stock,pet,ProductVar));
        //System.out.println(ID+","+Name+","+price+","+stock+","+pet+","+ProductVar);
        // System.out.println("ID" + " | " + "Name" +"  | " + "Stock"+ " |  "+ "Price");
    }

    void getProduct(String PID)
    {
        SearchedProduct.clear();
        DbConnectHere();
        Statement statement = null;
        try {
            String sql = "SELECT * FROM `petshopsystemnew`.`product` WHERE `petshopsystemnew`.`product`.`Product_ID` = '"+PID+"'";
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                SearchedProduct.add(new ProductData(resultSet.getString("Product_ID"), resultSet.getString("Product_Name"), resultSet.getFloat("Price"),resultSet.getInt("Quantity"),resultSet.getString("Pet_Variety"),resultSet.getString("Product_Type")));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void removeProducts(String PID)
    {
        DeleteDBPro(PID);
        // System.out.println("ID" + " | " + "Name" +"  | " + "Stock"+ " |  "+ "Price");
        // show();
    }



    void show()
    {
        for(Iterator<productDetails> i = newproduct.iterator(); i.hasNext(); ) {
            productDetails productDetails = i.next();
            System.out.println(productDetails.ID + "  |  " + productDetails. ProductName+ "  |  " + productDetails.Stock+ "  |  " + productDetails.Price);
            break;
        }
    }

    void fillData(String ID, String Name, float price, int Stock, String pet, String ProductType)
    {
        AddProductsFromDb(ID,Name,price,Stock,pet,ProductType);
        //System.out.println(ID+","+Name+","+price+","+Stock+","+pet+","+ProductType);
    }

    Connection con = null;
    void DbConnectHere()
    {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/petshopsystemnew", "root", "");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void AddFromDB()
    {
        try {
            Statement statement = null;
            statement = (Statement) con.createStatement();
            String sql;
            String sql2_;
            sql = "select * from product";
            sql2_ = "select * from admin";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                fillData(resultSet.getString("Product_ID"), resultSet.getString("Product_Name"), resultSet.getFloat("Price"), resultSet.getInt("Quantity"), resultSet.getString("Pet_Variety"), resultSet.getString("Product_Type"));
                //System.out.println(resultSet.getString("Product_ID")+","+ resultSet.getString("Product_Name")+","+ resultSet.getFloat("Price")+","+resultSet.getInt("Quantity")+","+resultSet.getString("Pet_Variety")+","+resultSet.getString("Product_Type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    void EditData(String RealID, String ID, String ProductName, float Price, int Quantity, String PetVariety, String ProductType)
    {
        Statement statement = null;
        try {
            String sql = "UPDATE `petshopsystemnew`.`product`" +
                    "        SET `petshopsystemnew`.`product`.`Product_ID` =  '"+ID+"'"+
                    "        ,`petshopsystemnew`.`product`.`Product_Name` =  '"+ProductName+"'"+
                    "        ,`petshopsystemnew`.`product`.`Quantity` =  '"+Quantity+"'"+
                    "        ,`petshopsystemnew`.`product`.`Price` =  '"+Price+"'"+
                    "        ,`petshopsystemnew`.`product`.`Pet_Variety` =  '"+PetVariety+"'"+
                    "        ,`petshopsystemnew`.`product`.`Product_Type` =  '"+ProductType+"'"+
                    "        WHERE `petshopsystemnew`.`product`.`Product_ID` = '"+RealID+"'";
            statement = con.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    void insertData()
    {
        Statement statement = null;
        for(Iterator<productDetails> i = newproduct.iterator(); i.hasNext(); ) {
            productDetails productDetails = i.next();
            System.out.println(productDetails.ID + "  |  " + productDetails. ProductName+ "  |  " + productDetails.Stock+ "  |  " + productDetails.Price);
            try {
                String sql = "INSERT INTO `petshopsystemnew`.`product` (`Product_ID`, `Product_Name`, `Quantity`, `Price`, `Pet_Variety`, `Product_Type`)"
                        + "values('" + productDetails.ID + "','" + productDetails. ProductName
                        + "','" + productDetails.Stock + "','" + productDetails.Price + "','" + productDetails.Pet + "','"+ productDetails.Type +"')";
                statement = con.createStatement();
                statement.executeUpdate(sql);

            } catch (Exception e) {
                System.out.println(e);
            }
            break;
        }
        newproduct.clear();
    }

    private void DeleteDBPro(String ID)
    {
        Statement statement = null;
        try {
            String sql = "DELETE FROM `petshopsystemnew`.`product` WHERE `petshopsystemnew`.`product`.`Product_ID` = '"+ID+"'";
            statement = con.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e);
        }
    }









}
