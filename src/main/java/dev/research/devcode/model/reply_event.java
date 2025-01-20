package dev.research.devcode.model;

/*--------------------------------------------------------------------------
 * This is a project of...
 * Michael John Little:9905648@student.rmit.edu.au
 * Mob: +61 476 136 482

 *
 * -------------------------------------------------------------------------
 *            THIS IS THE Reply Class.
 *
 * About this class:
 * 1. A data structure of your choice, for example an array or array list,
 *    to store all replies to a post. Each reply is an object of the
 *    Reply class.
 * 2. More details about this class are shown in the "Reply class" section
 *    further down this document.
 * 3. Propose to have a data_entity_replies class for storying and
 *    retrieving the replays. and function calls here.
 *
/*--------------------------------------------------------------------------
 *
 */
public class reply_event extends Reply
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	//private double reply_event_value=0.00;
	// this has  been zeroed out as this is not needed for replying to an event.
	
	
	/*
	 * 
	 */
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	/* You're required to implement at least one constructor to initialize all 
	 * the attributes shown above when a reply object is created.
	 * 
	 */
	public reply_event
			(
			String reply_event_post_id,
			double reply_event_value,
			String reply_event_responder_id	
			)

{
	// insert implementation here.
		super
		(
		reply_event_post_id, 
		reply_event_value, 
		reply_event_responder_id
		);	
		
	
}// close the reply class here.
	
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	/* You also need to implement simple accessor and mutator methods 
	 * according to the attributes shown above. 
	 * 
	 */
	//=========================================================================
	public String getreply_post_id()
	// this method gets the Id of the post
	{
		//reply_post_id="EVE001";
		return super.getreply_post_id();
	
	}// close String getrply_post_id()
	
	//=========================================================================
	public void setreply_post_id(String rply_post_ID)
	{
		super.setreply_post_id(rply_post_ID);
		//insert implementation here.
	}//	setrply_post_id(String reply_post_ID)
		
	
	//=========================================================================
	
	public String getreply_responder_id()
	// this method gets the Id of the post
	{
		//reply_responder_id=login id of the responder;
		return super.getreply_responder_id();
		
	}// close getreply_responder_id()
	
	//=========================================================================
	public void setrply_post_id(String rply_responder_id)
	{
		super.setrply_post_id(rply_responder_id);
		//insert implementation here.
	}//	setrply_post_id(String rply_responder_id)
	
	//=========================================================================
	public double getreply_value()
	// this method gets the Id of the post
	{
		//reply_responder_id=login id of the responder;
		return super.getreply_value();
	
	}// close getreply_value()
	
	//=========================================================================
	public void setreply_value(double rply_value)
	{
		super.setreply_value(rply_value);
		
		//insert implementation here.
	}//	setreply_value(double rply_value)

}// close class class reply_event extends Reply
