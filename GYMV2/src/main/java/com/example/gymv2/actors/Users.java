package com.example.gymv2.actors;

import javafx.beans.property.*;


public class Users {
    private  IntegerProperty userId;
    private final StringProperty firstName;
    private final StringProperty lasttName;
    private final StringProperty phone;
    private final StringProperty gender;
    private final StringProperty shift;
    private final StringProperty username;
    private final StringProperty password;
    private final BooleanProperty isAdmin;

    public Users(int userId, String firstName, String lasttName, String phone, String gender, String shift, String username, String password, boolean isAdmin) {
        this.userId = new SimpleIntegerProperty(userId);
        this.firstName = new SimpleStringProperty(firstName);
        this.lasttName = new SimpleStringProperty(lasttName);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
        this.shift = new SimpleStringProperty(shift);
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.isAdmin = new SimpleBooleanProperty(isAdmin);


    }

    public Users(String firstName, String lasttName, String phone, String gender, String shift, String username, String password, boolean isAdmin) {
        // this.userId = new SimpleIntegerProperty(userId);
        this.firstName = new SimpleStringProperty(firstName);
        this.lasttName = new SimpleStringProperty(lasttName);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
        this.shift = new SimpleStringProperty(shift);
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.isAdmin = new SimpleBooleanProperty(isAdmin);


    }

    public int getuserId() {
        return userId.get();
    }

    public IntegerProperty userIdProperty() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId.set(userId);
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

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public boolean isIsAdmin() {
        return isAdmin.get();
    }

    public BooleanProperty isAdminProperty() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin.set(isAdmin);
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName=" + firstName +
                ", lasttName=" + lasttName +
                ", phone=" + phone +
                ", gender=" + gender +
                ", shift=" + shift +
                ", username=" + username +
                ", password=" + password +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
