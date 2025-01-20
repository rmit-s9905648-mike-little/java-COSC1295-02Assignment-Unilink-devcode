package dev.research.devcode.model;//import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.sql.Statement;


public class table_setup_view_postings 
{
	
	private ResultSet query_result;
	 // this is the results set for the 
	 // SQL results
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_view_postings()
	{
		// insert initialisation and configuration code here
		// this is where the test data will be loaded for this.

	}// close public table_setup_view_post()


	///////////////////////////////////////////////////////////////////////////
	//Define Class Methods from here

	//=========================================================================
	/*
	 * This method will create the table setup view post
	 * This is a table view table 
	 * 
	 * 
	 */
	
	
	public void create_view_postings_table()
	{
		final String DB_NAME = "testDB";
		try {
				Connection db_connect = connectionTest.getConnection(DB_NAME); 
				Statement statement = db_connect.createStatement(); 
				statement.execute("DROP TABLE  POSTINGS IF EXISTS;");
				System.out.println("POSTS Table dropped");
				
				String query= 
						"CREATE VIEW POSTINGS"
								+" AS "
								+"SELECT		EVNT_ID  			as		PST_ID,"
								+"				EVNT_NAME 			as 		PST_NAME,"
								+"				EVNT_DESCRIPTION 	as 		PST_DESCRIPTION,"
								+"				EVNT_CREATID 		as		PST_CREATID,"
								+"				EVNT_DATE 			as 		PST_DATE,"
								+"				EVNT_STATUS 		as 		PST_STATUS,"
								+"				EVNT_TYPE 			as 		PST_TYPE,"
								+"				EVNT_IMAGE 			as 		PST_IMAGE"
								+" FROM EVENT "
								+" UNION "
								+"SELECT 		SLE_ID,"
								+"				SLE_NAME,"
								+"				SLE_DESCRIPTION,"
								+"				SLE_CREATID,"
								+"				SLE_DATE,"
								+"				SLE_STATUS,"
								+"				SLE_TYPE,"
								+"				SLE_IMAGE"
								+" FROM SALE "
								+" UNION "
								+"SELECT  	JB_ID,"
								+"			JB_NAME,"
								+"			JB_DESCRIPTION,"
								+"			JB_CREATID,"
								+"			JB_DATE,"
								+"			JB_STATUS,"
								+"			JB_TYPE,"
								+"			JB_IMAGE"
								+" FROM JOB;";

				int result = statement.executeUpdate(query);
				if (result == 0) 
				{
					System.err.println("POSTS table created");
				}
			  //  Block of code to try
				
			} // Close the try block
		catch(Exception e) 
		{
			  System.out.println(e);
		}//close catch(Exception e) 

	}// close public void create_session_table()
	
	//=========================================================================
	/*
	 * This method will view the posting details
	 * This is a table view table 
	 * 
	 * 
	 */
	
	public void view_postings_details_table()
	{
		final String DB_NAME = "testDB";
		try {
			Connection db_connect = connectionTest.getConnection(DB_NAME); 
			//Statement statement = db_connect.createStatement(); 
			//statement.execute("DROP TABLE  POSTS IF EXISTS;");
			//System.out.println("POSTS Table dropped");
			
			String query= 
					"Select PST_ID,PST_NAME,PST_DESCRIPTION, PST_CREATID,PST_DATE, PST_STATUS,PST_TYPE,PST_IMAGE from POSTINGS;";
			
			PreparedStatement ps = db_connect.prepareStatement(query);
  			query_result= ps.executeQuery();
  			
  			while (query_result.next()) 
		       {
		           System.out.print(query_result.getString("PST_ID") + "\t");
		           System.out.print(query_result.getString("PST_NAME") + "\t");
		           System.out.print(query_result.getString("PST_DESCRIPTION") + "\t");
		           System.out.print(query_result.getString("PST_CREATID") + "\t");
		           System.out.print(query_result.getString("PST_DATE") + "\t");
		           System.out.print(query_result.getString("PST_STATUS") + "\t");
		           System.out.print(query_result.getString("PST_TYPE") + "\t");
		           System.out.println(query_result.getString("PST_IMAGE"));
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
	
	
	

}// close class table_setup_session
