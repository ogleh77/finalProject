package com.example.design.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {

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
    private ImageView imgView;

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
    void clearHandler(ActionEvent event) {

    }

    @FXML
    void saveHandler(ActionEvent event) {

    }

    @FXML
    void setDiscount(ActionEvent event) {

    }

    @FXML
    void setPoxing(ActionEvent event) {

    }

    @FXML
    void uploadImageHandler(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
