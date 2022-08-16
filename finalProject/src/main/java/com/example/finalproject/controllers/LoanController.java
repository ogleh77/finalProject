package com.example.finalproject.controllers;

import com.example.finalproject.actors.Costumers;
import com.example.finalproject.actors.Users;
import com.example.finalproject.generalclasses.Generalize;
import com.example.finalproject.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoanController extends Generalize implements Initializable {
    @FXML
    private TextField amount;

    @FXML
    private TextField giverName;

    @FXML
    private ComboBox<String> sentByCombo;

    @FXML
    private TextField sentNumber;

    @FXML
    private TextField takerName;

    @FXML
    private ComboBox<String> userCombo;
    private Model model;
    private ObservableList<String> usersName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.usersName = FXCollections.observableArrayList();
        sentByCombo.setItems(getPaidBy());

    }

    public void setActiveUser(Model model) {
        this.model = model;
        System.out.println(model.getActiveCostumers().size());

        for (Costumers user : model.getActiveCostumers()) {
            usersName.add(user.getFirstName());
        }
        usersName.add("other");
        userCombo.setItems(usersName);
    }

    @FXML
    void choosedCombo(ActionEvent event) {
        giverName.setText("Mohamed");
        if (!userCombo.getValue().equals("other")) {
            sentNumber.setDisable(true);
            takerName.setDisable(true);
            sentNumber.setText(null);
            takerName.setText(null);
            for (Costumers costumers : model.getActiveCostumers()) {
                if (costumers.getFirstName().equals(userCombo.getValue())) {
                    takerName.setText(costumers.getFirstName());
                    sentNumber.setText(costumers.getPhone());
                }
            }
        } else {
            sentNumber.setText(null);
            takerName.setText(null);
            sentNumber.setDisable(false);
            takerName.setDisable(false);

        }

    }
}
