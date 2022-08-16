package com.example.jfx;

import animatefx.animation.SlideInRight;
import com.example.jfx.controllers.HomeController;
import com.example.jfx.controllers.PaymentController;
import com.example.jfx.controllers.RegistrationControllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane homePane;

    @FXML
    void clickHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/jfx/registrations/regist.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        RegistrationControllers controllers = loader.getController();
        controllers.setPane(borderPane);
        new SlideInRight(pane).play();
        borderPane.setCenter(pane);
    }

    @FXML
    void paymentHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/jfx/payments/payments.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        PaymentController controllers = loader.getController();
        controllers.setPane(borderPane);
        new SlideInRight(pane).play();
        borderPane.setCenter(pane);
    }

    @FXML
    void homeHandler(ActionEvent event) throws IOException {
        //press setting button insha Allah
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/jfx/home/home.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        HomeController controllers = loader.getController();
        controllers.setPane(borderPane);
        new SlideInRight(pane).play();
        borderPane.setCenter(pane);
    }
}