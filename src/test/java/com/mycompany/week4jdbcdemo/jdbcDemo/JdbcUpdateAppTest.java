/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week4jdbcdemo.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dinesh
 */
public class JdbcUpdateAppTest {

    JdbcUpdateApp jdbcUpdateApp = new JdbcUpdateApp();
    Connection connection;

    public JdbcUpdateAppTest() throws SQLException {
        this.connection=DriverManager.getConnection("jdbc:derby://localhost:1527/jdbc_demo_db","APPLE","apple");
    }

    @Test
    public void testUpdateNameAndAddressSQL() throws Exception {
        assertTrue(jdbcUpdateApp.updateNameAndAddressSQL(connection, "Ok", "kathmandu"));
    }

    @Test
    public void testUpdateNameAndAddressByPreventingSQLInjection() throws SQLException {
        assertTrue(jdbcUpdateApp.updateNameAndAddressByPreventingSQLInjection(connection, "Ok", "kathmandu"));
    }

}
