package com.example.gymv2.models;

import com.example.gymv2.actors.Costumers;
import com.example.gymv2.actors.Gym;
import com.example.gymv2.actors.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private ObservableList<Costumers> activeCostumers;
    private ObservableList<Costumers> outDatedCostumers;
    private ObservableList<Users> users;
    private Users activeUser;
    private Gym gym;

    public Model() {
        this.activeCostumers = FXCollections.observableArrayList(getActive());
        this.outDatedCostumers = FXCollections.observableArrayList(getNonActive());
        this.gym = addGym();
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

    public Users getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(Users activeUser) {
        this.activeUser = activeUser;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    //------------------------------------Models-------------------------------------------
    private Gym addGym() {
        Gym gym = new Gym("Togdheer Gym Center", 3, 12);
        return gym;
    }

    private Users addUser() {
        Users user = new Users("Bashiir", "Ali", "4587584", "Male", "noon", "bashka", "1234", true);
        return user;
    }

    private ObservableList<Costumers> getActive() {
        ObservableList<Costumers> active = FXCollections.observableArrayList();
        Costumers costumer1 = new Costumers(102, "Mohamed", "Saeed", "474854", "Male", "Afternoon", 20, 0, "eDahab", "", true, 102);
        Costumers costumer2 = new Costumers(103, "Jamac", "Ali", "574738", "Male", "Afternoon", 20, 0, "Zaad Service", "", false, 102);
        Costumers costumer3 = new Costumers(104, "Layla", "Jama", "464738", "Female", "Night", 10, 3, "eDahab", "", true, 102);
        active.addAll(costumer1, costumer2, costumer3);
        return active;
    }

    private ObservableList<Costumers> getNonActive() {
        ObservableList<Costumers> nonActive = FXCollections.observableArrayList();
        Costumers costumer1 = new Costumers("Husein", "Abdirahman", "474854", "Male", "Afternoon", 20, 0, "eDahab", 102);
        Costumers costumer2 = new Costumers("Abdi", "Ali", "643786", "Male", "Afternoon", 20, 0, "Zaad Service", 102);
        Costumers costumer3 = new Costumers("Deka", "Muuse", "464738", "Female", "Night", 10, 3, "eDahab", 102);
        nonActive.addAll(costumer1, costumer2, costumer3);
        return nonActive;
    }

}
