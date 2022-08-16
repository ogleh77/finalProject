package com.example.myproject.controllers;

import animatefx.animation.FadeIn;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInRight;
import animatefx.animation.SlideOutLeft;
import com.example.myproject.model.Model;
import com.example.myproject.objects.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private BorderPane borderPane;

    @FXML
    private VBox menuPane;

    @FXML
    private VBox sidePane;

    @FXML
    private StackPane stack;

    @FXML
    private Label username;
    private Model model;
    private Users activeUser;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        borderPane.setLeft(null);
    }

    public void setModel(Model model, Users users) {
        this.activeUser = users;
        username.setText(users.getUsername());
        System.out.println("Active size " + model.getActiveCostumers().size());
        System.out.println("nonActive size " + model.getOutDatedCostumers().size());
        System.out.println(model.getOutDatedCostumers());
    }

    @FXML
    void homeOpenHandler(ActionEvent event) {

    }

    @FXML
    void monthlyRegHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/myproject/views/registrations.fxml"));
        AnchorPane anchorPane;
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(1);

            anchorPane = loader.load();
            RegistrationController controller = loader.getController();
            controller.setModel(activeUser, model);
            SlideInRight slideInRight = new SlideInRight(anchorPane);
            slideInRight.play();
            borderPane.setCenter(anchorPane);
        } else {
            anchorPane = loader.load();
            RegistrationController controller = loader.getController();
            controller.setModel(activeUser, model);
            SlideInRight slideInRight = new SlideInRight(anchorPane);
            slideInRight.play();
            borderPane.setCenter(anchorPane);
        }
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
            });

        }
    }

    @FXML
    void outdatedHandler(ActionEvent event) {

    }

    @FXML
    void shortlyRegHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/myproject/views/shortlyreg.fxml"));
        AnchorPane anchorPane = null;
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
            anchorPane = loader.load();
            new FadeIn(anchorPane).play();
            stack.getChildren().add(anchorPane);
        } else {
            anchorPane = loader.load();
            new FadeIn(anchorPane).play();
            stack.getChildren().add(anchorPane);
        }

    }

    @FXML
    void loanHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/myproject/views/loan.fxml"));
        AnchorPane anchorPane = null;

        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));

            anchorPane = loader.load();
            LoanController controller = loader.getController();
            controller.setModel(activeUser, model);
            new FadeIn(anchorPane).play();
            stack.getChildren().add(anchorPane);
        } else {
            anchorPane = loader.load();
            LoanController controller = loader.getController();
            controller.setModel(activeUser, model);
            new FadeIn(anchorPane).play();
            stack.getChildren().add(anchorPane);
        }
    }

}