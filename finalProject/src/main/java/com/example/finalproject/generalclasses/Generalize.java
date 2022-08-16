package com.example.finalproject.generalclasses;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public abstract class Generalize {
    final String MALE = "male";
    final String FEMALE = "female";
    private String gender = "";

    final boolean POXING = true;
    private final ObservableList<String> shift;
    private final ObservableList<String> paidBy;
    private final ObservableList<String> weight;

    public Generalize() {
        shift = FXCollections.observableArrayList();
        paidBy = FXCollections.observableArrayList();
        weight = FXCollections.observableArrayList();
        shift.addAll("Morning", "Noon", "Afternoon", "Night");
        paidBy.addAll("eDahab", "Zaad service");
        weight.addAll("KG", "lbs");

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
}
