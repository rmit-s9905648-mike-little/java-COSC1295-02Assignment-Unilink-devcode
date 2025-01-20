package dev.research.devcode;//package java;

////////////////////////////////////////////////////////////////////////////////
	/*--------------------------------------------------------------------------
	 * This is a project of...
	 * Michael John Little
	 * email: mlittle@hadarach-consulting.mygbiz.com
     * Mob: +61 476 136 482
	 *
	 *
	 * -------------------------------------------------------------------------
	 *  THIS IS THE  java.unilink class that contains the MAIN METHOD.
	 *
	 *
	 *
	/*--------------------------------------------------------------------------
	 *
	 */

////////////////////////////////////////////////////////////////////////////////

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

// import the database creation and setups


import dev.research.devcode.model.table_setup_event;
import dev.research.devcode.model.table_setup_sale;
import dev.research.devcode.model.table_setup_job;

import dev.research.devcode.model.table_setup_reply_event;
import dev.research.devcode.model.table_setup_reply_sale;
import dev.research.devcode.model.table_setup_reply_job;

import dev.research.devcode.model.table_setup_session;
import dev.research.devcode.model.table_setup_view_postings;



public class unilink extends Application
// This is the main class.
{
    //insert content from here.
    ///////////////////////////////////////////////////////////////////////////
    //Define Class Constructor from here
    //public java.unilink()
   // {
        // this constructor is empty for now.
        //login= new ViewLoginUI();
        //login= new table_setup_login ();
        //session= new table_setup_session();

   // }// end java.unilink() constructor

    ///////////////////////////////////////////////////////////////////////////
    //Define Class Methods from here





    //=========================================================================
    public void start_unilink()
    {

        // TODO Auto-generated method stub
        //ui_login login=new ui_login();

        Stage primaryStage = null;
        try
        {
            start(primaryStage);
        }//close try
        catch (Exception e)
        {
            System.out.print(e);
        }

    }// end start_unilink()

    //=========================================================================
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            // TODO Auto-generated method stub
            Parent login_pane = FXMLLoader.load(getClass().getResource("../view/login/LoginUI.fxml"));
            //Parent login_pane = FXMLLoader.load(getClass().getResource("../view/unilink_home/Main.fxml"));
            // this loads the LoginUI.fxml

            primaryStage.setTitle("Login to Unilink");
            //This sets the title of the stage.
            primaryStage.setScene(new Scene(login_pane, 300, 200));
            //primaryStage.setScene(new Scene(login_pane,  640, 400));
            //This sets the scene for the primary stage
            primaryStage.show();

        }
        catch (Exception e)
        {
            //System.out.print(e);
            //e.getStackTrace();
            e.printStackTrace();
            //Throw();
        }

    }//close public void start(Stage primaryStage)

    //=========================================================================
    public static void main(String[] args)
    {
        //launch the Login UI
        launch(args);
    }


}//close public class java.unilink
