package com.example.myproject.interfaces;

import com.example.myproject.objects.Costumers;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface CostumersModel {

    void addCostumer(Costumers costumer) throws SQLException;

    void updateCostumer(Costumers costumer);

    void DeleteCostumer(Costumers costumer);

    Costumers getCostumer(Costumers costumer);

    ObservableList<Costumers> getCostumers();
}
