package dev.research.devcode.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


//import java.sql.Statement;

/*
 * This class sets up the login table with pre-populated vales
 * This will be used to set up and populate the Event table to the application
 * 
 */

public class table_setup_event 
{
	private ResultSet query_result;
	 // this is the results set for the 
	 // SQL results
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_event ()
	{
		// insert initialisation and configuration code here
		// this is where the test data will be loaded for this.
		
	}// close public table_setup_event()
	
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here

	//=========================================================================
	/*
	 * This method will create and populate the login database table.
	 */
	
	public void create_populate_event()
	{
		final String DB_NAME = "testDB";
		final String FILE_NAME = "src/model/data_setup_event.txt";
		

		// use try-with-resources Statement
				try 	(	Connection con = connectionTest.getConnection(DB_NAME); 
							Statement statement = con.createStatement(); 
							Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
						) 
					{
						
						
						//String TABLE_NAME="EVENT";
						//DatabaseMetaData dbm = con.getMetaData();
						//ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);
					
						//if(tables != null) 
						//{
							//System.out.println("Table " + TABLE_NAME + " exists.");
							statement.execute("DROP TABLE EVENT IF EXISTS CASCADE;");
							System.out.println("EVENT Table dropped");
						//}// close if(tables != null) 
						
						
						String query= 
								"CREATE TABLE EVENT "
										+ "("
										+ 	"EVNT_ID 			VARCHAR (7) 	NOT NULL,"
										+ 	"EVNT_NAME 			VARCHAR (25) 	NOT NULL,"
										+ 	"EVNT_CREATID 		VARCHAR (7) 	NOT NULL,"
										+ 	"EVNT_STATUS 		VARCHAR (15) 	NOT NULL,"
										+ 	"EVNT_DESCRIPTION 	VARCHAR (150) 	NOT NULL,"
										+ 	"EVNT_VENUE 		VARCHAR (50) 	NOT NULL,"
										+ 	"EVNT_DATE 			VARCHAR (12) 	NOT NULL,"
										+ 	"EVNT_CAPACITY 		INT 		 	NOT NULL,"
										+ 	"EVNT_TYPE 			VARCHAR(25) 	NOT NULL,"
										+ 	"EVNT_IMAGE 		VARCHAR(200) 			,"
										+ 	"PRIMARY KEY (EVNT_ID)" 
										+ ");"; 
								
						int result = statement.executeUpdate (query);
						if (result == 0) 
						{
							System.err.println("Event table created");
						}

						PreparedStatement ps;
/*
						while (scanner.hasNextLine()) 
						{
							String currentLine = scanner.nextLine();
							//System.out.println(currentLine + "  read");
							String details[] = currentLine.split(",");

							if(details.length == 10) 
							{
								ps = con.prepareStatement("INSERT INTO EVENT VALUES (?,?,?,?,?,?,?,?,?,?);");
								
								ps.setString(1, details[0].trim());
								// EVNT_ID VARCHAR(7) NOT NULL
								
								ps.setString(2, details[1].trim());
								//	EVNT_NAME VARCHAR(25) NOT NULL
								
								ps.setString(3, details[2].trim());
								//	EVNT_CREATID VARCHAR(7) NOT NULL
								
								ps.setString(4, details[3].trim());
								//	EVNT_STATUS VARCHAR(15) NOT NULL
								
								ps.setString(5, details[4].trim());
								//	EVNT_DESCRIPTION VARCHAR(150) NOT NULL
								
								ps.setString(6, details[5].trim());
								//  EVNT_VENUE VARCHAR(50) NOT NULL
								
								ps.setString(7, details[6].trim());
								// EVNT_DATE VARCHAR(12) NOT NULL
								
								
								ps.setInt(8, Integer.parseInt(details[7] ));
								// Remember it is String from the file
								// Needs to be cast to Integer.
								// EVNT_CAPACITY INTEGER NOT NULL
								
								ps.setString(9, details[8].trim());
								//  EVNT_TYPE 	VARCHAR(25) NOT NULL
								
								ps.setString(10, details[9].trim());
								// EVNT_IMAGE 	VARCHAR(200) 
								
								ps.executeUpdate();
								//System.out.println(currentLine + "  inserted");					
							}// close if(details.length == 8) 

						}// close while (scanner.hasNextLine()) 
*/						
				       
					} // close try block
					catch (Exception e) 
					{
						e.printStackTrace();
						//System.out.println(e );
					}// close catch (Exception e)
				
	}// close public void create_populate_event()
	
	
	//=========================================================================
		/*
		 * This method will view the event details
		 * This is a table view table 
		 * 
		 * 
		 */
		
		public void view_event_details_table()
		{
			final String DB_NAME = "testDB";
			try {
				Connection db_connect = connectionTest.getConnection(DB_NAME); 
				//Statement statement = db_connect.createStatement(); 
				//statement.execute("DROP TABLE EVENT IF EXISTS;");
				//System.out.println("EVENT Table dropped");
				
				String query= "Select EVNT_ID,EVNT_NAME,EVNT_CREATID,EVNT_STATUS,EVNT_DESCRIPTION, EVNT_VENUE,EVNT_DATE, EVNT_CAPACITY,EVNT_TYPE,EVNT_IMAGE FROM EVENT;";
				
				PreparedStatement ps = db_connect.prepareStatement(query);
	  			query_result= ps.executeQuery();
	  			
	  			while (query_result.next()) 
			       {
			           System.out.print(query_result.getString("EVNT_ID") + "\t");
			           System.out.print(query_result.getString("EVNT_NAME") + "\t");
			           System.out.print(query_result.getString("EVNT_CREATID") + "\t");
			           System.out.print(query_result.getString("EVNT_STATUS") + "\t");
			           System.out.print(query_result.getString("EVNT_DESCRIPTION") + "\t");
			           System.out.print(query_result.getString("EVNT_VENUE") + "\t");
			           System.out.print(query_result.getString("EVNT_DATE") + "\t");
			           System.out.print(query_result.getInt("EVNT_CAPACITY") + "\t");
			           System.out.print(query_result.getString("EVNT_TYPE") + "\t");
			           System.out.println(query_result.getString("EVNT_IMAGE"));

			       }//close while statement
				
				/*

				int result = statement.executeUpdate(query);
				if (result == 0) 
				{
					System.err.println("POSTS table created");
				}
				
				*/
			  //  Block of code to try
				
			} // Close the try block
		catch(Exception e) 
		{
			  System.out.println(e);
		}//close catch(Exception e) 
			
		}

}//close public class table_setup_login 
