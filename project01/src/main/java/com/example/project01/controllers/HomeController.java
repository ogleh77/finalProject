package com.example.project01.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HomeController {
    @FXML
    private BorderPane borderPane;

    @FXML
    void openHandler(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/registration/reg.fxml"));
        borderPane.setCenter(anchorPane);

    }
}
