package com.company.model.dao;

import com.company.model.entities.Developer;

import java.sql.SQLException;

public interface DeveloperDAO {
    Developer getById(int id) throws SQLException;

    void save(Developer developer);
}
