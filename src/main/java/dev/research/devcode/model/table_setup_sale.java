package dev.research.devcode.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This class sets up the login table with pre-populated vales
 * This will be used to set up and populate the SALE table to the application
 * 
 */

public class table_setup_sale 
{
	private ResultSet query_result;
	 // this is the results set for the 
	 // SQL results
	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_sale ()
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
	
	public void create_populate_sale()
	{
		final String DB_NAME = "testDB";
		final String FILE_NAME = "src/model/data_setup_sale.txt";
		

		// use try-with-resources Statement
				try 	(	Connection con = connectionTest.getConnection(DB_NAME); 
							Statement statement = con.createStatement(); 
							Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
						) 
					{
						
						
						//String TABLE_NAME="SALE";
						//DatabaseMetaData dbm = con.getMetaData();
						//ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);
					
						//if(tables != null) 
						//{
							//System.out.println("Table " + TABLE_NAME + " exists.");
							statement.execute("DROP TABLE SALE IF EXISTS CASCADE;");
							System.out.println("SALE Table dropped");
						//}// close if(tables != null) 
						
						
						String query= 
								"CREATE TABLE SALE "
										+ "("
										+ 	"SLE_ID 				VARCHAR(7) 		NOT NULL,"
										+ 	"SLE_NAME 				VARCHAR(25) 	NOT NULL,"
										+ 	"SLE_CREATID 			VARCHAR(7) 		NOT NULL,"
										+ 	"SLE_STATUS 			VARCHAR(15) 	NOT NULL,"
										+ 	"SLE_DESCRIPTION 		VARCHAR(150) 	NOT NULL,"
										+ 	"SLE_ASKING_PRICE 		INTEGER 		NOT NULL,"
										+ 	"SLE_HIGHEST_OFFER 		INTEGER 		NOT NULL,"
										+ 	"SLE_MINIMUM_RAISE 		INTEGER 		NOT NULL,"
										+ 	"SLE_DATE 				VARCHAR(12) 	NOT NULL,"
										+ 	"SLE_TYPE 				VARCHAR(25) 	NOT NULL,"
										+ 	"SLE_IMAGE 				VARCHAR(200),"
										+ 	"PRIMARY KEY (SLE_ID)" 
										+ ");"; 
								
						int result = statement.executeUpdate (query);
						if (result == 0) 
						{
							System.err.println("SALE table created");
						}

/*						
						
						PreparedStatement ps;

						while (scanner.hasNextLine()) 
						{
							String currentLine = scanner.nextLine();
							//System.out.println(currentLine + "  read");
							String details[] = currentLine.split(",");

							if(details.length == 11) 
							{
								ps = con.prepareStatement("INSERT INTO SALE VALUES (?,?,?,?,?,?,?,?,?,?,?);");
								
								ps.setString(1, details[0].trim());
								// SLE_ID 	VARCHAR(7) 	NOT NULL
								
								ps.setString(2, details[1].trim());
								//	SLE_NAME 	VARCHAR(25) NOT NULL
								
								ps.setString(3, details[2].trim());
								//	SLE_CREATID VARCHAR(7) NOT NULL
								
								ps.setString(4, details[3].trim());
								//	EVNT_STATUS VARCHAR(15) NOT NULL
								
								ps.setString(5, details[4].trim());
								//	EVNT_DESCRIPTION VARCHAR(150) NOT NULL
								
								
								ps.setInt(6, Integer.parseInt(details[5])  );
								// SLE_ASKING_PRICE INTEGER 	NOT NULL,
								
								ps.setInt(7, Integer.parseInt(details[6])  );
								// SLE_HIGHEST_OFFER INTEGER 	NOT NULL,
								
								ps.setInt(8, Integer.parseInt(details[7] ));
								//SLE_MINIMUM_RAISE INTEGER 	NOT NULL
								
								
								ps.setString(9, details[8].trim());
								//	SLE_DATE 	VARCHAR(12) NOT NULL,
								
								ps.setString(10, details[9].trim());
								//	SLE_TYPE 	VARCHAR(25) NOT NULL
								
								ps.setString(11, details[10].trim());
								//	SLE_IMAGE 	VARCHAR(200)
								
								
								
								
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
	}
	
	
	//=========================================================================
	/*
	 * This method will view the sale details
	 * This is a table view table 
	 * 
	 * 
	 */
	
	public void view_sale_details_table()
	{
		final String DB_NAME = "testDB";
		try {
			Connection db_connect = connectionTest.getConnection(DB_NAME); 
			//Statement statement = db_connect.createStatement(); 
			//statement.execute("DROP TABLE SALE IF EXISTS;");
			//System.out.println("SALE Table dropped");
			
			String query= "Select SLE_ID,SLE_NAME,SLE_CREATID,SLE_STATUS,SLE_DESCRIPTION, SLE_VENUE,SLE_DATE, SLE_CAPACITY,SLE_TYPE,SLE_IMAGE FROM SALE;";
			
			PreparedStatement ps = db_connect.prepareStatement(query);
  			query_result= ps.executeQuery();
  			
  			while (query_result.next()) 
		       {
		           System.out.print(query_result.getString("SLE_ID") + "\t");
		           System.out.print(query_result.getString("SLE_NAME") + "\t");
		           System.out.print(query_result.getString("SLE_CREATID") + "\t");
		           System.out.print(query_result.getString("SLE_STATUS") + "\t");
		           System.out.print(query_result.getString("SLE_DESCRIPTION") + "\t");
		           System.out.print(query_result.getString("SLE_VENUE") + "\t");
		           System.out.print(query_result.getString("SLE_DATE") + "\t");
		           System.out.print(query_result.getInt("SLE_CAPACITY") + "\t");
		           System.out.print(query_result.getString("SLE_TYPE") + "\t");
		           System.out.println(query_result.getString("SLE_IMAGE"));

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
