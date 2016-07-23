/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week4jdbcdemo.jdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dinesh
 */
public class JdbcDeleteAppTest {
    JdbcDeleteApp delete=new JdbcDeleteApp();
    Connection connection;
    
    public JdbcDeleteAppTest() throws SQLException {
        assertTrue(delete.deleteQuery(connection, 0));
   }

    @Test
    public void testDeleteQuery() throws Exception {
        assertTrue(delete.deleteQuery(connection, 0));
    }
    
}
