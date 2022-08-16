package com.example.gymproject.objectors;

import javafx.beans.property.*;

public class Costumer {
    private final IntegerProperty costumerId;
    private final StringProperty firstName;
    private final StringProperty lasttName;
    private final StringProperty phone;
    private final StringProperty gender;
    private final StringProperty shift;
    private final DoubleProperty paid;
    private final DoubleProperty discount;
    private final StringProperty paidBy;
    private final IntegerProperty whoAdded;

    public Costumer(int costumerId, String firstName, String lasttName, String phone, String gender, String shift, double paid, double discount, String paidBy, int whoAdded) {
        this.costumerId = new SimpleIntegerProperty(costumerId);
        this.firstName = new SimpleStringProperty(firstName);
        this.lasttName = new SimpleStringProperty(lasttName);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
        this.shift = new SimpleStringProperty(shift);
        this.paid = new SimpleDoubleProperty(paid);
        this.discount = new SimpleDoubleProperty(discount);
        this.paidBy = new SimpleStringProperty(paidBy);
        this.whoAdded = new SimpleIntegerProperty(whoAdded);

    }

    public int getCostumerId() {
        return costumerId.get();
    }

    public IntegerProperty costumerIdProperty() {
        return costumerId;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId.set(costumerId);
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

    public String getShift() {
        return shift.get();
    }

    public StringProperty shiftProperty() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift.set(shift);
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

    public double getDiscount() {
        return discount.get();
    }

    public DoubleProperty discountProperty() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount.set(discount);
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


    public int getWhoAdded() {
        return whoAdded.get();
    }

    public IntegerProperty whoAddedProperty() {
        return whoAdded;
    }

    public void setWhoAdded(int whoAdded) {
        this.whoAdded.set(whoAdded);
    }

    @Override
    public String toString() {
        return "" + "firstName:" + firstName + ", lasttName:" + lasttName + ", phone:" + phone + ", gender:" + gender + ", shift:" + shift + ", paid:" + paid + ", discount:" + discount + ", paidBy:" + paidBy +

                ", whoAdded:" + whoAdded + "\n";
    }
}

