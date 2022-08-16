package com.example.togheergym.controllers;

import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInRight;
import animatefx.animation.SlideOutLeft;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private BorderPane borderPane;

    @FXML
    private VBox sidePane;

    @FXML
    private AnchorPane homePane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        borderPane.setLeft(null);

        // homePane.setStyle("-fx-background-color: #abd711;");-fx-background-image: url('../../../../../resources/com/example/togheergym/images/bgImage.jpg')
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
                borderPane.getCenter().setStyle("-fx-background-repeat: no-repeat; -fx-background-size: 1057 626; -fx-background-position: center center;");
                //     homePane.setStyle("-fx-background-repeat: no-repeat; -fx-background-size: 1057 626; -fx-background-position: center center;");
            });
        }

    }

    @FXML
    void homeOpenHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/togheergym/views/home.fxml"));
        AnchorPane anchorPane = (AnchorPane) loader.load();
        HomeController controller = loader.getController();
//        controller.setModel(model, borderPane);
        controller.setModel(borderPane);
        SlideInRight slideInRight = new SlideInRight(anchorPane);
        slideInRight.play();
        borderPane.setCenter(anchorPane);

    }

    @FXML
    void monthlyRegHandler(ActionEvent event) {

    }

    @FXML
    void shortlyRegHandler(ActionEvent event) {

    }
}
