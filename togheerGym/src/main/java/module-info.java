module com.example.togheergym {
    requires javafx.controls;
    requires javafx.fxml;
    requires AnimateFX;
    opens com.example.togheergym to javafx.fxml;
    opens com.example.togheergym.controllers to javafx.fxml;
    exports com.example.togheergym;
}