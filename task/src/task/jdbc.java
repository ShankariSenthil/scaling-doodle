/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.sql.*;


/**
 *
 * @author Asus
 */
public class jdbc {
    public static void main(String args[]){
	try{
	        //step1 load the driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");		
            //step3 create the statement object
            //step2 create the connection object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","shank2004" );
                //step3 create the statement object
                Statement stmt=con.createStatement();
                //step4 execute query
                //ResultSet rs=stmt.executeQuery("create table employee (empid number(4), empname varchar2(25))");
                //ResultSet rs=stmt.executeQuery("insert into employee values(1002, 'Rajesh')");
                //stmt.executeUpdate("update dep_info set dept_name='AIML' where dept_code=3");
               // stmt.executeUpdate("insert into dep_info");
                //while (rs.next()) {
                  //  System.out.println(rs.getInt(1)+" "+rs.getString(2));
               // }
                stmt.executeUpdate("delete from dep_info where dept_code=3");
                //step5 close the connection object
            }		
	catch(Exception e){ System.out.println(e);} 		
       } 
}
