package com.example.project;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label txtdis;
    @FXML
    private Label txtdis2;
    @FXML
    private TextField txtadd;
    //    Person person = new Person("Thread 1");
    Connection con = null;
    Statement st = null;

    public HelloController() throws SQLException {

        System.out.println("called...");
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:src/database/test.db");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    @FXML
    void beginHandler(ActionEvent event) throws SQLException {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}