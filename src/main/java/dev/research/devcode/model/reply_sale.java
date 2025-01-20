package dev.research.devcode.model;

public class reply_sale extends Reply
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	//private double reply_sale_value=0.00;
	// this has  been zeroed out as this is not needed for replying to an sale.
	
	
	/*
	 * 
	 */
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	/* You're required to implement at least one constructor to initialize all 
	 * the attributes shown above when a reply object is created.
	 * 
	 */
	public reply_sale
			(
			String reply_sale_post_id,
			double reply_sale_value,
			String reply_sale_responder_id	
			)

{
	// insert implementation here.
		super
		(
		reply_sale_post_id, 
		reply_sale_value, 
		reply_sale_responder_id
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

}// close class reply_sale
