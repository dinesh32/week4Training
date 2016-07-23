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
public class JdbcUpdateApp {

    public boolean updateNameAndAddressSQL(Connection conn, String name, String address) throws SQLException {
        String update = "UPDATE DEMO_TABLE SET NAME=" + name + ",ADDRESS=" + address + "'";
        PreparedStatement ps = conn.prepareStatement(update);
        ps.executeUpdate();
        return true;
    }

    public boolean updateNameAndAddressByPreventingSQLInjection(Connection conn, String name, String address) throws SQLException {
        String update = "UPDATE DEMO_TABLE SET NAME=?,ADDRESS=?'";
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, name);
        ps.setString(2, address);
        ps.executeUpdate();
        return true;

    }
    public boolean updateById(int id){
        
    }

}
