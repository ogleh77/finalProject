package com.example.gymproject.model;

import com.example.gymproject.interfaces.GymModels;
import com.example.gymproject.objectors.Gym;
import com.example.gymproject.objectors.Users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GymModel extends Database implements GymModels {
    @Override
    public void updateGym(Gym gym) throws SQLException {
        PreparedStatement ps = getPreparedStatement("update gym_data SET gym_name=?, poxing_cost=?,fitnes_cost=?\n" +
                "WHERE gym_name=" + gym.getGymName());
        ps.setString(1, gym.getGymName());
        ps.setDouble(2, gym.getPoxingCost());
        ps.setDouble(3, gym.getPoxingCost());

        ps.executeUpdate();
        System.out.println("Gym updated.. masha Allah");
    }

    @Override
    public Gym findGymByName(String name) throws SQLException {
        Gym gym = null;

        ResultSet rs = getResultSet("SELECT * FROM gym_data WHERE gym_name=" + gym.getGymName());
        while (rs.next()) {
            gym = new Gym(rs.getString(1), rs.getDouble(2), rs.getDouble(3));
            break;
        }
        rs.close();
        return gym;
    }
}
