package com.example.gymproject.interfaces;

import com.example.gymproject.objectors.Gym;

import java.sql.SQLException;

public interface GymModels {

    void updateGym(Gym gym) throws SQLException;
    Gym findGymByName(String name) throws SQLException;
}
