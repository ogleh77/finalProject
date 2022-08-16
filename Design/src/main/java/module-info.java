module com.example.design {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.jfoenix;
    opens com.example.design to javafx.fxml;
    opens com.example.design.controllers to javafx.fxml;
    exports com.example.design;
}