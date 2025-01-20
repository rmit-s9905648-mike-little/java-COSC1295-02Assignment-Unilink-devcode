package dev.research.devcode.model;//import java.io.FileInputStream;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.Statement;


public class table_setup_session 
{
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_session ()
	{
		// insert initialisation and configuration code here
		// this is where the test data will be loaded for this.

	}// close public table_setup_login()


	///////////////////////////////////////////////////////////////////////////
	//Define Class Methods from here

	//=========================================================================
	/*
	 * This method will create the session database table.
	 */
	
	
	public void create_session_table()
	{
		final String DB_NAME = "testDB";
		try {
				Connection con = connectionTest.getConnection(DB_NAME); 
				Statement statement = con.createStatement(); 
				statement.execute("DROP TABLE SESSION IF EXISTS;");
				System.out.println("SESSION Table dropped");
				
				String query= 
						"CREATE TABLE SESSION "
						+ "("
							+ "SESS_ID 		VARCHAR(25) 		NOT NULL,"
							+ "USERID 		VARCHAR(25) 		NOT NULL,"
							+ "FNAME 		VARCHAR(25) 		NOT NULL,"
							+ "LNAME 		VARCHAR(25) 		NOT NULL,"
							+ "STATUS 		VARCHAR(25)					,"
							+ "SEL_PST_ID 	VARCHAR(25)					,"
							+ "SEL_CREATID 	VARCHAR(25)					,"
							+ "PRIMARY KEY (SESS_ID)" 
						+ ");";

				int result = statement.executeUpdate(query);
				if (result == 0) 
				{
					System.err.println("SESSION table created");
				}
			  //  Block of code to try
				
			}
			catch(Exception e) 
		{
			  System.out.println(e);
		}
		
	
	
	
	}// close public void create_session_table()

}// close class table_setup_session
