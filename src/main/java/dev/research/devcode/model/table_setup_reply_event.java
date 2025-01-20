package dev.research.devcode.model;//import java.io.FileInputStream;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.Statement;


public class table_setup_reply_event 
{
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public table_setup_reply_event ()
	{
		// insert initialisation and configuration code here
		// this is where the test data will be loaded for this.

	}// close public table_setup_login()


	///////////////////////////////////////////////////////////////////////////
	//Define Class Methods from here

	//=========================================================================
	/*
	 * This method will create the Reply Event database table.
	 * This is a table join table that links Events to replies
	 * 
	 */
	
	
	public void create_reply_event_table()
	{
		final String DB_NAME = "testDB";
		final String FILE_NAME = "src/model/data_setup_reply_event.txt";
		try {
				Connection con = connectionTest.getConnection(DB_NAME); 
				Statement statement = con.createStatement(); 
				
				
				statement.execute("DROP TABLE  REPLY_EVENT IF EXISTS;");
				System.out.println("REPLY_EVENT Table dropped");
				
				String query= 
						"CREATE TABLE REPLY_EVENT "
						+ "("
							+ "REPLY_EVENT_POST_ID 			VARCHAR(7) 	NOT NULL,"
							+ "REPLY_EVENT_RESPONDER_ID 	VARCHAR(7) 	NOT NULL,"
							+ "REPLY_EVENT_VALUE 			INTEGER 		NOT NULL,"
							+ "PRIMARY KEY (REPLY_EVENT_POST_ID,REPLY_EVENT_RESPONDER_ID )" 
						+ ");";

				int result = statement.executeUpdate(query);
				if (result == 0) 
				{
					System.err.println("REPLY_EVENT table created");
				}
				
	/*
				
				//get data from file
				Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
				PreparedStatement ps;
				
				while (scanner.hasNextLine()) 
				{
					String currentLine = scanner.nextLine();
					//System.out.println(currentLine + "  read");
					String details[] = currentLine.split(",");

					if(details.length == 3) 
					{
						ps = con.prepareStatement("INSERT INTO REPLY_EVENT VALUES (?,?,?);");
						
						ps.setString(1, details[0].trim());
						// REPLY_EVENT_POST_ID 		VARCHAR(7) 	NOT NULL
						
						ps.setString(2, details[1].trim());
						//	REPLY_EVENT_RESPONDER_ID 	VARCHAR(7) 	NOT NULL
					
						ps.setInt(3, 	Integer.parseInt(details[2])  );
						// REPLY_EVENT_VALUE  INTEGER NOT NULL,
						
						
						ps.executeUpdate();
						//System.out.println(currentLine + "  inserted");					
					}// close if(details.length == 8) 

				}// close while (scanner.hasNextLine()) 
				
				
				
		*/		
				
				
			  //  Block of code to try
				
			}
			catch(Exception e) 
		{
			  //System.out.println(e);
				e.printStackTrace();
		}
		
	
	
	
	}// close public void create_session_table()

}// close class table_setup_session
