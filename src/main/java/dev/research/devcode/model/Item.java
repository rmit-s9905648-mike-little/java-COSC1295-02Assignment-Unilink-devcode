package dev.research.devcode.model; ////////////////////////////////////////////////////////////////////////////////
/*--------------------------------------------------------------------------
* This is a project of... 
* Michael John Little:9905648@student.rmit.edu.au
* Mob: +61 476 136 482
* 
* -------------------------------------------------------------------------
*            THIS IS THE  item class
*            
*   This is the class for the items in the table view display
*   in the Post Details page.
* 
* 
* 
/*--------------------------------------------------------------------------
* 
*/

////////////////////////////////////////////////////////////////////////////////

import javafx.beans.property.SimpleIntegerProperty;
        import javafx.beans.property.SimpleStringProperty;

public class Item 
{
	 //--------------------------------------------------------------------------------------------------------------------
	/*
	 * 
	 */
	public SimpleStringProperty 	ItemID 					= new SimpleStringProperty();
    public SimpleStringProperty 	ItemDescription 		= new SimpleStringProperty();
    public SimpleStringProperty 	ItemRepliesID			= new SimpleStringProperty();
    public SimpleStringProperty  	ItemRepliesName 		= new SimpleStringProperty();
    //public SimpleDoubleProperty 	ItemValue 				= new SimpleDoubleProperty();
    public SimpleIntegerProperty	ItemValue				= new SimpleIntegerProperty();
    
    
    //--------------------------------------------------------------------------------------------------------------------
	/*
	 * This method gets the ItemID
	 */
    public String getItemID() 
    {
        return ItemID.get();
    }
    
    //--------------------------------------------------------------------------------------------------------------------
	/*
	 * This method gets the ItemDescription
	 */
    public String getItemDescription() 
    {
        return ItemDescription.get();
    }

    //--------------------------------------------------------------------------------------------------------------------
   	/*
   	 * This method gets the ItemRepliesID
   	 */
       public String getItemRepliesID() 
       {
           return ItemRepliesID.get();
       }
    
    
     //--------------------------------------------------------------------------------------------------------------------
     /*
      * This method gets the ItemRepliesName
      */
      public String getItemRepliesName() 
      {
        return ItemRepliesName.get();
      }  
       

    //--------------------------------------------------------------------------------------------------------------------
	/*
	 * This method gets the ItemValue
	 * This is chosen to be Double for Sale and Job posts
	 * But for Events, it will need to be integer.
	 * To get this working I will get it to display Events.
	 */
    public Integer getItemValue() 
    {
        return ItemValue.get();
    }

}// close class item
