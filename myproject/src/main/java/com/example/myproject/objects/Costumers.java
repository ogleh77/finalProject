package com.example.myproject.objects;

import com.jfoenix.controls.JFXButton;
import javafx.beans.property.*;

public class Costumers {
    private IntegerProperty costumerId;
    private final StringProperty firstName;
    private final StringProperty lasttName;
    private final StringProperty phone;
    private final StringProperty gender;
    private final StringProperty shift;
    private final DoubleProperty paid;
    private final DoubleProperty discount;
    private final StringProperty paidBy;
    private StringProperty image;
    private BooleanProperty poxing;
    private final StringProperty whoAdded;
    private SimpleStringProperty dateJoined;
    private StringProperty expDate;
    private JFXButton infoBtn;
    private JFXButton editBtn;
//
//    public Costumers(int costumerId, String firstName, String lasttName, String phone, String gender, String shift, double paid, double discount, String paidBy, String image, boolean isPoxing, String whoAdded) {
//        this.costumerId = new SimpleIntegerProperty(costumerId);
//        this.firstName = new SimpleStringProperty(firstName);
//        this.lasttName = new SimpleStringProperty(lasttName);
//        this.phone = new SimpleStringProperty(phone);
//        this.gender = new SimpleStringProperty(gender);
//        this.shift = new SimpleStringProperty(shift);
//        this.paid = new SimpleDoubleProperty(paid);
//        this.discount = new SimpleDoubleProperty(discount);
//        this.paidBy = new SimpleStringProperty(paidBy);
//        this.image = new SimpleStringProperty(image);
//        this.poxing = new SimpleBooleanProperty(isPoxing);
//        this.whoAdded = new SimpleStringProperty(whoAdded);
//        this.infoBtn = new JFXButton("Delete");
//        this.editBtn = new JFXButton("Edit");
//        infoBtn.setStyle("-fx-background-color: red;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
//        editBtn.setStyle("-fx-background-color: dodgerblue;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
//
//    }

    public Costumers(int costumerId, String firstName, String lasttName, String phone, String gender, String shift, double paid, double discount, String paidBy, String image, boolean isPoxing, String whoAdded, String dateJoined, String expDate) {
        this.costumerId = new SimpleIntegerProperty(costumerId);
        this.firstName = new SimpleStringProperty(firstName);
        this.lasttName = new SimpleStringProperty(lasttName);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
        this.shift = new SimpleStringProperty(shift);
        this.paid = new SimpleDoubleProperty(paid);
        this.discount = new SimpleDoubleProperty(discount);
        this.paidBy = new SimpleStringProperty(paidBy);
        this.image = new SimpleStringProperty(image);
        this.poxing = new SimpleBooleanProperty(isPoxing);
        this.whoAdded = new SimpleStringProperty(whoAdded);
        this.dateJoined = new SimpleStringProperty(dateJoined);
        this.expDate = new SimpleStringProperty(expDate);
        this.infoBtn = new JFXButton("Delete");
        this.editBtn = new JFXButton("Edit");
        infoBtn.setStyle("-fx-background-color: red;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
        editBtn.setStyle("-fx-background-color: dodgerblue;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
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

    public String getImage() {
        return image.get();
    }

    public StringProperty imageProperty() {
        return image;
    }

    public void setImage(String image) {
        this.image.set(image);
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

    public String getWhoAdded() {
        return whoAdded.get();
    }

    public StringProperty whoAddedProperty() {
        return whoAdded;
    }

    public void setWhoAdded(String whoAdded) {
        this.whoAdded.set(whoAdded);
    }

    public JFXButton getInfoBtn() {
        return infoBtn;
    }

    public void setInfoBtn(JFXButton infoBtn) {
        this.infoBtn = infoBtn;
    }

    public JFXButton getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(JFXButton editBtn) {
        this.editBtn = editBtn;
    }

    public String getDateJoined() {
        return dateJoined.get();
    }

    public SimpleStringProperty dateJoinedProperty() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined.set(dateJoined);
    }

    public String getExpDate() {
        return expDate.get();
    }

    public StringProperty expDateProperty() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate.set(expDate);
    }

    @Override
    public String toString() {
        return "Costumers{" +
                "costumerId=" + costumerId +
                ", firstName=" + firstName +
                ", lasttName=" + lasttName +
                ", phone=" + phone +
                ", gender=" + gender +
                ", shift=" + shift +
                ", paid=" + paid +
                ", discount=" + discount +
                ", paidBy=" + paidBy +
                ", image=" + image +
                ", poxing=" + poxing +
                ", whoAdded=" + whoAdded +
                ", infoBtn=" + infoBtn +
                ", editBtn=" + editBtn +
                '}';
    }
}
