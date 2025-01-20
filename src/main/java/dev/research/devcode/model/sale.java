package dev.research.devcode.model;/*--------------------------------------------------------------------------
	 * This is a project of... 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Mob: +61 476 136 482

	 * 
	 * -------------------------------------------------------------------------
	 *            THIS IS THE sale Class.
	 * 
	 * About this class:
	 * 1. This is a concrete class.
	 * 2. It is extended from the post class. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	////////////////////////////////////////////////////////////////////////////////
public class sale extends post
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	private int sale_asking_price;
	/*
		Asking_price: the price at which the post creator wants to sell the 
		item. This asking price is not visible to other students (see 
		the Sale post rules section below for more details)
	*/
	
	private int sale_highest_offer=1000000;
	/*
		Highest_offer: the highest price offered among all
		replies from students interested to buy the item. 
		 */

	private int sale_minimum_raise=0;
	/* 
		Minimum_raise: the minimum amount by which a new offer price in a reply 
		must be higher than the highest offer recorded in this sale post 
		(see Sale post rules section below for more details)
	*/ 
	
	private String sale_type;
	// This is the sale type
	
	private String sale_image;
	//This is the sale image
	
	
	
	private String post_postdetails;
	// this is a concenated string of the sale.
	
	private String sale_reply_details;
	// this is a concenated string of the replies to a sale.	
	
	protected Reply sale_replies;
	// This stores the details of the replies
	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	public sale( 
			String sleid, 
			String slename, 
			String sleCreatid, 
			String slepost_status, 
			String sledescription,
			int sle_asking_price, 
			int sle_highest_offer, 
			int sle_minimum_raise, 
			String sle_date,
			String sle_type,
			String sle_image
			) 
	{
		super(
				sleid, 
				slename, 
				sledescription,
				sleCreatid,
				sle_date, 
				slepost_status,
				sle_type,
				sle_image
			);
		
		this.sale_asking_price=sle_asking_price; 
		this.sale_highest_offer=sle_highest_offer;
		this.sale_minimum_raise=sle_minimum_raise;
		this.sale_type=sle_type;
		this.sale_image=sle_type;
	}// close constructor sale()
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	


	//=========================================================================
	public String getPostDetails() 
	/*This is method that  overrides in the parent class method
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 * This will have the output as..
	  		ID:SAL001
			Title:IPad Air 2 64GB
			Description:Excellent working condition, comes with box, cable and charger.
			Creator ID:s3456223
			Status:OPEN
			Minimum raise: $15.00
			Highest offer: NO OFFER
	 * 
	 * 
	 */
	
	{
		
		//override with your implementation.
		//override with your implementation.
		post_postdetails=
				"                                                 "+	"\n"+
				"------------------------------------------------"+		"\n"+
				"ID:			"+super.getpost_id()+					"\n"+
				"Title:			"+super.getpost_title()+				"\n"+
				"Description:	"+super.getpost_description()+			"\n"+
				"Creator ID:	"+super.getpost_creator_id()+			"\n"+
				"Status:		"+super.getpost_status()+				"\n"+
				"Minimum raise:	"+sale_minimum_raise+					"\n"+
				"Highest offer:	"+sale_highest_offer+					"\n"+ 
				"                                                   	\n";
		return post_postdetails;
		
		
	}//close public String getPostDetails()

	
	//=========================================================================
	public boolean handleReply(Reply reply)
	
	/*
	 * Your Event class must implement this abstract handleReply method shown 
	 * previously in the Post class to handle a reply to an event post. 
	 * When a student replies to an event post to join an event, details of 
	 * that reply are stored in a Reply object passed to this method 
	 * 
	 * If the reply is valid, the event is not full and the student 
	 * id is not yet recorded in that event, then this handleReply 
	 * method must add this reply object to the replies collection 
	 * of this event post and return true, otherwise the reply will 
	 * not be added to the replies collection and a false value is 
	 * returned. When the event is full, i.e when the number of 
	 * attendees is equal to capacity, event status is set to CLOSED.
	 * 
	 * This will have the format of..
	 		ID:SAL001
			Title:IPad Air 2 64GB
			Description:Excellent working condition, comes with box, cable and charger.
			Creator ID:s3456223
			Status:CLOSED

	 * 
	 * 
	 * 

	 */
	
	{
		
		return true;
	}// close boolean handleReply(Reply reply)
	
	
	//=========================================================================
	public String getReplyDetails()
	/*
	 *  As shown in the Post class, this method should only be called by the post 
	 *  creator on their own posts. It returns a String containing details of all 
	 *  replies to that post. When calling this method on an event post, this 
	 *  method must return a comma-separated string of the ids of students 
	 *  who have sent replies to join the event and have been accepted by 
	 *  the system as attendees, according to the following format:
	 *  Attendee list: [comma-separated string of attendee id values]
	 *  If an event has no attendee, then your method should return the
	 *  following string: Attendee list: Empty
	 *  
	 *  when an event post creator chooses to view his own events, 
	 *  in addition to details of the posts as shown in the 
	 *  getPostDetails method requirements, the getReplyDetails 
	 *  method will also be called to return a string as shown 
	 *  below (in each event post, notice the status, 
	 *  capacity, attendees and attendee list fields...

	 */
	{
		return sale_reply_details;
	}// close public String getReplyDetails()
	
	//=========================================================================
	public String getsale_id()

	
	// this method gets the Id of the post
	{
		String post_id=super.getpost_id();
		// temporary
		return post_id;
	}// close String getID()
	
	
	//=========================================================================
	public void setsale_id(String sle_id)
	{
		//post_id=Post_ID;
		//insert implementation here.
		super.setpost_id( sle_id );
	}//
	
	//=========================================================================
	public String getsale_name()
		// this method gets the name of the sale
	{
		String sale_name=super.getpost_title();
		// temporary
		return sale_name;
	}// close String getsale_name()
	
	//=========================================================================
	public void setsale_name(String sale_name)
	// this sets the name or title of the sale
	{
		super.setpost_title(sale_name);
		//insert implementation here.
	}//close setsale_name
	//=========================================================================
	public String getsale_description()
		// this method gets the description of the sale
	{
		String sale_description=super.getpost_description() ;
		// temporary
		return sale_description;
	}// close String getsale_description()
	
	//=========================================================================
	public void setsale_description(String sale_description)
	// this sets the description  of the sale
	{
		super.setpost_description( sale_description ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getsale_creator_id()
		// this method gets the description of the sale
	{
		String sale_creator_id=super.getpost_creator_id() ;
		// temporary
		return sale_creator_id;
	}// close String getID()
	
	//=========================================================================
	public void setsale_creator_id(String sale_creator_id)
	// this sets the description  of the sale
	{
		super.setpost_creator_id( sale_creator_id  ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getsale_status()
		// this method gets the status of the sale
	{
		String sale_status=super.getpost_status() ;
		// temporary
		return sale_status;
	}// close String getID()
	
	//=========================================================================
	public void setsale_status(String sale_status)
	// this sets the status  of the sale
	{
		super.setpost_status( sale_status ); ;
		//insert implementation here.
	}//close set sale_status
	
	//=========================================================================
	public int getsale_asking_pricee()

	
	// this method gets the Id of the post
	{

		return sale_asking_price;
	}// close String getsale_asking_price()
	
	
	//=========================================================================
	public void setsale_asking_price(int sle_asking_price)
	{
		
		//insert implementation here.
		sale_asking_price=sle_asking_price;
	}//close setsale_minimum_raise(int sle__minimum_raise)
	
	
	
	
	//=========================================================================
	public int getsale_highest_offer()

	
	// this method gets the Id of the post
	{

		return sale_highest_offer;
	}// close String getsale_highest_offer()
	
	
	//=========================================================================
	public void setsale_highest_offer(int sle_highest_offer)
	{
		
		//insert implementation here.
		sale_highest_offer=sle_highest_offer;
	}//close setsale_highest_offer(int sle__highest_offer)
	

	//=========================================================================
	public int getsale_minimum_raise()

	
	// this method gets the Id of the post
	{

		return sale_minimum_raise;
	}// close String getsale_minimum_raise()
	
	
	//=========================================================================
	public void setsale_minimum_raise(int sle_minimum_raise)
	{
		
		//insert implementation here.
		sale_minimum_raise=sle_minimum_raise;
	}//close setsale_minimum_raise(int sle__minimum_raise)
	
	//=========================================================================
	public String getsale_type()
		// this method gets the type of the sale
	{
		String sale_type=super.getpost_type() ;
		// temporary
		return sale_type;
	}// close getsale_type()

	//=========================================================================
	public void setsale_type(String sale_type)
	// this sets the type  of the sale
	{
		super.setpost_type( sale_type ); ;
		//insert implementation here.
	}//close setsale_type(String sale_type)


	//=========================================================================
	public String getsale_image()
	// this method gets the image of the sale
	{
	String sale_image=super.getpost_image() ;
	// temporary
	return sale_image;
	}// close String getsale_image()

	//=========================================================================
	public void setsale_image(String sale_image)
	// this sets the image  of the sale
	{
	super.setpost_image( sale_image ); ;
	//insert implementation here.
	}//close set sale_image
	
	
	

}// close the sale class
