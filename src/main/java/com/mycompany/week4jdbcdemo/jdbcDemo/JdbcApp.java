/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week4jdbcdemo.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dinesh
 */
public class JdbcApp {

    public boolean insertQuery() throws SQLException {
        String url = "jdbc:derby://localhost:1527/jdbc_demo_db";
        String user = "APPLE";
        String password = "apple";
        Connection connection = DriverManager.getConnection(url, user, password);
        String insertSQL = "INSERT INTO DEMO_TABLE VALUES(1,'RAM PANDEY','KALIMATI','RAM.GMAIL.COM'" + "22,1000.45)";
        PreparedStatement ps = connection.prepareStatement(insertSQL);
        ps.executeUpdate();
        return true;
    }

    public boolean insertQuery2(Connection connection) throws SQLException {
        String insertSQL = "INSERT INTO DEMO_TABLE VALUES(2,'RAM PANDEY','KALIMATI','RAM.GMAIL.COM'" + "22,1000.45)";
        PreparedStatement ps = connection.prepareStatement(insertSQL);
        ps.executeUpdate();
        return true;
    }
}
