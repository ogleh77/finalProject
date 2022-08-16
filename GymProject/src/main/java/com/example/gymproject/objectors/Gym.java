package com.example.gymproject.objectors;

import javafx.beans.property.*;

public class Gym {

    private final StringProperty gymName;
    private final DoubleProperty poxingCost;
    private final DoubleProperty fitnessCost;

    public Gym(String gymName, double poxingCost, double fitnessCost) {
        this.gymName = new SimpleStringProperty(gymName);
        this.poxingCost = new SimpleDoubleProperty(poxingCost);
        this.fitnessCost = new SimpleDoubleProperty(fitnessCost);
    }


    public String getGymName() {
        return gymName.get();
    }

    public StringProperty gymNameProperty() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName.set(gymName);
    }

    public double getPoxingCost() {
        return poxingCost.get();
    }

    public DoubleProperty poxingCostProperty() {
        return poxingCost;
    }

    public void setPoxingCost(double poxingCost) {
        this.poxingCost.set(poxingCost);
    }

    public double getFitnessCost() {
        return fitnessCost.get();
    }

    public DoubleProperty fitnessCostProperty() {
        return fitnessCost;
    }

    public void setFitnessCost(double fitnessCost) {
        this.fitnessCost.set(fitnessCost);
    }

    @Override
    public String toString() {
        return "Gym{" +
                ", gymName=" + gymName +
                ", poxingCost=" + poxingCost +
                ", fitnessCost=" + fitnessCost +
                '}';
    }
}
