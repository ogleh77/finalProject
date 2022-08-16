package com.example.myproject.model;

import com.example.myproject.interfaces.CostumersModel;
import com.example.myproject.objects.Costumers;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CostumerModel extends Database implements CostumersModel {
    private Connection con = null;
    private PreparedStatement ps;
    private Statement st;
    private SimpleDateFormat df;

    public CostumerModel() {
        this.con = getConnection();
        this.df = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override
    public void addCostumer(Costumers costumer) throws SQLException {
        try {
            con.setAutoCommit(false);
            ps = con.prepareStatement("INSERT INTO costumers(first_name, last_name, phone, gender, shift, paid, discount, paid_by, is_discount, image,\n" +
                    "                      who_added)\n" +
                    "values (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, costumer.getFirstName());
            ps.setString(2, costumer.getLasttName());
            ps.setString(3, costumer.getPhone());
            ps.setString(4, costumer.getGender());
            ps.setString(5, costumer.getShift());
            ps.setDouble(6, costumer.getPaid());
            ps.setDouble(7, costumer.getDiscount());
            ps.setString(8, costumer.getPaidBy());
            ps.setBoolean(9, costumer.isPoxing());
            ps.setString(10, costumer.getImage());
            ps.setString(11, costumer.getWhoAdded());

            ps.execute();

            st = con.createStatement();

            if (costumer.getGender().equalsIgnoreCase("male")) {
                if (st.executeUpdate("UPDATE daily_reports set today_reg=(today_reg+1) ,male=(male+1) WHERE today_date='" + df.format(new Date()) + "'") > 0) {
                    System.out.println("updated by male");
                } else {
                    st.executeUpdate("INSERT into daily_reports(today_reg,male) values(1,1);");
                    System.out.println("Inserted new Value");
                }
            } else if (costumer.getGender().equalsIgnoreCase("female")) {
                if (st.executeUpdate("UPDATE daily_reports set today_reg=(today_reg+1) ,female=(female+1) WHERE today_date='" + df.format(new Date()) + "'") > 0) {
                    System.out.println("updated by female");
                } else {
                    st.executeUpdate("INSERT into daily_reports(today_reg,female) values(1,1);");
                    System.out.println("Inserted new Value");
                }
            }


            con.setAutoCommit(true);
            System.out.println("Masha Allah saved.....");
        } catch (Exception e) {
            con.rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void updateCostumer(Costumers costumer) {

    }

    @Override
    public void DeleteCostumer(Costumers costumer) {

    }

    @Override
    public Costumers getCostumer(Costumers costumer) {
        return null;
    }

    @Override
    public ObservableList<Costumers> getCostumers() {
        return null;
    }
}
