package com.example.myproject.model;

import java.sql.*;

public class Database {
    public Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:src/database/db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return con;
    }

    public Statement getStatement() throws SQLException {
        Statement statement = getConnection().createStatement();
        return statement;
    }

    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement(sql);
        return ps;
    }


    public ResultSet getResultSet(String sql) throws SQLException {
        ResultSet rs = getStatement().executeQuery(sql);
        return rs;
    }


}
