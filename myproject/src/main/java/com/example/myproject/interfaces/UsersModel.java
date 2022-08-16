package com.example.myproject.interfaces;

import com.example.myproject.objects.Users;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface UsersModel {

    void addUser(Users user);

    void updateUser(Users user);

    boolean deleteUser(String username);

    Users findUserByUsername(String username);

    ObservableList<Users> fetchAllUsers() throws SQLException;
}
