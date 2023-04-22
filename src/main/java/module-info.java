module com.example.petshop {
    requires javafx.controls;
    requires javafx.fxml;

    //requires org.controlsfx.controls;
    requires java.sql;
//    requires mysql.connector.java;
//    requires org.hibernate.orm.core;
//    requires java.persistence;
    requires java.naming;

    opens com.example.petshop to javafx.fxml;
    exports com.example.petshop;
}