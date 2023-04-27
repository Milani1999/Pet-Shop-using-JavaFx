package com.example.petshop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProductPage implements Initializable {

    public TableView <ProductData> TBFP;
    public TableView <ProductData> TBFW;
    public TableView <ProductData> TBC;
    public TableView <ProductData> TBT;
    public TableColumn <ProductData, String> IDFoodItm;
    public TableColumn <ProductData, String> NameFoodItm;
    public TableColumn <ProductData, Integer> QuantityFoodItm;
    public TableColumn <ProductData, Integer> PriceFoodItm;
    public TableColumn <ProductData, String> IDFoodCont;
    public TableColumn <ProductData, String> NameFoodCont;
    public TableColumn <ProductData, Integer> QuantityFoodCont;
    public TableColumn <ProductData, Integer> PriceFoodCont;
    public TableColumn <ProductData, String> IDCage;
    public TableColumn <ProductData, String> NameCage;
    public TableColumn <ProductData, Integer> QuantityCage;
    public TableColumn <ProductData, Integer> PriceCage;
    public TableColumn <ProductData, String> IDToys;
    public TableColumn <ProductData, String> NameToys;
    public TableColumn <ProductData, Integer> QuantityToys;
    public TableColumn <ProductData, Integer> PriceToys;
    public TableColumn IDBill;
    public TableColumn QuantityBill;
    public TableColumn PriceBill;
    public TableView<ProductData> Bill;
    public Label Total;
    @FXML
    private Button Animals;

    @FXML
    private Button Birds;

    @FXML
    private Button Logout;

    @FXML
    private Button AddBillButton;

    @FXML
    private Button RemoveBillButton;

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
    private void priceCalculate()
    {
        float price = 0;
        for(int i = 0; i < ProductDatasBill.size(); i++)
        {
            price = price + ProductDatasBill.get(i).getPrice();
        }
        Total.setText(String.valueOf(price));
    }


    @FXML
    void OnClickAddToBill(ActionEvent event) throws IOException {
        Bill.refresh();
        int quantity = 1;
        boolean isInBill = false;
        if(productData != null)
        {
            //HelloApplication login=new HelloApplication();
            if(ProductDatasBill.isEmpty())
            {
                ProductDatasBill.add(new ProductData(productData.getProductID(),productData.getProductName(),quantity, productData.getPrice()));
                priceCalculate();
                quantity = 1;
                productData=null;
            }
            else if(!ProductDatasBill.isEmpty())
            {
                for (int i = 0; i < ProductDatasBill.size(); i++)
                {
                    System.out.println("Processing");
                    // code block to be executed
                    if(ProductDatasBill.get(i).getProductID()==productData.getProductID())
                    {
                        quantity=(ProductDatasBill.get(i).getQuantity()+1);
                        ProductDatasBill.get(i).setQuantity(quantity);
                        ProductDatasBill.get(i).setPrice((int)(productData.getPrice()*quantity));
                        //ProductDatasBill.remove(i.next());
                        isInBill = true;
                        priceCalculate();
                    }
                    else
                    {
                        System.out.println("Request Processing");
                    }

                }

                if(!isInBill)
                {
                    System.out.println("Processing");
                    ProductDatasBill.add(new ProductData(productData.getProductID(),productData.getProductName(),quantity, productData.getPrice()));
                    priceCalculate();
                }
                productData = null;
            }



        }

    }

    public void OnClickRemoveFromBill(ActionEvent actionEvent)
    {
        HelloApplication login=new HelloApplication();
        if(productDataBill != null)
        {
            ProductDatasBill.remove(productDataBill);
        }
        priceCalculate();
        System.out.println("Removed");
        productDataBill = null;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(ProductDatasBill!=null)
        {
            IDBill.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
            QuantityBill.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
            PriceBill.setCellValueFactory(new PropertyValueFactory<>("Price"));
            Bill.setItems(ProductDatasBill);
        }

        IDFoodItm.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        NameFoodItm.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        QuantityFoodItm.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        PriceFoodItm.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TBFP.setItems(ProductDatasFI);

        IDFoodCont.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        NameFoodCont.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        QuantityFoodCont.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        PriceFoodCont.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TBFW.setItems(ProductDatasFW);

        IDCage.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        NameCage.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        QuantityCage.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        PriceCage.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TBC.setItems(ProductDatasC);

        IDToys.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
        NameToys.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        QuantityToys.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        PriceToys.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TBT.setItems(ProductDatasT);
        //add your data to the table here.
    }

    static private ObservableList<ProductData> ProductDatasFI = FXCollections.observableArrayList();

    static private ObservableList<ProductData> ProductDatasFW = FXCollections.observableArrayList();

    static private ObservableList<ProductData> ProductDatasC = FXCollections.observableArrayList();

    static private ObservableList<ProductData> ProductDatasT = FXCollections.observableArrayList();
    static private ObservableList<ProductData> ProductDatasBill = FXCollections.observableArrayList();


    public void AddProductToList(String ProductID, String ProductName, Integer Quantity, Float Price, String Type)
    {
        if(Type.equals("Food Items"))
        {
            ProductDatasFI.add(new ProductData(ProductID,ProductName,Quantity,Price));
        }
        else if(Type.equals("Food Container")||Type.equals("Water Container"))
        {
            ProductDatasFW.add(new ProductData(ProductID,ProductName,Quantity,Price));
        }
        else if(Type.equals("Cage"))
        {
            ProductDatasC.add(new ProductData(ProductID,ProductName,Quantity,Price));
        }
        else if(Type.equals("Toys"))
        {
            ProductDatasT.add(new ProductData(ProductID,ProductName,Quantity,Price));
        }
    }

    public void clearList()
    {
        ProductDatasFI.clear();
        ProductDatasFW.clear();
        ProductDatasC.clear();
        ProductDatasT.clear();
    }

    ProductData productData;
    ProductData productDataBill;
    public void OnSelectedFP(MouseEvent mouseEvent)
    {
        productData = TBFP.getSelectionModel().getSelectedItem();
    }

    public void OnSelectedFW(MouseEvent mouseEvent)
    {
        productData = TBFW.getSelectionModel().getSelectedItem();
    }

    public void OnSelectedC(MouseEvent mouseEvent)
    {
        productData = TBC.getSelectionModel().getSelectedItem();
    }

    public void OnSelectedT(MouseEvent mouseEvent)
    {
        productData = TBT.getSelectionModel().getSelectedItem();
    }

    public void OnClickPrintBill(ActionEvent actionEvent)
    {

    }

    public void OnClickClearBill(ActionEvent actionEvent)
    {
        ProductDatasBill.clear();
        priceCalculate();
    }

    public void OnSelectedBill(MouseEvent mouseEvent)
    {
        productDataBill = Bill.getSelectionModel().getSelectedItem();
    }
}
