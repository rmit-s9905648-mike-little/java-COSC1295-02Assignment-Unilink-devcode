package dev.research.devcode.controller;

////////////////////////////////////////////////////////////////////////////////
/*--------------------------------------------------------------------------
* This is a project of... 
* Michael John Little:9905648@student.rmit.edu.au
* Mob: +61 476 136 482
* 
* -------------------------------------------------------------------------
*            THIS IS THE  java.unilink class that contains the MAIN METHOD.
* 
* 
* 
/*--------------------------------------------------------------------------
* 
*/

////////////////////////////////////////////////////////////////////////////////

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Parent;
import javafx.scene.Scene;
import dev.research.devcode.controller.AlertHelper;


//Import the classes for database query
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dev.research.devcode.model.connectionTest;
import dev.research.devcode.model.table_setup_session;



public class LoginViewController 
/*
 * This class handles the events on the Login UI.
 */
{
	//database connection related variables,
	private String query;
	//This is the SQL query string
	
	PreparedStatement ps;
	PreparedStatement ps2;
	// This is the prepared statement for the SQL query
	
 	private Connection db_connect;
 	// this is the database connection string for SQL query results 

 	private ResultSet query_result;
 	// this is the results set for the 
 	// SQL results
 	
 	final String DB_NAME = "testDB";
 	// This is the database name
	

	
	//User Interface related variables
	@FXML
	private TextField TXTF_login_uname;
	
	private String login_uname;
	// this is the name used for logging in.
	
	@FXML
	private Label LBL_login_warning;
	
	@FXML
	private Button BTN_login_submit;
	
	@FXML
	private Button BTN_login_clear;
	
	@FXML
	private Button BTN_login_quit;
	
	@FXML
	//===================================================================================================================
	/*
	 * This method will initialiise the UI
	 */
	private void initialize() 
 {
	 
	// create and set up the session table
	table_setup_session session= new table_setup_session();
	session.create_session_table();
		
	//BTN_login_submit event handling
		
	//--------------------------------------------------------------------------------------------------------------------
	/*
	 * This  is the BTN_login_submit.setOnAction((event)
	 */
	 BTN_login_submit.setOnAction((event) -> 
	 {
		 //System.out.println(TXTF_login_test_entry.getText()); 
		 // need to insert code to do an SQL query to check the
		 // username exists and return the proper name from the dB
		 Window owner = BTN_login_submit.getScene().getWindow();
		 
		 // need to add other validation rules
		 
		 if( TXTF_login_uname.getText().isEmpty() ) 
		 {
	            // check if the TXTF_login_uname is empty
			 	AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your name");
	            return;
	      }// close if(BTN_login_submit.getText().isEmpty()) 
		 
		 else 
		 {
			 // TXTF_login_uname.getText().isEmpty() ) is not empty
			 // User the value of TXTF_login_uname.getText() to get the login_uname from the form
			 // Then use this to retrieve the FNAME,LNAME  from the Login table
			 // If numberOfRows= query_result.getRow()==1, then there is a match:
			 //		get the FNAME
			 //		get the LNAME
			 //		Create the session table
			 //		Insert into the session table the login_uname, FNAME, LNAME, Status [As 'OPEN']
			 //		Start an alertHelper
			 //		Start the 'unilink_home.fxml" home page, maybe close this login stage
			 //
			 //	if numberOfRows= query_result.getRow()==0, then there was not a match:
			 //		AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your correct username");
			 
			 		
			 

			 //close the Login_UI
			 login_uname=TXTF_login_uname.getText();
			 
			 try 	
			 {
				 //insert from here
				 		db_connect = connectionTest.getConnection(DB_NAME); 
				 		query = "Select FNAME,LNAME from LOGIN WHERE USERID= ? ";
				 		PreparedStatement ps = db_connect.prepareStatement(query);
				 		ps.setString(1,login_uname );
				 		query_result= ps.executeQuery();
				 		//ps.close();
				 		
				 		
				 		if (query_result.next())
				 		// if (query_result.next()) is boolean TRUE
				 		//There is a match a row has been returned from the Login table
						{
							 //System.out.println("Login name is:"+login_uname);
							 String first_name=query_result.getString("FNAME");
							 //System.out.println(first_name);
							 
							 String last_name=query_result.getString("LNAME");
							 //System.out.println(last_name);
				 			// Display a Confirmation Alert that the registration was a success.. 
							 
							//AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Login Successful!", "Welcome " + first_name+ " "+last_name );
							 
							// need to record the session information to be used in the unilink_home page
							 try {
								  	//  Block of code to try
								 	PreparedStatement  ps2 = db_connect.prepareStatement("INSERT INTO SESSION VALUES (?, ?, ?, ?, ?,?,?);");
								 	ps2.setString(1, "sess1");
								 	ps2.setString(2,login_uname);
								 	ps2.setString(3, first_name );
								 	ps2.setString(4, last_name );
								 	ps2.setString(5, "OPEN" );
								 	ps2.setString(6, "" );
								 	ps2.setString(7, "" );
								 	ps2.executeUpdate();
								 	//ps2.close();
								 // the session table is updated with the session information
								 // this will be used in the unilink_home.fxml home page
								 	
								 
								}
								catch(Exception e) 
							 	{
									//  Block of code to handle errors
									System.out.print(e);
								}//close 
							
							 
							 // Now set up the stage and place the "unilink_home" on it.
							 Stage Login_UI_stage = (Stage) BTN_login_quit.getScene().getWindow();
							
							 Login_UI_stage.close();
							 // This closes the Login dialog
							 
							 // now call the unilink_home UI
							 try {
								 	Parent unilink_home = FXMLLoader.load(  getClass().getResource("/view/unilink_home/unilink_home.fxml"));
								 	// Note: the path is not relative to the package that this file is in
								 	// but the CLASSPATH from the src/
								 	Stage unilink_home_stage = new Stage();
								 	unilink_home_stage.setTitle("Welcome to UniLink");
								 	unilink_home_stage.setScene(new Scene(unilink_home));  
								 	unilink_home_stage.show();
								 	 //System.out.print("unilink_home_stage:"+unilink_home_stage.toString() );
							    } //close the try block
							    catch(Exception e) 
							    {
							        //System.out.print(e);
							        e.printStackTrace();
							    }// close the catch block
							 return;
						}// close if (numberOfRows==1)
				 		else
				 		// // if (query_result.next()) is boolean FALSE
				 		//no match, no data retrieved from the Login table.
				 		{
				 			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter correct User Name");
				            return;
				 			
				 		}//numberOfRows!=1) no match
				 		
				 		
			 }
			 catch (Exception e) 
				{
				 	System.out.println(e);
				 //e.printStackTrace();
				}

		 }// close  TXTF_login_uname.getText().isEmpty() ) is not empty
		 
		 
	 });
	 // this closes the BTN_login_submit.setOnAction((event) -> event.
	 
	 
	 
	//--------------------------------------------------------------------------------------------------------------------
		/*
		 * This  is the BTN_login_clear.setOnAction((event) 
		 */
	//BTN_login_clear event handling
	 BTN_login_clear.setOnAction((event) -> 
	 {
		 
		 // Clear the text entered into TXTF_login_uname
		 TXTF_login_uname.setText("" );
	 });
	 // this closes the  BTN_login_clear.setOnAction((event) ->  event
	 
	 
	 
	 
	//--------------------------------------------------------------------------------------------------------------------
		/*
		 * This  is the BTN_login_quit.setOnAction((event)
		 */
	//BTN_login_quit event handling
	 BTN_login_quit.setOnAction((event) -> 
	 {
		 Stage stage = (Stage) BTN_login_quit.getScene().getWindow();
		    stage.close();
	});
	// this closes the  BTN_login_quit.setOnAction((event) ->  event
	 
	 

 
 }// close private void initialize()    
	   
	

}// close public class LoginViewController 
