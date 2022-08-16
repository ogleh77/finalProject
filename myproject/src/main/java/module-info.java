module com.example.myproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires AnimateFX;
    requires com.jfoenix;
    opens com.example.myproject to javafx.fxml;
    opens com.example.myproject.controllers to javafx.fxml;
    exports com.example.myproject;
    exports com.example.myproject.controllers;

}