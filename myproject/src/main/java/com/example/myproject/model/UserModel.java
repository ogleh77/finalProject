package com.example.myproject.model;

import com.example.myproject.interfaces.UsersModel;
import com.example.myproject.objects.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel extends Database implements UsersModel {
private ObservableList<Users>users;

    public UserModel() throws SQLException {
        this.users = FXCollections.observableArrayList(fetchAllUsers());
    }

    @Override
    public void addUser(Users user) {

    }

    @Override
    public void updateUser(Users user) {

    }

    @Override
    public boolean deleteUser(String username) {
        return false;
    }

    @Override
    public Users findUserByUsername(String username) {
        return null;
    }

    @Override
    public ObservableList<Users> fetchAllUsers() throws SQLException {
        ObservableList<Users> users = FXCollections.observableArrayList();
        Users findUser = null;
        ResultSet rs = getResultSet("SELECT * FROM users");
        while (rs.next()) {
            findUser = new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getString(9), rs.getBoolean(10));
            users.add(findUser);
        }
        rs.close();

        return users;
    }


    public ObservableList<Users> getUsers() {
        return users;
    }

    public void setUsers(ObservableList<Users> users) {
        this.users = users;
    }
}
