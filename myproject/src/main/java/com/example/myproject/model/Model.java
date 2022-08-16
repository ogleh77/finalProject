package com.example.myproject.model;

import animatefx.animation.FadeOut;
import com.example.myproject.controllers.DashboardController;
import com.example.myproject.controllers.SplashController;
import com.example.myproject.objects.Costumers;
import com.example.myproject.objects.TempCostumer;
import com.example.myproject.objects.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Model extends Task<Void> {
    int count = 0;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;
    int i = 0;
    private ObservableList<Costumers> activeCostumers;
    private ObservableList<Costumers> outDatedCostumers;
    private ObservableList<TempCostumer> tempCostumers;
    private ObservableList<Users> users;
    private SimpleDateFormat df;
    private UserModel userModel;

    public Model() throws Exception {
        this.activeCostumers = FXCollections.observableArrayList();
        this.outDatedCostumers = FXCollections.observableArrayList();
        this.tempCostumers = FXCollections.observableArrayList();
        this.df = new SimpleDateFormat("yyyy-MM-dd");
        this.userModel = new UserModel();
        Connection con = null;
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:src/database/db");
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * FROM costumers");
        while (rs.next()) {
            count++;
        }

        con.close();
        rs.close();
        statement.close();

    }

    @Override
    protected Void call() throws Exception {
        con = null;
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:src/database/db");
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * FROM costumers");
        try {

            while (rs.next()) {
                i++;

                updateMessage(i + " / " + count);
                updateProgress(i, count);
                Costumers costumer = new Costumers(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7),
                        rs.getDouble(8), rs.getString(9), null, rs.getBoolean(11),
                        rs.getString(12), rs.getString(13), rs.getString(14));
                if (costumer.getExpDate().compareTo(df.format(new Date())) < 0) {
                    this.outDatedCostumers.add(costumer);
                } else {
                    this.activeCostumers.add(costumer);
                }
                Thread.sleep(10);

            }


            con.close();
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public ObservableList<Costumers> getActiveCostumers() {
        return activeCostumers;
    }

    public void setActiveCostumers(ObservableList<Costumers> activeCostumers) {
        this.activeCostumers = activeCostumers;
    }

    public ObservableList<Costumers> getOutDatedCostumers() {
        return outDatedCostumers;
    }

    public void setOutDatedCostumers(ObservableList<Costumers> outDatedCostumers) {
        this.outDatedCostumers = outDatedCostumers;
    }

    public ObservableList<Users> getUsers() {
        return users;
    }

    public void setUsers(ObservableList<Users> users) {
        this.users = users;
    }
}
