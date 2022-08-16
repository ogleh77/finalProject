package com.example.gymv2.controllers;

import animatefx.animation.FadeInLeftBig;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideOutLeft;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private VBox sidePane;
    @FXML
    private BorderPane borderPane;

    @FXML
    private ImageView menuPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    borderPane.setLeft(null);
//        FadeInLeftBig fadeInUpBig = new FadeInLeftBig(notiCircle);
//        fadeInUpBig.setCycleCount(10);
//        fadeInUpBig.setDelay(Duration.millis(100));
//        fadeInUpBig.play();
    }

    @FXML
    void openSideHandler(MouseEvent event) {
        if (borderPane.getLeft() == null) {
            new SlideInLeft(sidePane).play();
            borderPane.setLeft(sidePane);
        } else {
            SlideOutLeft slideOutLeft = new SlideOutLeft(sidePane);
            slideOutLeft.play();
            slideOutLeft.setOnFinished(e -> {
                borderPane.setLeft(null);
            });

        }


    }
    @FXML
    void homeOpenHandler(ActionEvent event) {

    }

    @FXML
    void monthlyRegHandler(ActionEvent event) {

    }

    @FXML
    void shortlyRegHandler(ActionEvent event) {

    }


}
