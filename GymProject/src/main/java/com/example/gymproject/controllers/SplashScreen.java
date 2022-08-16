package com.example.gymproject.controllers;

import com.example.gymproject.model.Model;
import com.example.gymproject.model.UsersModel;
import com.example.gymproject.objectors.Users;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SplashScreen implements Initializable {
    private Users users;
    private Model model;

    public SplashScreen() throws SQLException {
        this.model = new Model();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("In splash screen..");

    }


    public void setCurrentUser(Users user) throws IOException {
//        this.users = user;
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/gymproject/view/home.fxml"));
//        Parent root = fxmlLoader.load();
//        HomeController homeController = fxmlLoader.getController();
//        homeController.setUser(users);
//        homeController.setModel(model);
//
//        Scene scene = new Scene(root);
//        Stage stage = new Stage();
//        stage.setScene(scene);
        System.out.println(user);
    }


}
