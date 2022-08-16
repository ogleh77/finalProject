package com.example.finalproject.controllers;

import com.example.finalproject.actors.Costumers;
import com.example.finalproject.actors.Gym;
import com.example.finalproject.generalclasses.Generalize;
import com.example.finalproject.model.Model;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController extends Generalize implements Initializable {

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
    private Model model;
    private File selectedFile;
//    private Gym gym;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shift.setItems(getShift());
        paidby.setItems(getPaidBy());
        weight_type.setItems(getWeight());
    }

    public void setCostumers(Model model) {
        this.model = model;
        System.out.println(model.getActiveCostumers().size() + "Costimers");
    }

    @FXML
    void clearHandler(ActionEvent event) {

    }

    @FXML
    void saveHandler(ActionEvent event) {

        //Gym materials are neeeded
        //Wich selected...................
        selected(male, female);
        isPoxing(poxing);


        Costumers costumer = new Costumers(105, firstname.getText(), lastname.getText(), phone.getText(), getGender(),
                shift.getValue(), 12, 0, paidby.getValue(), selectedFile.getPath(), isPoxing(poxing), 102);
        FileChooser chooser = new FileChooser();
        selectedFile = chooser.showOpenDialog(null);
        imgView.setImage(new Image(selectedFile.getPath()));
        model.getActiveCostumers().add(costumer);
        System.out.println(model.getActiveCostumers().size() + " now ");
        for (Costumers costumers : model.getActiveCostumers()) {
            System.out.println(costumers + "\n");
        }
        System.out.println("Selected file " + selectedFile);
    }

    @FXML
    void uploadHandler(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        selectedFile = chooser.showOpenDialog(null);
        imgView.setImage(new Image(selectedFile.getPath()));
    }
}
