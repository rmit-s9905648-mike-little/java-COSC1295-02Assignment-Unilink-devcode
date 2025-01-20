package dev.research.devcode.model;/*--------------------------------------------------------------------------
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
	////////////////////////////////////////////////////////////////////////////////
public  class Reply 
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	private String reply_post_id;
	// the id of the post which the reply is associated with.
	
	private double reply_value;
	/* a decimal number. For the sake of simplicity, in this assignment, 
	 * a responder needs to enter a positive value as part of a reply to 
	 * a post. Specifically, your program should require a responder to 
	 * enter value 1 to join an event in an event post, or a price he 
	 * or she is willing to pay for an item in a sale post or an amount 
	 * of money he or she wants to be paid to complete the job advertised 
	 * in a job post. See also the sale rules and job rules in 
	 * the sections below.
	 */
	
	private String reply_responder_id;
	// the id of the student who replies.
	
	
	/*
	 * 
	 */
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	/* You're required to implement at least one constructor to initialize all 
	 * the attributes shown above when a reply object is created.
	 */
	public Reply(
				String rply_post_id,
				double rply_value,
				String rply_responder_id	
				)
	{
		// insert implementation here.
		this.reply_post_id=rply_post_id;
		this.reply_value=rply_value;
		this.reply_responder_id=rply_responder_id;
		
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
		return reply_post_id;
	}// close String getrply_post_id()
	
	//=========================================================================
	public void setreply_post_id(String rply_post_ID)
	{
		reply_post_id=rply_post_ID;
		//insert implementation here.
	}//	setrply_post_id(String reply_post_ID)
		
	
	//=========================================================================
	
	public String getreply_responder_id()
	// this method gets the Id of the post
	{
		//reply_responder_id=login id of the responder;
		return reply_responder_id;
	}// close getreply_responder_id()
	
	//=========================================================================
	public void setrply_post_id(String rply_responder_id)
	{
		reply_responder_id=rply_responder_id;
		//insert implementation here.
	}//	setrply_post_id(String rply_responder_id)
	
	//=========================================================================
	public double getreply_value()
	// this method gets the Id of the post
	{
		//reply_responder_id=login id of the responder;
		return reply_value;
	}// close getreply_value()
	
	//=========================================================================
	public void setreply_value(double rply_value)
	{
		reply_value=rply_value;
		//insert implementation here.
	}//	setreply_value(double rply_value)

}// close Replay class.
