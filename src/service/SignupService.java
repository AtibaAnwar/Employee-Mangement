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
public class SignupService {

   
    public static boolean addUser(String name,String emailid,String password,String address){
        try{
            Connection cn=repository.ConnectionDB.getConnectiondb();
            Statement st=cn.createStatement();
            st.executeUpdate("insert into user_table values('"+name+"','"+emailid+"','"+password+"','"+address+"')");
           return true;
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        return false;
        
        
    }
}
