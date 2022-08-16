package com.example.finalproject.controllers;

import animatefx.animation.*;
import com.example.finalproject.HelloApplication;
import com.example.finalproject.actors.Loan;
import com.example.finalproject.model.Model;
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
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private StackPane stack;

    @FXML
    private BorderPane borderPane;

    @FXML
    private VBox menuPane;

    @FXML
    private VBox sidePane;
    @FXML
    private Circle notiCircle;

    @FXML
    private Label notiCount;
    boolean isSideOpen = false;
    private Model model;

    public HomeController() {
        this.model = new Model();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        borderPane.setLeft(null);
        FadeInLeftBig fadeInUpBig = new FadeInLeftBig(notiCircle);
        fadeInUpBig.setCycleCount(10);
        fadeInUpBig.setDelay(Duration.millis(100));
        fadeInUpBig.play();

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
    void homeOpenHandler(ActionEvent event) throws IOException {
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/dashboard.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
            DashboardController controller = loader.getController();
            controller.setModel(model, borderPane);

            SlideInRight slideInRight = new SlideInRight(anchorPane);
            slideInRight.play();
            borderPane.setCenter(anchorPane);
        }
    }

    @FXML
    void monthlyRegHandler(ActionEvent event) throws IOException {
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/registrations.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
            RegistrationController controller = loader.getController();
            controller.setCostumers(model);
            SlideInRight slideInRight = new SlideInRight(anchorPane);
            slideInRight.play();
            borderPane.setCenter(anchorPane);
        }
    }

    @FXML
    void shortlyRegHandler(ActionEvent event) throws IOException {
        //Anlysis
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/shortTime.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
//            AnlysisController controller = loader.getController();
//            controller.setModel(model);
            new FadeIn(anchorPane).play();


            stack.getChildren().add(anchorPane);
        }

    }

    @FXML
    void loanHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/loan.fxml"));
        AnchorPane anchorPane = (AnchorPane) loader.load();
        LoanController controller = loader.getController();
        controller.setActiveUser(model);
        new FadeIn(anchorPane).play();
        //borderPane.setCenter(anchorPane);
        stack.getChildren().add(anchorPane);
    }

    @FXML
    void outdatedHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/notifications.fxml"));
        AnchorPane anchorPane = (AnchorPane) loader.load();
        NotiController controller = loader.getController();
        controller.setModel(model, borderPane, stack);
        new FadeIn(anchorPane).play();
        //borderPane.setCenter(anchorPane);
        stack.getChildren().add(anchorPane);
    }
}
