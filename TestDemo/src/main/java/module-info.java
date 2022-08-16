module com.example.testdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testdemo to javafx.fxml;
    exports com.example.testdemo;
}