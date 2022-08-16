package com.example.jfx.controllers;

import animatefx.animation.SlideInRight;
import animatefx.animation.SlideOutLeft;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class RegistrationControllers {
    @FXML
    private TextField amountPaid;

    @FXML
    private JFXButton clear;

    @FXML
    private TextField discount;

    @FXML
    private JFXRadioButton female;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private JFXRadioButton male;

    @FXML
    private ComboBox<?> paidby;

    @FXML
    private TextField phone;

    @FXML
    private JFXCheckBox poxing;

    @FXML
    private ComboBox<?> shift;

    @FXML
    private TextField weight;

    @FXML
    private ComboBox<?> weight_type;

    @FXML
    private JFXCheckBox yes_discount;
    @FXML
    private AnchorPane regPane;
    private BorderPane borderPane;

    public void setPane(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @FXML
    void backtoHomeHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/jfx/hello-view.fxml"));
        BorderPane pane = (BorderPane) loader.load();
        new SlideOutLeft(regPane).play();
        borderPane.setCenter(pane);
    }
}
