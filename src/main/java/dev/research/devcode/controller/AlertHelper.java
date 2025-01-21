package dev.research.devcode.controller;

import javafx.scene.control.Alert;
import javafx.stage.Window;
/*
 * This class will display the Alert Helper, which is a dialog box for 
 * information, or error messages
 */
public class AlertHelper 
{

    public static void showAlert(	Alert.AlertType alertType, 
    								Window owner, 
    								String title, 
    								String message) 
    /* With this:
     * Alert.AlertType.. 
     * CONFIRMATION:	The CONFIRMATION alert type configures the Alert dialog to appear in a 
     * 					way that suggests the content of the dialog is seeking confirmation from the user.
     * 
     * ERROR:			The ERROR alert type configures the Alert dialog to appear in a way that suggests 
     * 					that something has gone wrong.
     * 
     * INFORMATION:		The INFORMATION alert type configures the Alert dialog to appear in a way that 
     * 					suggests the content of the dialog is informing the user of a piece of information.
     * 
     * WARNING:			The WARNING alert type configures the Alert dialog to appear in a way that suggests the
     * 					content of the dialog is warning the user about some fact or action.
     * 
     */
    {
    	Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }// close ShowAlert
}// close class AlertHelper