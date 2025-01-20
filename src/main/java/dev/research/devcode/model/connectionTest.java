package dev.research.devcode.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionTest 
{
    
    public static void main(String[] args) 
    {
   	 
   	 final String DB_NAME = "testDB";
   	 
   	 //use try-with-resources Statement
   	 try (Connection con = getConnection(DB_NAME)) 
   	 {
   		 
   		 System.out.println("Connection to database " + DB_NAME + " created successfully");
   		 System.out.println (con);
   		 
   	 } catch (Exception e) 
   	 {
   		 System.out.println(e.getMessage());
   	 }
    }
    
    public static Connection getConnection(String dbName)
   				 throws SQLException, ClassNotFoundException 
    {
   	 //Registering the HSQLDB JDBC driver
   	 Class.forName("org.hsqldb.jdbc.JDBCDriver");
   		 
   	 /* Database files will be created in the "database"
   	  * folder in the project. If no username or password is
   	  * specified, the default SA user and an empty password are used */
   	 Connection con = DriverManager.getConnection
   			 //("jdbc:hsqldb:file:database/" + dbName, "SA", "");
   			("jdbc:hsqldb:file:database/" + dbName+";hsqldb.lock_file=false;shutdown=true;ifexists=true", "SA", "");
   	 		/*
   	 		 * With this:
   	 		 * 1. the database connection string is jdbc:hsqldb:file:database/testDB
   	 		 * 2. ";hsqldb.lock_file=false" is added to allow for the dB to be connected
   	 		 *    	to many clients.
   	 		 * 3. The User name is "SA"
   	 		 * 4. The password is "".
   	 		 */
   	 				
   	 return con;
    }
}

