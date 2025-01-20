package dev.research.devcode.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This class sets up the login table with pre-populated vales
 * This will be used to login to the application
 * 
 */

public class table_setup_login 
{
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_login ()
	{
		// insert initialisation and configuration code here
		// this is where the test data will be loaded for this.
		
	}// close public table_setup_login()
	
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here

	//=========================================================================
	/*
	 * This method will create and populate the login database table.
	 */
	
	public void create_populate_login()
	{
		final String DB_NAME = "testDB";
		final String FILE_NAME = "src/model/data_setup_login.txt";
		

		// use try-with-resources Statement
				try 	(	Connection con = connectionTest.getConnection(DB_NAME); 
							Statement statement = con.createStatement(); 
							Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
						) 
					{
						
							//System.out.println("Table " + TABLE_NAME + " exists.");
							statement.execute("DROP TABLE LOGIN IF EXISTS;");
							System.out.println("LOGIN Table dropped");
						

						String query= 
								"CREATE TABLE LOGIN "
								+ "("
									+ "USERID VARCHAR(10) NOT NULL,"
									+ "FNAME VARCHAR(10) NOT NULL,"
									+ "LNAME VARCHAR(25),"
									+ "PRIMARY KEY (USERID)" 
								+ ");";
								
						int result = statement.executeUpdate(query);
						if (result == 0) 
						{
							System.err.println("Login table created");
						}

			
						
						PreparedStatement ps;

						while (scanner.hasNextLine()) 
						{
							String currentLine = scanner.nextLine();
							//System.out.println(currentLine + "  read");
							String details[] = currentLine.split(",");

							if(details.length == 3) 
							{
								ps = con.prepareStatement("INSERT INTO LOGIN VALUES (?, ?, ?);");
								ps.setString(1, details[0].trim());
								ps.setString(2, details[1].trim());
								ps.setString(3, details[2].trim());

								ps.executeUpdate();
								//System.out.println(currentLine + "  inserted");					
							}

						}
				      
					
						
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
	}

}//close public class table_setup_login 
