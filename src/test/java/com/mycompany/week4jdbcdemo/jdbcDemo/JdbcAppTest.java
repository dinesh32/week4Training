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
public class JdbcAppTest {
    private JdbcApp JdbcApp =new JdbcApp(); 
            
            
            
    
    public JdbcAppTest() {
    }

    @org.junit.Test
    public void testInsertQuery() throws Exception {
        assertTrue(JdbcApp.insertQuery());
        
    }

    @Test
    public void testInsertQuery2() throws SQLException {
        
        Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/jdbc_demo_db","APPLE","apple");
    }
    
}
