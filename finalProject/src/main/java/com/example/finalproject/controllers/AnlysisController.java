package com.example.finalproject.controllers;

import com.example.finalproject.model.Model;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

public class AnlysisController implements Initializable {
    @FXML
    private PieChart activePiechart;
    private Model model;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Platform.runLater(() -> {
            ObservableList<PieChart.Data> activePiechartList = FXCollections.observableArrayList(

                    new PieChart.Data("Active users", model.getActiveCostumers().size()),
                    new PieChart.Data("Outdated users", model.getOutDatedCostumers().size())
            );
            activePiechart.setData(activePiechartList);
        });

    }


    public void setModel(Model model) {
        this.model = model;
    }
}
