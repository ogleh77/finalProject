package com.example.myproject.generalize;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Generalize {
    final String MALE = "male";
    final String FEMALE = "female";
    private String gender = "";

    final boolean POXING = false;
    private final ObservableList<String> shift;
    private final ObservableList<String> paidBy;
    private final ObservableList<String> weight;
    private SimpleDateFormat df;

    public Generalize() {
        shift = FXCollections.observableArrayList();
        paidBy = FXCollections.observableArrayList();
        weight = FXCollections.observableArrayList();
        shift.addAll("Morning", "Noon", "Afternoon", "Night");
        paidBy.addAll("eDahab", "Zaad service");
        weight.addAll("KG", "lbs");
        df = new SimpleDateFormat("yyyy-MM-dd");
        df.format(new Date());
    }

    public void selected(RadioButton radio1, RadioButton radio2) {
        if (radio1.isSelected()) {
            gender = MALE;

        } else if (radio2.isSelected()) {
            gender = FEMALE;
        }
    }

    public boolean isPoxing(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            return true;
        }
        return false;
    }

    public Alert getAlert(Alert.AlertType type, String title, String contant) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(contant);
        alert.showAndWait();

        return alert;
    }


    public String getGender() {
        return gender;
    }

    public ObservableList<String> getShift() {
        return shift;
    }

    public ObservableList<String> getPaidBy() {
        return paidBy;
    }

    public ObservableList<String> getWeight() {
        return weight;
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }
}
