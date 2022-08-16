package com.example.myproject.model;

import com.example.myproject.interfaces.TemCostumerModel;
import com.example.myproject.objects.TempCostumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TempCostumerModel extends Database implements TemCostumerModel {

    private Connection con = null;
    private PreparedStatement ps;
    private Statement st;
    private SimpleDateFormat tf;
    ResultSet rs;
    private final SimpleDateFormat df;

    public TempCostumerModel() throws SQLException {
        con = getConnection();
        st = con.createStatement();
        this.tf = new SimpleDateFormat("HH:mm ");
        this.df = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override
    public void addTempCostumer(TempCostumer tempCostumer) throws SQLException {
        con.setAutoCommit(false);

        try {
            ps = con.prepareStatement("INSERT INTO temp_costumers(first_name, last_name, phone, amount, paid_by, gender, poxing)\n" +
                    "VALUES(?,?,?,?,?,?,?);");

            ps.setString(1, tempCostumer.getFirstName());
            ps.setString(2, tempCostumer.getLasttName());
            ps.setString(3, tempCostumer.getPhone());
            ps.setDouble(4, tempCostumer.getPaid());
            ps.setString(5, tempCostumer.getPaidBy());
            ps.setString(6, tempCostumer.getGender());
            ps.setBoolean(7, tempCostumer.isPoxing());
            ps.execute();
            st = con.createStatement();
            if (st.executeUpdate("UPDATE daily_reports set temp_costumers=(temp_costumers+1) WHERE today_date='" + df.format(new Date()) + "'") > 0) {
                System.out.println("updated by shortly");
            } else {
                st.executeUpdate("INSERT into daily_reports(temp_costumers) values(1);");
                System.out.println("Inserted new shortly");
            }
            con.setAutoCommit(true);

        } catch (Exception e) {
            con.rollback();
            e.printStackTrace();
        }


    }

    @Override
    public ObservableList<TempCostumer> getAllTemp() throws SQLException {
        ObservableList<TempCostumer> tempCostumers = FXCollections.observableArrayList();
        rs = st.executeQuery("SELECT * from temp_costumers;");

        while (rs.next()) {
            TempCostumer tempCostumer = new TempCostumer(rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getDouble(5),
                    rs.getString(6), rs.getBoolean(7),
                    rs.getString(8), rs.getString(9));
//            if (tempCostumer.getExpTime().compareTo(tf.format(new Date())) < 0) {
//                System.out.println("Temp costumer is outdated...");
//                System.out.println(tempCostumer);
//            } else if (tempCostumer.getExpTime().compareTo(tf.format(new Date())) > 0) {
//                System.out.println("Active");
//                System.out.println(tempCostumer);
//            }
            tempCostumers.add(tempCostumer);
        }
        return tempCostumers;
    }


    @Override
    public void deleteTempCostumer(TempCostumer tempCostumer) {

    }
}
