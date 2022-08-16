package com.example.togheergym.controllers;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private BorderPane borderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }



    public void setModel(BorderPane borderPane) {
        this.borderPane = borderPane;
     //   System.out.println(model.getActiveCostumers().size());

       // this.model=model;
    }

}
