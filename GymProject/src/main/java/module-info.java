module com.example.gymproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.gymproject to javafx.fxml;
    opens com.example.gymproject.controllers to javafx.fxml;
    exports com.example.gymproject;
}