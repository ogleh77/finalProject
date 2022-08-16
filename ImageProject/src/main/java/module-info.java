module com.example.imageproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.imageproject to javafx.fxml;
    exports com.example.imageproject;
}