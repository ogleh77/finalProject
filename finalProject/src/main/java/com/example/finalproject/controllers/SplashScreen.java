package com.example.finalproject.controllers;

import com.example.finalproject.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashScreen implements Initializable {
    private Model model;

    public SplashScreen() {
        this.model = new Model();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void swipeHandler(ActionEvent event) {

    }

}
