package dev.research.devcode.model;

////////////////////////////////////////////////////////////////////////////////
/*--------------------------------------------------------------------------
* This is a project of... 
* Michael John Little:9905648@student.rmit.edu.au
* Mob: +61 476 136 482
* 
* -------------------------------------------------------------------------
*            THIS  class generates the export data as *.HTML
* 
* 
/*--------------------------------------------------------------------------
* 
*/

////////////////////////////////////////////////////////////////////////////////

	import java.sql.Connection;
    import java.sql.PreparedStatement;
	import java.sql.ResultSet;
    import java.lang.*;

public class application_data
{
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	//------------------------------------------------------------------------------------------------------------------
	/*
	 *   Definition of class session information
	 *  
	 */
	final String DB_NAME = "testDB";
	// this is the database name
	
	private ResultSet query_result;
	 // this is the results set for the 
	 // SQL results
	
	private String export_content="";
	// this is the string that will be appended with other strings.
	
	
	//------------------------------------------------------------------------------------------------------------------
	/*
	 *  Definition of the content for the Developer About this... 
	 *  
	 */
	private String about_this_development_content =
			"About this Build:\n" + 
			"\n" + 
			"This application was developed by:\n" + 
			"Michael John Little\n" + 
			"Email: s9905648@student.rmit.edu.au\n" + 
			"Mob: +61 476 136 482.\n" + 
			"\n" + 
			"Fortitudine Vincimus,   Sine Timore,   Per Ardua Ad Astra!\n" + 
			"\n" + 
			"“Nothing in this world can take the place of persistence. \n" + 
			"Talent will not: nothing is more common than unsuccessful men with talent. \n" + 
			"Genius will not; unrewarded genius is almost a proverb. \n" + 
			"Education will not: the world is full of educated derelicts. \n" + 
			"Persistence and determination alone are omnipotent”. \n" + 
			"Calvin Coolidge\n" + 
			"\n" + 
			"This build is: 20200622--0359\n" + 
			"\n" + 
			"\n" + 
			"1.0 Key Functionality Attained\n" + 
			"========================================================================\n" + 
			"a. 	This application fully implement the use of the HSSQLDB standalone SQL database\n" + 
			"	For maintaining state information and managing application and transactional data\n" + 
			"\n" + 
			"b.	This application implements the requirement for data import (*.csv) and examples of these\n" + 
			"	Are in the path \"/src/dataImportFiles\"\n" + 
			"\n" + 
			"\n" + 
			"c. This application diplomats requirement to be able to export data, and this is done as  \n" + 
			"	as a HTML file.\n" + 
			"	\n" + 
			"c. This application implements the requirement to upload images and present those images\n" + 
			"	Example image files are provided in the path \"src/dataImportImages\"\n" + 
			"	\n" + 
			"d. The capability to create new postings, reply to postings and delete the replies to a \n" + 
			"	posting and the posting have been implemented.\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"2.0 Functionality on the \"TO BE\" Task List and approach.\n" + 
			"========================================================================\n" + 
			"a. 	Regrettably this developer was not able to complete the functionality to accept and offer\n" + 
			"	although I did manage to add the button for this, but I was not able to get \n" + 
			"	to implement this functionality. \n" + 
			"	\n" + 
			"	This occurred because I realized I had to add an additional column to each of the reply Tables\n" + 
			"	In order to capture the outcome, but that would have taken extensive rework possibly \n" + 
			"	taking me at least 2 to 3 days to implement. This developer decided to focus on implementing\n" + 
			"	The functionality to create, update, reply and delete a posting; and implement the functionality\n" + 
			"	Add an image to a posting.\n" + 
			"	\n" + 
			"b. Regrettably this developer was not able to implement field validations such as validating the date\n" + 
			"	imput. \n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"3.0 Known Defects\n" + 
			"========================================================================\n" + 
			"a.	There is a minor defect when you delete a posting and its replies, the application will indicate a problem\n" + 
			"	But it will still delete any replies associated with a posting, delete any image associated with the posting and then\n" + 
			"	Delete the posting itself.\n" + 
			"\n" + 
			"\n" + 
			"As a general comment this has been an excellent challenge and I hope I've met the challenge and exceeded it! \n" + 
			"Thank you.\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"Michael Little\n" + 
			"s9905648@student.rmit.edu.au\n" + 
			"Mob: +61 476 136 482\n" + 
			"Monday 22 June 2020, 03:53 AM";
			
	
	
	// this is the content describing the current development.
	
	//------------------------------------------------------------------------------------------------------------------
	/*
	 *  Definition of the Template content for the HTML Export template. 
	 *  
	 */
	
	//this is the HTML content for the event - first part of the file component
	private String export_content_event = " <html>\n" + 
			"<style>\n" + 
			"table {\n" + 
			"  width:100%;\n" + 
			"}\n" + 
			"table, th, td {\n" + 
			"  border: 1px solid black;\n" + 
			"  border-collapse: collapse;\n" + 
			"}\n" + 
			"th, td {\n" + 
			"  padding: 5px;\n" + 
			"  text-align: left;\n" + 
			"}\n" + 
			"</style>\n" + 
			"<head>\n" + 
			"<title>Export of UniLink Data</title>\n" + 
			"</head>\n" + 
			"<body>\n" + 
			"<h1> Unilink Data Export of Current Event, Sale and Job Postings </h1>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<h2> Export of Event Postings </h2>\n" + 
			"<table>\n" + 
			"<tr>\n" + 
			"<th>EVNT_ID</th>\n" + 
			"<th>EVNT_NAME</th>\n" + 
			"<th>EVNT_CREATID</th>\n" + 
			"<th>EVNT_STATUS</th>\n" + 
			"<th>EVNT_DESCRIPTION</th>\n" + 
			"<th>EVNT_VENUE</th>\n" + 
			"<th>EVNT_DATE</th>\n" + 
			"<th>EVNT_CAPACITY</th>\n" + 
			"<th>EVNT_TYPE</th>\n" + 
			"<th>EVNT_IMAGE </th>\n" + 
			"</tr>\n" + 
			"<tr>\n" + 
			"<!-- This data will come from the database-->";
	
	//this is the HTML data for the event - second part of the file component
	
	private String export_event_data =  " ";
	// this is the export event data to be appended.
	
	
	//this is the HTML content for the sale - third part of the file component
	private String export_content_sale = " </tr>\n" + 
			"</table>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<h2> Export of Sale Postings </h2>\n" + 
			"<table>\n" + 
			"<tr>\n" + 
			"<th>SLE_ID</th>\n" + 
			"<th>SLE_NAME</th>\n" + 
			"<th>SLE_CREATID</th>\n" + 
			"<th>SLE_STATUS</th>\n" + 
			"<th>SLE_DESCRIPTION</th>\n" + 
			"<th>SLE_ASKING_PRICE</th>\n" + 
			"<th>SLE_HIGHEST_OFFER</th>\n" + 
			"<th>SLE_MINIMUM_RAISE</th>\n" + 
			"<th>SLE_DATE</th>\n" + 
			"<th>SLE_TYPE</th>\n" + 
			"<th>SLE_IMAGE</th>\n" + 
			"</tr>\n" + 
			"<tr>\n" + 
			"<!-- This data will come from the database-->\n" + 
			""; 
	 
	//this is the HTML data for the sale - fourth part of the file component
	
	private String export_sale_data =    "";
	// this is the export sale data to be appended.
	
	
	//this is the HTML content for the job - fifth part of the file component
	private String export_content_job= " </tr>\n" + 
			"</table>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<h2> Export of Job Postings </h2>\n" + 
			"<table>\n" + 
			"<tr>\n" + 
			" <th>JB_ID</th>\n" + 
			"<th>JB_NAME</th>\n" + 
			"<th>JB_CREATID</th>\n" + 
			"<th>JB_STATUS</th>\n" + 
			"<th>JB_DESCRIPTION</th>\n" +
			"<th>JB_DATE</th>\n" + 
			"<th>JB_PROPOSED_PRICE</th>\n" + 
			"<th>JB_LOWEST_OFFER </th>\n" + 
			"<th>JB_TYPE</th>\n" + 
			"<th>JB_IMAGE </th>\n" + 
			"</tr>\n" + 
			"\n" + 
			"<tr>\n" + 
			"<!-- This data will come from the database-->";
	 
	
	//this is the HTML data for the job - sixth part of the file component
	
	private String export_jobe_data= " ";
	// this is the export job data to be appended.
	
	
	//this is the HTML content for the export_content - final part of the file component
	private String export_content_final= "</tr>\n" + 
			"</table>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"<br>\n" + 
			"</body>\n" + 
			"</html>";
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//===========================================================================================================
	/*
	 *  Definition of the get_event_data() method
	 *  
	 */
	public String get_event_data()
	{
		//String event_data="";
		StringBuilder event_data = new StringBuilder("");
		
		try 
		{
			Connection db_connect = connectionTest.getConnection(DB_NAME); 
			//Statement statement = db_connect.createStatement(); 
			//statement.execute("DROP TABLE EVENT IF EXISTS;");
			//event_data.append(   ln("EVENT Table dropped");
		
			String query= "Select EVNT_ID,EVNT_NAME,EVNT_CREATID,EVNT_STATUS,EVNT_DESCRIPTION, EVNT_VENUE,EVNT_DATE, EVNT_CAPACITY,EVNT_TYPE,EVNT_IMAGE FROM EVENT;";
		
			PreparedStatement ps = db_connect.prepareStatement(query);
				query_result= ps.executeQuery();
			
				while (query_result.next()) 
				{
					event_data.append("<tr><td>"+   query_result.getString("EVNT_ID")    					+ "</td>" 	);
					event_data.append("<td>"+   query_result.getString("EVNT_NAME") 					+ "</td>"	);
					event_data.append("<td>"+   query_result.getString("EVNT_CREATID") 					+ "</td>"  	);
					event_data.append("<td>"+   query_result.getString("EVNT_STATUS") 					+ "</td>" 	);
					event_data.append("<td>"+   query_result.getString("EVNT_DESCRIPTION")				+ "</td>" 	);
					event_data.append("<td>"+   query_result.getString("EVNT_VENUE") 					+ "</td>"    );
					event_data.append("<td>"+   query_result.getString("EVNT_DATE") 					+ "</td>"    );
					event_data.append("<td>"+   String.valueOf( query_result.getInt("EVNT_CAPACITY")  )  + "</td>"    );
					event_data.append("<td>"+   query_result.getString("EVNT_TYPE") 					+ "</td>"     );
					event_data.append("<td>"+   query_result.getString("EVNT_IMAGE")					+ "<td></tr>"     );

				}//close while statement
		
		
	 
		
		} // Close the try block
		catch(Exception e) 
		{
			System.out.println( e);
		}//close catch(Exception e) 
	

		
		return event_data.toString();
		
	}// close 
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//===========================================================================================================
	/*
	*  Definition of the get_sale_data() method
	*  
	*/
	public String get_sale_data()
	{
		//String sale_data="";
		StringBuilder sale_data = new StringBuilder("");
		try 
		{
			Connection db_connect = connectionTest.getConnection(DB_NAME); 
			//Statement statement = db_connect.createStatement(); 
			//statement.execute("DROP TABLE EVENT IF EXISTS;");
			//sale_data.append(   ln("EVENT Table dropped");
		
			String query= "Select SLE_ID,SLE_NAME,SLE_CREATID,SLE_STATUS,SLE_DESCRIPTION, SLE_ASKING_PRICE, SLE_HIGHEST_OFFER, SLE_MINIMUM_RAISE, SLE_DATE, SLE_TYPE,SLE_IMAGE FROM SALE;";
			
			PreparedStatement ps = db_connect.prepareStatement(query);
				query_result= ps.executeQuery();
			
				while (query_result.next()) 
				{
					sale_data.append("<tr><td>"+   query_result.getString("SLE_ID")    							+ "</td>" 	);
					sale_data.append("<td>"+   query_result.getString("SLE_NAME") 							+ "</td>"	);
					sale_data.append("<td>"+   query_result.getString("SLE_CREATID") 						+ "</td>"  	);
					sale_data.append("<td>"+   query_result.getString("SLE_STATUS") 						+ "</td>" 	);
					sale_data.append("<td>"+   query_result.getString("SLE_DESCRIPTION")					+ "</td>" 	);
					sale_data.append("<td>"+   String.valueOf( query_result.getInt("SLE_ASKING_PRICE") )  	+ "</td>"    );
					sale_data.append("<td>"+   String.valueOf( query_result.getInt("SLE_HIGHEST_OFFER") )  	+ "</td>"    );
					sale_data.append("<td>"+   String.valueOf( query_result.getInt("SLE_MINIMUM_RAISE") )  	+ "</td>"    );
					sale_data.append("<td>"+   query_result.getString("SLE_DATE") 							+ "</td>"    );	
					sale_data.append("<td>"+   query_result.getString("SLE_TYPE") 							+ "</td>"    ); 		
					sale_data.append("<td>"+   query_result.getString("SLE_IMAGE")							+ "</td></tr>"    );

				}//close while statement
		
		
	 
		
		} // Close the try block
		catch(Exception e) 
		{
			System.out.println( e);
		}//close catch(Exception e) 
		
		
		return sale_data.toString();
		
	}// close 
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//===========================================================================================================
	/*
	 *  Definition of the get_job_data() method
	 *  
	 */	
	public String get_job_data()
	{
		//String job_data="";
		StringBuilder job_data = new StringBuilder("");
		try 
	{
		Connection db_connect = connectionTest.getConnection(DB_NAME); 
		//Statement statement = db_connect.createStatement(); 
		//statement.execute("DROP TABLE EVENT IF EXISTS;");
		//JOB_data.append(   ln("EVENT Table dropped");
	
		
		String query= "Select JB_ID,JB_NAME,JB_CREATID,JB_STATUS,JB_DESCRIPTION,JB_DATE,JB_PROPOSED_PRICE,JB_LOWEST_OFFER,JB_TYPE,JB_IMAGE FROM JOB;";
		PreparedStatement ps = db_connect.prepareStatement(query);
			query_result= ps.executeQuery();
		
			while (query_result.next()) 
			{
				job_data.append("<tr><td>"+   query_result.getString("JB_ID")    							+ "</td>" 	);
				job_data.append("<td>"+   query_result.getString("JB_NAME") 							+ "</td>"	);
				job_data.append("<td>"+   query_result.getString("JB_CREATID") 							+ "</td>"  	);
				job_data.append("<td>"+   query_result.getString("JB_STATUS") 							+ "</td>" 	);
				job_data.append("<td>"+   query_result.getString("JB_DESCRIPTION")						+ "</td>" 	);
				job_data.append("<td>"+   query_result.getString("JB_DATE") 							+ "</td>"    );
				job_data.append("<td>"+   String.valueOf( query_result.getInt("JB_PROPOSED_PRICE") )  	+ "</td>"    );
				job_data.append("<td>"+   String.valueOf( query_result.getInt("JB_LOWEST_OFFER") )  	+ "</td>"    );	
				job_data.append("<td>"+   query_result.getString("JB_TYPE") 							+ "</td>"    ); 		
				job_data.append("<td>"+   query_result.getString("JB_IMAGE")							+ "</td></tr>"    );


			}//close while statement
	
	
 
	
	} // Close the try block
	catch(Exception e) 
	{
		System.out.println( e);
	}//close catch(Exception e) 
		
		return job_data.toString();
		
	}// close 
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//===========================================================================================================
		/*
		 *  Definition of the get_about_this_development() method
		 *  about_this_development_content
		 */
		public String get_about_this_development()
		{
			return about_this_development_content;
		}// close public String get_about_this_development()
	
	//===========================================================================================================
	/*
	 *  Definition of the get export_content() method
	 *  
	 */
	public String get_export_content()
	{
		StringBuilder export_content = new StringBuilder("");
		export_content.append(export_content_event);
		export_content.append(  get_event_data() );
		export_content.append(export_content_sale);
		export_content.append( get_sale_data() );
		export_content.append(export_content_job);
		export_content.append( get_job_data() );
		export_content.append(export_content_final);
		
		
		
		
		return export_content.toString();
	}// close public String export_content()
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//===========================================================================================================
	/*
	 *  Definition of class Method
	 */
}// close class
