package com.example.gymproject.controllers;

import com.example.gymproject.model.CostumersModel;
import com.example.gymproject.model.Database;
import com.example.gymproject.model.Model;
import com.example.gymproject.model.UsersModel;
import com.example.gymproject.interfaces.CostumerModel;
import com.example.gymproject.objectors.Costumer;
import com.example.gymproject.objectors.Users;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            UsersModel model = new UsersModel();
            //System.out.println(model.getActiveCostumers());
            System.out.println(model.getAllUsers());

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
/*Database database = new Database();
        Costumer costumer = new Costumer(104, "Mohamed", "Ogleh", "484839", "Male", "Night", 10.0, 0,
                "Zaad service", 102);
        Costumer updated = new Costumer(204, "Jamac", "Khadar", "8957394", "Male", "Night", 12.0, 1,
                "eDahab", 102);
        try {
            // database.saveCostumer(costumer);

            UsersModel model = new UsersModel();
            CostumerModel costumerModel = new CostumersModel();
//            costumerModel.addCostumer(costumer);
//            costumerModel.updateCostumer(updated);
            //costumerModel.deleteCostumer(updated.getCostumerId());
            //System.out.println(costumerModel.getCostumer(201));
           // System.out.println(costumerModel.getAllCostumers());
            // model.saveUser(new Users(0,"Aar","yuufu","6788","Male","Morning","deeql","12345",true));
            //model.getAllUsers();
            // System.out.println(model.getUsers(101));

             model.updateUser(new Users(101, "Nuur", "Ali", "4747383", "Male", "Afternoon", "nuurka", "54321", false));
        } catch (SQLException e) {
            e.printStackTrace();
        }*/