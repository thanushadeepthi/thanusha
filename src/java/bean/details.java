/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mss
 */
public class details {
    
  

public static int register(user u){  
int status=0;  
try{  
Connection con=ConnectionProvider.getCon(); 
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student"); 
System.out.println(rs.getString(1)+" "+rs.getString(2));

}catch(Exception e){}  
      
return status;  
}  
  
}  
    
