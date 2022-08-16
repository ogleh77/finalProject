module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires AnimateFX;
    requires com.jfoenix;
    opens com.example.finalproject to javafx.fxml;
    opens com.example.finalproject.controllers to javafx.fxml;
    exports com.example.finalproject;
    exports com.example.finalproject.actors;
}