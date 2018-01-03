package com.until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectiondatabaseForJDBC {
     public static Connection getConnection(){
    	 Connection connection=null;
    	 String url="jdbc:mysql://172.16.7.42/hrs";
    	 String user="root";
    	 String password="gjf001";
    	 String dirver="com.mysql.jdbc.Driver";
    	 try {
			Class.forName(dirver);
			 connection=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return connection;
     }
  
}
