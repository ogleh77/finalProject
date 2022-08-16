package com.example.myproject.controllers;

import com.example.myproject.generalize.Generalize;
import com.example.myproject.interfaces.CostumersModel;
import com.example.myproject.model.CostumerModel;
import com.example.myproject.model.Model;
import com.example.myproject.objects.Costumers;
import com.example.myproject.objects.Users;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegistrationController extends Generalize implements Initializable {
    private Model model;
    private Users activeUser;
    private CostumersModel costumersModel;
    private File selectedFile = null;

    public RegistrationController() {
        this.costumersModel = new CostumerModel();
    }

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        weight_type.setItems(getWeight());
        paidby.setItems(getPaidBy());
        shift.setItems(getShift());
    }

    @FXML
    void clearHandler(ActionEvent event) {

    }

    @FXML
    void saveHandler(ActionEvent event) throws SQLException {
        selected(male, female);
        isPoxing(poxing);
        Costumers costumer = new Costumers(0, firstname.getText(), lastname.getText(), phone.getText(), getGender(),
                shift.getValue(), 12, 0, paidby.getValue(), selectedFile.getPath(), isPoxing(poxing), activeUser.getUsername(), null, null);
        try {
            costumersModel.addCostumer(costumer);
            getAlert(Alert.AlertType.INFORMATION, "Costumer saved ", activeUser.getUsername() + " you seccessfuly saved ");
        } catch (Exception e) {
            getAlert(Alert.AlertType.ERROR, "Something gone wrong", e.getMessage());
        }

    }

    @FXML
    void uploadHandler(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        selectedFile = chooser.showOpenDialog(null);
        imgView.setImage(new Image(selectedFile.getPath()));
    }

    public void setModel(Users activeUsers, Model model) {
        this.activeUser = activeUsers;
        this.model = model;
    }

    public ObservableList<Control> validation() {
        ObservableList<Control> controls = FXCollections.observableArrayList();

        controls.addAll(firstname, lastname, phone, weight);
        return controls;
    }
}
