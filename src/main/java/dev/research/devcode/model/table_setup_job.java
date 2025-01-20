package dev.research.devcode.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This class sets up the login table with pre-populated vales
 * This will be used to set up and populate the JOB table to the application
 * 
 */

public class table_setup_job 
{
	
	private ResultSet query_result;
	 // this is the results set for the 
	 // SQL results
	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_job ()
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
	
	public void create_populate_job()
	{
		final String DB_NAME = "testDB";
		final String FILE_NAME = "src/model/data_setup_JOB.txt";
		

		// use try-with-resources Statement
				try 	(	Connection con = connectionTest.getConnection(DB_NAME); 
							Statement statement = con.createStatement(); 
							Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
						) 
					{
						
						
						//String TABLE_NAME="JOB";
						//DatabaseMetaData dbm = con.getMetaData();
						//ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);
					
						//if(tables != null) 
						//{
							//System.out.println("Table " + TABLE_NAME + " exists.");
							statement.execute("DROP TABLE JOB IF EXISTS CASCADE;");
							System.out.println("JOB Table dropped");
						//}// close if(tables != null) 
						
						
						String query= 
								"CREATE TABLE JOB "
										+ "("
										+ 	"JB_ID 				VARCHAR(7) 		NOT NULL,"
										+ 	"JB_NAME 			VARCHAR(25) 	NOT NULL,"
										+ 	"JB_CREATID 		VARCHAR(7) 		NOT NULL,"
										+ 	"JB_STATUS 			VARCHAR(15) 	NOT NULL,"
										+ 	"JB_DESCRIPTION 	VARCHAR(150) 	NOT NULL,"
										+ 	"JB_DATE 			VARCHAR(12) 	NOT NULL,"
										+ 	"JB_PROPOSED_PRICE 	INTEGER 		NOT NULL,"
										+ 	"JB_LOWEST_OFFER 	INTEGER 		NOT NULL,"
										+ 	"JB_TYPE 			VARCHAR(25) 	NOT NULL,"
										+ 	"JB_IMAGE 			VARCHAR(200),			 "
										+ 	"PRIMARY KEY (JB_ID)" 
										+ ");"; 
								
						int result = statement.executeUpdate (query);
						if (result == 0) 
						{
							System.err.println("JOB table created");
						}

	/*					
						PreparedStatement ps;

						while (scanner.hasNextLine()) 
						{
							String currentLine = scanner.nextLine();
							//System.out.println(currentLine + "  read");
							String details[] = currentLine.split(",");

							if(details.length == 10) 
							{
								ps = con.prepareStatement("INSERT INTO JOB VALUES (?,?,?,?,?,?,?,?,?,?);");
								
								ps.setString(1, details[0].trim());
								// JB_ID 	VARCHAR(7) 	NOT NULL
								
								ps.setString(2, details[1].trim());
								//	JB_NAME 	VARCHAR(25) NOT NULL
								
								ps.setString(3, details[2].trim());
								//	JB_CREATID 	VARCHAR(7) 	NOT NULL
								
								ps.setString(4, details[3].trim());
								//	JB_STATUS 	VARCHAR(15) NOT NULL
								
								ps.setString(5, details[4].trim());
								//	JB_DESCRIPTION 	VARCHAR(150) NOT NULL
								
								ps.setString(6, details[5].trim());
								//  JB_DATE 	VARCHAR(12) NOT NULL
							
								ps.setInt(7, Integer.parseInt(details[6])  );
								// JB_PROPOSED_PRICE INTEGER NOT NULL
								
								ps.setInt(8, Integer.parseInt( details[7] ));
								// JB_LOWEST_OFFER 	INTEGER 		NOT NULL
								
								ps.setString(9, details[8].trim());
								//	JB_TYPE 	VARCHAR(25) 	NOT NULL
								
								ps.setString(10, details[9].trim());
								//  JB_IMAGE 	VARCHAR(200)
								
								
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
				
				
	}//close public void create_populate_job()
	
	//=========================================================================
	/*
	 * This method will view the JOB details
	 * This is a table view table 
	 * 
	 * 
	 */
	
	public void view_job_details_table()
	{
		final String DB_NAME = "testDB";
		try {
			Connection db_connect = connectionTest.getConnection(DB_NAME); 
			//Statement statement = db_connect.createStatement(); 
			//statement.execute("DROP TABLE JOB IF EXISTS;");
			//System.out.println("JOB Table dropped");
			
			String query= "Select JB_ID,JB_NAME,JB_CREATID,JB_STATUS,JB_DESCRIPTION, JB_VENUE,JB_DATE, JB_CAPACITY,JB_TYPE,JB_IMAGE FROM JOB;";
			
			PreparedStatement ps = db_connect.prepareStatement(query);
  			query_result= ps.executeQuery();
  			
  			while (query_result.next()) 
		       {
		           System.out.print(query_result.getString("JB_ID") + "\t");
		           System.out.print(query_result.getString("JB_NAME") + "\t");
		           System.out.print(query_result.getString("JB_CREATID") + "\t");
		           System.out.print(query_result.getString("JB_STATUS") + "\t");
		           System.out.print(query_result.getString("JB_DESCRIPTION") + "\t");
		           System.out.print(query_result.getString("JB_VENUE") + "\t");
		           System.out.print(query_result.getString("JB_DATE") + "\t");
		           System.out.print(query_result.getInt("JB_CAPACITY") + "\t");
		           System.out.print(query_result.getString("JB_TYPE") + "\t");
		           System.out.println(query_result.getString("JB_IMAGE"));

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
