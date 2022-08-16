module com.example.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires AnimateFX;
    requires com.jfoenix;
    opens com.example.jfx to javafx.fxml;
    exports com.example.jfx;
    exports com.example.jfx.controllers;
    opens com.example.jfx.controllers to javafx.fxml;
}