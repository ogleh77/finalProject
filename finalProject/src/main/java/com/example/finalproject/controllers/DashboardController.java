package com.example.finalproject.controllers;

import animatefx.animation.SlideInDown;
import animatefx.animation.SlideInUp;
import com.example.finalproject.actors.Costumers;
import com.example.finalproject.model.Model;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private TableColumn<Costumers, Integer> costId;

    @FXML
    private TableColumn<Costumers, Double> discount;

    @FXML
    private TableColumn<Costumers, JFXButton> edit;

    @FXML
    private TableColumn<Costumers, String> fullName;

    @FXML
    private TableColumn<Costumers, String> lasname;
    @FXML
    private TableColumn<Costumers, String> gender;

    @FXML
    private TableColumn<Costumers, JFXButton> info;

    @FXML
    private TableColumn<Costumers, Double> paid;

    @FXML
    private TableColumn<Costumers, String> paidby;

    @FXML
    private TableColumn<Costumers, String> phone;

    @FXML
    private TableColumn<Costumers, String> shift;

    @FXML
    private TableView<Costumers> tbView;

    @FXML
    private TextField search;
    private Model model;
    private BorderPane borderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //  System.out.println(activeCostumers.size());

        Platform.runLater(() -> {
            System.out.println(model.getActiveCostumers().size());
            costId.setCellValueFactory(new PropertyValueFactory<Costumers, Integer>("costumerId"));
            fullName.setCellValueFactory(new PropertyValueFactory<Costumers, String>("firstName"));
            lasname.setCellValueFactory(new PropertyValueFactory<Costumers, String>("lasttName"));
            phone.setCellValueFactory(new PropertyValueFactory<Costumers, String>("phone"));
            gender.setCellValueFactory(new PropertyValueFactory<Costumers, String>("gender"));
            shift.setCellValueFactory(new PropertyValueFactory<Costumers, String>("shift"));
            paid.setCellValueFactory(new PropertyValueFactory<Costumers, Double>("paid"));
            discount.setCellValueFactory(new PropertyValueFactory<Costumers, Double>("discount"));
            paidby.setCellValueFactory(new PropertyValueFactory<Costumers, String>("paidBy"));
            info.setCellValueFactory(new PropertyValueFactory<Costumers, JFXButton>("infoBtn"));
            edit.setCellValueFactory(new PropertyValueFactory<Costumers, JFXButton>("editBtn"));

            tbView.setItems(model.getActiveCostumers());

            for (Costumers costumer : model.getActiveCostumers()) {

                 costumer.getInfoBtn().setOnAction(e -> {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Are you sure wanna delete " + costumer.getFirstName() + " " + costumer.getLasttName());
                    alert.setTitle("Warning");
                    alert.showAndWait();
                });
                break;
            }

            for (Costumers costumer : model.getActiveCostumers()) {
                System.out.println("inside uodahhh");
                costumer.getEditBtn().setOnAction(e -> {

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/finalproject/views/description.fxml"));
                    try {
                        AnchorPane anchorPane = (AnchorPane) loader.load();
//                        PaymentsController controller = loader.getController();
//                        controller.setCostumer(costumer);
                        new SlideInDown(borderPane).play();
                        borderPane.setCenter(anchorPane);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
                break;
            }
        });
//

    }

    public void setModel(Model model, BorderPane borderPane) {
        this.borderPane = borderPane;
        System.out.println(model.getActiveCostumers().size());

        this.model = model;
    }


    public void setClick(ActionEvent event) {
        for (Costumers costumer : model.getActiveCostumers()) {
            if (event.getSource() == costumer.getInfoBtn()) {
                costumer.getEditBtn().setOnAction(e -> {
                    System.out.println("inside info");
                });

            } else if (event.getSource() == costumer.getEditBtn()) {
                System.out.println("In delete btn");
            }
        }
    }
}
