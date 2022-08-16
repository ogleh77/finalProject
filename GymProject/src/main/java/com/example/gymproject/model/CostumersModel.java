package com.example.gymproject.model;

import com.example.gymproject.interfaces.CostumerModel;
import com.example.gymproject.objectors.Costumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CostumersModel extends Database implements CostumerModel {
    @Override
    public void addCostumer(Costumer costumer) throws SQLException {
        int costumerID = 200;
        PreparedStatement ps = getConnection().prepareStatement(
                "INSERT INTO costumers(costumer_id, first_name, last_name, phone, gender, shift, paid, discount, paid_by, who_added)" +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
        ps.setInt(1, costumer.getCostumerId());
        ps.setString(2, costumer.getFirstName());
        ps.setString(3, costumer.getLasttName());
        ps.setString(4, costumer.getPhone());
        ps.setString(5, costumer.getGender());
        ps.setString(6, costumer.getShift());
        ps.setDouble(7, costumer.getPaid());
        ps.setDouble(8, costumer.getDiscount());
        ps.setString(9, costumer.getPaidBy());
        ps.setInt(10, costumer.getWhoAdded());
        ps.execute();
        System.out.println("alxamdulilah User saved...");
    }

    @Override
    public void updateCostumer(Costumer costumer) throws SQLException {
        PreparedStatement ps = getPreparedStatement("UPDATE costumers SET first_name=?, last_name=?, phone=?, gender=?, shift=?,  paid=?, discount=?,paid_by=?  WHERE costumer_id=" + costumer.getCostumerId());
        ps.setString(1, costumer.getFirstName());
        ps.setString(2, costumer.getLasttName());
        ps.setString(3, costumer.getPhone());
        ps.setString(4, costumer.getGender());
        ps.setString(5, costumer.getShift());
        ps.setDouble(6, costumer.getPaid());
        ps.setDouble(7, costumer.getDiscount());
        ps.setString(8, costumer.getPaidBy());
        ps.execute();
        ps.close();
        System.out.println("Updated...");
    }

    @Override
    public void deleteCostumer(int id) throws SQLException {
        Statement statement = getStatement();
        System.out.println(statement.execute("DELETE FROM costumers WHERE costumer_id=" + id));
        statement.close();
    }

    @Override
    public Costumer getCostumer(int id) throws SQLException {
        Costumer costumer = null;
        ResultSet rs = getResultSet("SELECT * FROM costumers WHERE costumer_id=" + id);
        while (rs.next()) {
            costumer = new Costumer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getString(9), rs.getInt(10));
            break;
        }
        return costumer;
    }

    @Override
    public ObservableList<Costumer> getAllCostumers() throws SQLException {
        ObservableList<Costumer> costumers = FXCollections.observableArrayList();
        Costumer costumer = null;
        ResultSet rs = getResultSet("SELECT * FROM costumers");
        while (rs.next()) {
            costumer = new Costumer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getString(9), rs.getInt(10));
            costumers.add(costumer);
        }
        rs.close();
        return costumers;
    }
}
