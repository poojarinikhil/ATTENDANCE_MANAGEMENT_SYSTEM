package com.example.attendance_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
public class DATABASECONNECTION {
    public Connection databaselink;

    public Connection getConnection(){
        String databaseName="attendance_management_system";
        String databaseUser="root";
        String databasePassword="";
        String url = "jdbc:mysql://localhost:3306/"+databaseName;
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_management_system","root","");
         }catch (Exception e){
             e.printStackTrace();
             e.getCause();
         }
         return databaselink;

    }

}
