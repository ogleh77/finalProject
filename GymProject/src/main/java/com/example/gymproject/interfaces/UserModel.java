package com.example.gymproject.interfaces;

import com.example.gymproject.objectors.Users;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface UserModel {

    void saveByUser(Users users) throws SQLException;

    void updateByUser(Users users) throws SQLException;

    Users findByUser(int id) throws SQLException;

    Users findByUsername(String username) throws SQLException;

    ObservableList<Users> getAllUsers() throws SQLException;
}
