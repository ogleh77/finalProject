package com.example.jfx.controllers;

import animatefx.animation.SlideOutLeft;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private BorderPane borderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setPane(BorderPane borderPane) {
        this.borderPane = borderPane;
    }
    @FXML
    void backtoHomeHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/jfx/hello-view.fxml"));
        BorderPane pane = (BorderPane) loader.load();
        borderPane.setCenter(pane);
    }

}
