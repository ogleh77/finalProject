package com.example.gymproject.model;

import com.example.gymproject.interfaces.UserModel;
import com.example.gymproject.objectors.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersModel extends Database implements UserModel {
    int userId = 103;

    @Override
    public void saveByUser(Users users) throws SQLException {
//        int finalId=userId+=1;
        PreparedStatement ps = getPreparedStatement("INSERT INTO users(user_id,first_name, last_name, phone, gender, shift, username, passowrd,is_admin)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?,?,?)");
        ps.setInt(1, 0);
        ps.setString(2, users.getFirstName());
        ps.setString(3, users.getLasttName());
        ps.setString(4, users.getPhone());
        ps.setString(5, users.getGender());
        ps.setString(6, users.getShift());
        ps.setString(7, users.getUsername());
        ps.setString(8, users.getPassword());
        ps.setBoolean(9, users.isIsAdmin());
        ps.execute();
        ps.close();
        System.out.println("alxamdulilah User saved...");
    }

    @Override
    public void updateByUser(Users users) throws SQLException {
        PreparedStatement ps = getPreparedStatement("UPDATE users SET first_name=?, last_name=?, phone=?, gender=?, shift=?,  username=?, passowrd=?,is_admin=? WHERE user_id=" + users.getuserId());
        ps.setString(1, users.getFirstName());
        ps.setString(2, users.getLasttName());
        ps.setString(3, users.getPhone());
        ps.setString(4, users.getGender());
        ps.setString(5, users.getShift());
        ps.setString(6, users.getUsername());
        ps.setString(7, users.getPassword());
        ps.setBoolean(8, users.isIsAdmin());
        ps.executeUpdate();
        System.out.println("Update masha Allah");
    }

    @Override
    public Users findByUser(int userId) throws SQLException {
        Users findUser = null;
        ResultSet rs = getResultSet("SELECT * FROM users WHERE user_id=" + userId);
        while (rs.next()) {
            findUser = new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getBoolean(9));

            break;
        }
        rs.close();

        return findUser;
    }

    @Override
    public Users findByUsername(String username) throws SQLException {
        Users findUser = null;
        ResultSet rs = getResultSet("SELECT * FROM users WHERE username=" + username);
        while (rs.next()) {
            findUser = new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getBoolean(9));

            break;
        }
        rs.close();
        return findUser;
    }

    @Override
    public ObservableList<Users> getAllUsers() throws SQLException {
        ObservableList<Users> users = FXCollections.observableArrayList();
        Users findUser = null;
        ResultSet rs = getResultSet("SELECT * FROM users");
        while (rs.next()) {
            findUser = new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getBoolean(9));
            users.add(findUser);
        }
        rs.close();

        return users;
    }
}
