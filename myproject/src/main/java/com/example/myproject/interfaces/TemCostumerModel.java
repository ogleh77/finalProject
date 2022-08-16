package com.example.myproject.interfaces;

import com.example.myproject.objects.TempCostumer;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface TemCostumerModel {
    void addTempCostumer(TempCostumer tempCostumer) throws SQLException;

    ObservableList<TempCostumer> getAllTemp() throws SQLException;

    void deleteTempCostumer(TempCostumer tempCostumer);
}
