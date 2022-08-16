package com.example.gymproject.controllers;

import com.example.gymproject.model.Model;
import com.example.gymproject.objectors.Users;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private Users user;
    private Model model;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("In home...");

    }

    public void setModel(Model model) {
        this.model = model;
        //  System.out.println(model.getActiveCostumers());
    }

    public void setUser(Users user) {
        System.out.println("Called home user");
        this.user = user;
        //System.out.println(user);

    }
}
