package com.example.gymproject.model;

import com.example.gymproject.objectors.Costumer;
import com.example.gymproject.objectors.Gym;
import com.example.gymproject.objectors.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class Model {
    private UsersModel usersModel;
    private CostumersModel costumersModel;
    private ObservableList<Costumer> activeCostumers;
    private ObservableList<Costumer> outDatedCostumers;
    private Users user;
    private Gym gym = null;

    public Model() throws SQLException {
        this.usersModel = new UsersModel();
        this.costumersModel = new CostumersModel();
        this.activeCostumers = costumersModel.getAllCostumers();

    }

    public UsersModel getUsersModel() {
        return usersModel;
    }

    public void setUsersModel(UsersModel usersModel) {
        this.usersModel = usersModel;
    }

    public CostumersModel getCostumersModel() {
        return costumersModel;
    }

    public void setCostumersModel(CostumersModel costumersModel) {
        this.costumersModel = costumersModel;
    }

    public ObservableList<Costumer> getActiveCostumers() {
        return activeCostumers;
    }

    public void setActiveCostumers(ObservableList<Costumer> activeCostumers) {
        this.activeCostumers = activeCostumers;
    }

    public ObservableList<Costumer> getOutDatedCostumers() {
        return outDatedCostumers;
    }

    public void setOutDatedCostumers(ObservableList<Costumer> outDatedCostumers) {
        this.outDatedCostumers = outDatedCostumers;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
