/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week4jdbcdemo.jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dinesh
 */
public class JdbcDeleteApp {

    public boolean deleteQuery(Connection connection, int id) throws SQLException {
        String deleteQuery = "DELETE FROM DEMO_TABLE WHERE ID=?";
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, id);
        ps.executeUpdate();
        return true;
    }

}
