package com.example.myproject.objects;

import javafx.beans.property.*;

public class TempCostumer {
    private final StringProperty firstName;
    private final StringProperty lasttName;
    private final StringProperty phone;
    private final StringProperty gender;
    private final DoubleProperty paid;
    private final StringProperty paidBy;
    private final BooleanProperty poxing;
    private final StringProperty timeJoined;
    private final StringProperty expTime;


    public TempCostumer(String firstName, String lasttName, String phone, String gender, double paid, String paidBy, boolean poxing,String timeJoined, String expTime) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lasttName = new SimpleStringProperty(lasttName);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
        this.paid = new SimpleDoubleProperty(paid);
        this.paidBy = new SimpleStringProperty(paidBy);
        this.poxing=new SimpleBooleanProperty(poxing);
        this.timeJoined = new SimpleStringProperty(timeJoined);
        this.expTime = new SimpleStringProperty(expTime);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLasttName() {
        return lasttName.get();
    }

    public StringProperty lasttNameProperty() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName.set(lasttName);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getGender() {
        return gender.get();
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public double getPaid() {
        return paid.get();
    }

    public DoubleProperty paidProperty() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid.set(paid);
    }

    public String getPaidBy() {
        return paidBy.get();
    }

    public StringProperty paidByProperty() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy.set(paidBy);
    }

    public String getTimeJoined() {
        return timeJoined.get();
    }

    public StringProperty timeJoinedProperty() {
        return timeJoined;
    }

    public void setTimeJoined(String timeJoined) {
        this.timeJoined.set(timeJoined);
    }

    public String getExpTime() {
        return expTime.get();
    }

    public StringProperty expTimeProperty() {
        return expTime;
    }

    public void setExpTime(String expTime) {
        this.expTime.set(expTime);
    }

    public boolean isPoxing() {
        return poxing.get();
    }

    public BooleanProperty poxingProperty() {
        return poxing;
    }

    public void setPoxing(boolean poxing) {
        this.poxing.set(poxing);
    }

    @Override
    public String toString() {
        return "TempCostumer{" +
                "firstName=" + firstName +
                ", lasttName=" + lasttName +
                ", phone=" + phone +
                ", gender=" + gender +
                ", paid=" + paid +
                ", paidBy=" + paidBy +
                ", isPoxing=" + poxing +
                ", timeJoined=" + timeJoined +
                ", expTime=" + expTime +
                '}';
    }
}


