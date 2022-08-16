package com.example.myproject.controllers;

import com.example.myproject.model.Model;
import com.example.myproject.objects.Costumers;
import com.example.myproject.objects.Users;
import com.jfoenix.controls.JFXRadioButton;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoanController implements Initializable {
    @FXML
    private TextField amount;

    @FXML
    private ComboBox<String> chooseMember;

    @FXML
    private JFXRadioButton edahab;

    @FXML
    private TextField gaverName;

    @FXML
    private TextField phone;

    @FXML
    private TextField takername;

    @FXML
    private TextArea txtdispaly;

    @FXML
    private JFXRadioButton zaad;

    private Model model;
    private Users activeUser;
    private ObservableList<String> usernames;

    public LoanController() {
        this.usernames = FXCollections.observableArrayList();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Platform.runLater(() -> {
            gaverName.setText(activeUser.getUsername());
        });
    }

    @FXML
    void submiHandler(ActionEvent event) {


    }

    public void setModel(Users active, Model model) {
        this.activeUser = active;
        for (Users user : model.getUsers()) {
            usernames.add(user.getUsername());
        }
        usernames.add("other");
        chooseMember.setItems(usernames);
    }

    @FXML
    void choosedHandler(ActionEvent event) {
        if (!chooseMember.getValue().equalsIgnoreCase("other")) {
            phone.setText(null);
            amount.setText(null);
            takername.setText(null);
            zaad.setSelected(false);
            edahab.setSelected(false);

            for (Users user : model.getUsers()) {
                if (user.getUsername().equals(chooseMember.getValue())) {
                    takername.setText(user.getFirstName());
                    phone.setText(user.getPhone());
                }
            }
        } else {
            phone.setText(null);
            amount.setText(null);
            takername.setText(null);
            zaad.setSelected(false);
            edahab.setSelected(false);
            phone.setEditable(true);
            takername.setEditable(true);
        }

    }

//    @FXML
//    void choosedCombo(ActionEvent event) {
//        gaverName.setText("Mohamed");
//        if (!userCombo.getValue().equals("other")) {
//            sentNumber.setDisable(true);
//            takerName.setDisable(true);
//            sentNumber.setText(null);
//            takerName.setText(null);
//            for (Costumers costumers : model.getActiveCostumers()) {
//                if (costumers.getFirstName().equals(userCombo.getValue())) {
//                    takerName.setText(costumers.getFirstName());
//                    sentNumber.setText(costumers.getPhone());
//
//                }
//            }
//        } else {
//            sentNumber.setText(null);
//            takerName.setText(null);
//            sentNumber.setDisable(false);
//            takerName.setDisable(false);
//
//        }
//
//    }
}
