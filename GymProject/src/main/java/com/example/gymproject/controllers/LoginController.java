package com.example.gymproject.controllers;

import com.example.gymproject.model.Model;
import com.example.gymproject.model.UsersModel;
import com.example.gymproject.objectors.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    private final UsersModel usersModel;
    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<String> username;


    public LoginController() throws Exception {
        this.usersModel = new UsersModel();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            for (Users user : usersModel.getAllUsers()) {
                username.getItems().addAll(user.getUsername());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void loginHandler(ActionEvent event) throws IOException, SQLException {
        for (Users user : usersModel.getAllUsers()) {
            if (user.getUsername().equals(username.getValue())) {
                if (user.getPassword().equals(password.getText())) {
                    System.out.println("accessed....");
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/gymproject/view/splashscreen.fxml"));
                    Parent p = loader.load();
                    SplashScreen splashScreen = loader.getController();
                    splashScreen.setCurrentUser(user);
                    Stage stage = new Stage();
                    stage.setScene(new Scene(p));
                    stage.show();

                    Stage currentStage = (Stage) password.getScene().getWindow();
                    currentStage.close();
                } else {
                    System.out.println("denied");
                }
                break;
            }
        }
    }

}


