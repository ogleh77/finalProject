package com.example.myproject.controllers;

import animatefx.animation.FadeOut;
import com.example.myproject.model.Model;
import com.example.myproject.objects.Users;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SplashController implements Initializable {
    @FXML
    private Label loading;

    @FXML
    private ProgressBar progres;

    @FXML
    private Circle userImage;

    @FXML
    private Label username;

    private Model model;
    private Users activeUser;

    public SplashController() throws Exception {
        this.model = new Model();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.setOnSucceeded(e -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/myproject/views/dashboard.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(loader.load());
                DashboardController controller = loader.getController();
                controller.setModel(model, activeUser);
                Stage dashboardStage = new Stage();
                dashboardStage.initStyle(StageStyle.UNDECORATED);
                dashboardStage.setScene(scene);
                FadeOut fadeOut = new FadeOut(progres.getParent());
                fadeOut.play();
                Stage splashSatge = (Stage) progres.getScene().getWindow();
                fadeOut.setOnFinished(b -> {
                    splashSatge.close();
                    dashboardStage.show();
                });

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

    }

    @FXML
    void logoutHandler(ActionEvent event) {

    }

    public void setActiveUser(Users activeUser) {
        this.activeUser = activeUser;
        Thread thread = new Thread(model);
        thread.setDaemon(true);
        thread.start();

        progres.progressProperty().bind(model.progressProperty());
        loading.textProperty().bind(model.messageProperty());
        username.setText("welcome " + activeUser.getUsername());
    }
}
