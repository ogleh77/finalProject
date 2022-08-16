module com.example.img2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.img2 to javafx.fxml;
    exports com.example.img2;
}