package com.example.gymproject.interfaces;

import com.example.gymproject.objectors.Costumer;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface CostumerModel {

    void addCostumer(Costumer costumer) throws SQLException;

    void updateCostumer(Costumer costumer) throws SQLException;

    void deleteCostumer(int id) throws SQLException;
    Costumer getCostumer(int id)throws SQLException ;

    ObservableList<Costumer> getAllCostumers() throws SQLException;
}
