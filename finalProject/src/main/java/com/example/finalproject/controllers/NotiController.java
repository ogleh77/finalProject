package com.example.finalproject.controllers;

import animatefx.animation.FadeIn;
import com.example.finalproject.actors.Costumers;
import com.example.finalproject.model.Model;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NotiController implements Initializable {

    @FXML
    private VBox outdatedPane;
    private Model model;
    FXMLLoader loader = null;
    private BorderPane borderPane;
    private StackPane st;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            for (Costumers costumer : model.getOutDatedCostumers()) {
                loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/outdated.fxml"));
                HBox hBox = null;
                try {
                    hBox = loader.load();
                    OutatedController controller = loader.getController();
                    controller.setCostumer(costumer,borderPane, st);
                    new FadeIn(hBox).play();
                    outdatedPane.getChildren().add(hBox);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }

    public void setModel(Model model,BorderPane borderPane, StackPane stackPane) {
        this.model = model;
        this.borderPane = borderPane;
        this.st = stackPane;
    }
}
