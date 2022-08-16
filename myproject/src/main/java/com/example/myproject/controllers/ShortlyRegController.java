package com.example.myproject.controllers;

import com.example.myproject.generalize.Generalize;
import com.example.myproject.interfaces.TemCostumerModel;
import com.example.myproject.model.TempCostumerModel;
import com.example.myproject.objects.TempCostumer;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ShortlyRegController extends Generalize implements Initializable {
    @FXML
    private TextField amountPaid;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastName;

    @FXML
    private ComboBox<String> paidBy;

    @FXML
    private TextField phone;

    @FXML
    private JFXCheckBox poxing;
    @FXML
    private JFXRadioButton male;
    @FXML
    private JFXRadioButton female;
    private TemCostumerModel temCostumerModel;

    public ShortlyRegController() throws SQLException {
        this.temCostumerModel = new TempCostumerModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paidBy.setItems(getPaidBy());
    }

    @FXML
    void SubmitHandler(ActionEvent event) {
        selected(male, female);
        isPoxing(poxing);
        try {
            TempCostumer tempCostumer = new TempCostumer(firstname.getText(), lastName.getText(),
                    phone.getText(), getGender(), Double.parseDouble(amountPaid.getText()), paidBy.getValue(), isPoxing(poxing), null, null);
            temCostumerModel.addTempCostumer(tempCostumer);
            getAlert(Alert.AlertType.INFORMATION, "Short time Costumer", "Short time costumer added seccessfully");
            System.out.println(tempCostumer);
        } catch (Exception e) {
            getAlert(Alert.AlertType.ERROR, "Something went wrong", "Error! " + e.getMessage());
        }

    }
}
