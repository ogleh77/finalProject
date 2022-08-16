module com.example.gymv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires AnimateFX;
    opens com.example.gymv2.controllers to javafx.fxml;
    opens com.example.gymv2 to javafx.fxml;
    exports com.example.gymv2;
}