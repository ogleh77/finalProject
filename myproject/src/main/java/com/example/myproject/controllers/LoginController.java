package com.example.myproject.controllers;

import animatefx.animation.FadeOut;
import com.example.myproject.model.UserModel;
import com.example.myproject.objects.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<String> userName;
    private UserModel userModel;
    @FXML
    private AnchorPane loginPane;

    public LoginController() throws SQLException {
        this.userModel = new UserModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Users user : userModel.getUsers()) {
            userName.getItems().addAll(user.getUsername());
        }

    }

    @FXML
    void loginHandler(ActionEvent event) throws IOException {
        for (Users user : userModel.getUsers()) {
            if (user.getUsername().equals(userName.getValue())) {
                if (user.getPassword().equals(password.getText().trim())) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/myproject/views/splashscreen.fxml"));
                    Scene scene = new Scene(loader.load());
                    SplashController controller = loader.getController();
                    controller.setActiveUser(user);
                    Stage splashStage = new Stage();
                    splashStage.initStyle(StageStyle.UNDECORATED);
                    splashStage.setScene(scene);

                    Stage stage = (Stage) userName.getScene().getWindow();
                    FadeOut fadeOut = new FadeOut(loginPane);
                    fadeOut.play();
                    fadeOut.setOnFinished(e -> {
                        stage.close();


                        splashStage.show();
                    });


                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("username and password doesn't match");
                    alert.setTitle("Password incorrect");
                    alert.showAndWait();
                }
            }
        }
    }
}
