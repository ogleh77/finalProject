package com.example.finalproject.controllers;

import animatefx.animation.FadeIn;
import animatefx.animation.FadeInDown;
import animatefx.animation.SlideInRight;
import com.example.finalproject.actors.Costumers;
import com.example.finalproject.model.Model;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OutatedController {

    @FXML
    private Label date;

    @FXML
    private Circle outImage;

    @FXML
    private Label username;
    private Costumers costumer;
    private BorderPane borderPane;
    private StackPane st;

    public void setCostumer(Costumers costumer, BorderPane borderPane, StackPane stackPane) {
        this.costumer = costumer;
        this.borderPane = borderPane;
        this.st = stackPane;
        username.setText(costumer.getFirstName());
        date.setText("date");
    }


    @FXML
    void renewHandler(ActionEvent event) throws IOException {
        if (st.getChildren().size() > 1) {
            st.getChildren().remove(1);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/description.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
//            PaymentsController controller = loader.getController();
//            controller.setCostumer(costumer);
            new FadeIn(anchorPane).play();

            st.getChildren().add(anchorPane);
        }

    }
}


