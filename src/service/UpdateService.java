/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Atiba
 */
import java.sql.*;
public class UpdateService {
   


   
    public static boolean updateUser(String name,String emailid,String password,String address){
        try{
            Connection cn=repository.ConnectionDB.getConnectiondb();
            Statement st=cn.createStatement();
            st.executeUpdate("update user_table SET email='"+emailid+"',password='"+password+"',address='"+address+" WHERE name='"+name+"'");
           return true;
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        return false;
        
        
    } 
}
