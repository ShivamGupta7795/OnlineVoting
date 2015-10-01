/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author shivam.gupta7795
 */
public class dbconnect {
  Connection con;
    public Connection init(){
       
   
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/evoting","root","shivam");
    System.out.println("CONNECTION CREATED");
    
    }
    catch(Exception ex){
    System.out.println("CONNECTION ERROR"+ex);
    }
        return con;
    
}
}