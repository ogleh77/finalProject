package com.example.finalproject.controllers;

import com.example.finalproject.actors.Costumers;
import com.example.finalproject.generalclasses.Generalize;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentsController extends Generalize implements Initializable {
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
    private ComboBox<String> paidby;

    @FXML
    private TextField phone;

    @FXML
    private JFXCheckBox poxing;

    @FXML
    private ComboBox<String> shift;

    @FXML
    private TextField weight;

    @FXML
    private ComboBox<String> weight_type;

    @FXML
    private JFXCheckBox yes_discount;
    @FXML
    private ImageView imgView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setCostumer(Costumers costumer) {
        firstname.setText(costumer.getFirstName());
        lastname.setText(costumer.getLasttName());
        phone.setText(costumer.getPhone());
        amountPaid.setText(String.valueOf(costumer.getPaid()));
        paidby.setValue(costumer.getPaidBy());
        shift.setValue(costumer.getShift());
        poxing.setSelected(costumer.isPoxing());
        if (costumer.getGender().equals("male")) {
            male.setSelected(true);
        } else {
            female.setSelected(true);
        }
       // System.out.println(costumer.getImage());
        if (costumer.getImage() == null||costumer.getImage().equals("")) {
            imgView.setImage(null);
        } else {
            imgView.setImage(new Image(costumer.getImage()));
        }

    }
}
