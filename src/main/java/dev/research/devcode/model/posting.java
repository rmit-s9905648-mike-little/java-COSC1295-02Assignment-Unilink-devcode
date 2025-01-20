package dev.research.devcode.model;/*--------------------------------------------------------------------------
	 * This is a project of... 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Mob: +61 476 136 482

	 * 
	 * -------------------------------------------------------------------------
	 *            THIS IS THE posting Class.
	 * 
	 * About this class:
	 * 1. This is a concrete class.
	 * 2. It is extended from the post class. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	////////////////////////////////////////////////////////////////////////////////
public class posting extends post
{
	
	String posting_postdetails;
	// This provides a string containing the details of the post
	
	String posting_reply_details;
	// This provide a string of the event reply details
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	

	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	
	
	public posting(
			String psting__id,
	 		String psting_name,
	 		String psting_description,
	 		String psting_Creatid,
	 		String psting_date,
			String psting_status,
			String psting_type,
			String psting_image
			
		)
	{
		super(
				psting__id, 
				psting_name, 
				psting_description,
				psting_Creatid,
				psting_date,
				psting_status,
				psting_type,
				psting_image
				
			);

		
	}// close constructor posting()
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
	public String getPostDetails() 
	/*This is method that  overrides in the parent class method
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 * 
	 * The output will look like...
	 * 
	 	ID:EVE001
		Title:Programming Study Group Wednesday night
		Description:Let's meet this Wednesday afternoon to finish 
			the programming assignment!
		Creator ID:s3477223
		Status:OPEN
		Venue:RMIT Library
		Date:15/04/2025
		Capacity:5
		Attendees:0
	 * 
	 */
	
	{
		
		//override with your implementation.
		posting_postdetails=
				"                                                 "+	"\n"+
				"------------------------------------------------"+		"\n"+
				"ID:			"+super.getpost_id()+					"\n"+
				"Title:			"+super.getpost_title()+				"\n"+
				"Description:	"+super.getpost_description()+			"\n"+
				"Creator ID:	"+super.getpost_creator_id()+			"\n"+
				"Status:		"+super.getpost_status()+				"\n"+
				"Date:			"+super.getpost_date()+					"\n"+
				"                                                   	\n";
		return posting_postdetails;
		
	}//close public String getPostDetails()

	
	//=========================================================================
	public boolean handleReply(Reply reply)
	
	/*
	 * Your posting class must implement this abstract handleReply method shown 
	 * previously in the Post class to handle a reply to an posting post. 
	 * When a student replies to an posting post to join an posting, details of 
	 * that reply are stored in a Reply object passed to this method 
	 * 
	 * If the reply is valid, the posting is not full and the student 
	 * id is not yet recorded in that posting, then this handleReply 
	 * method must add this reply object to the replies collection 
	 * of this posting post and return true, otherwise the reply will 
	 * not be added to the replies collection and a false value is 
	 * returned. When the posting is full, i.e when the number of 
	 * attendees is equal to capacity, posting status is set to CLOSED.

	 */
	{
		return true;
	}//close  handleReply(Reply reply)
	
	
	//=========================================================================
	public String getReplyDetails()
	/*
	 *  As shown in the Post class, this method should only be called by the post 
	 *  creator on their own posts. It returns a String containing details of all 
	 *  replies to that post. When calling this method on an posting post, this 
	 *  method must return a comma-separated string of the ids of students 
	 *  who have sent replies to join the posting and have been accepted by 
	 *  the system as attendees, according to the following format:
	 *  
	 *  Attendee list: [comma-separated string of attendee id values]
	 *  If an posting has no attendee, then your method should return the
	 *  following string: Attendee list: Empty
	 *  
	 *  when an posting post creator chooses to view his own postings, 
	 *  in addition to details of the posts as shown in the 
	 *  getPostDetails method requirements, the getReplyDetails 
	 *  method will also be called to return a string as shown 
	 *  below (in each posting post, notice the status, 
	 *  capacity, attendees and attendee list fields...
	 *  
	 *  This has the the typical output as...
	 *  
	 *  Attendee list: s3488456,s3599643,s3737458,s3483921
	 *  

	 */
	{
		return posting_reply_details;
	}// close public String getReplyDetails()
	


	
	//=========================================================================
	public String getposting_id()
		/*
	 * 
	 public String getpsting_id()
	// this gets the ID from the parent
	{
		String posting_id="";

		
		//super.getID();
		return posting_id;
	}
	 
	 */
	
	
	// this method gets the Id of the post
	{
		String post_id=super.getpost_id();
		// temporary
		return post_id;
	}// close String getID()
	
	//=========================================================================
	public void setposting_id(String psting_id)
	{
		//post_id=Post_ID;
		//insert implementation here.
		super.setpost_id( psting_id );
	}//
	
	//=========================================================================
	public String getposting_name()
		// this method gets the name of the posting
	{
		String posting_name=super.getpost_title();
		// temporary
		return posting_name;
	}// close String getID()
	
	//=========================================================================
	public void setposting_name(String posting_name)
	// this sets the name or title of the posting
	{
		super.setpost_title(posting_name);
		//insert implementation here.
	}//close setposting_name
	//=========================================================================
	public String getposting_description()
		// this method gets the description of the posting
	{
		String posting_description=super.getpost_description() ;
		// temporary
		return posting_description;
	}// close String getID()
	
	//=========================================================================
	public void setposting_description(String posting_description)
	// this sets the description  of the posting
	{
		super.setpost_description( posting_description ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getposting_creator_id()
		// this method gets the description of the posting
	{
		String posting_creator_id=super.getpost_creator_id() ;
		// temporary
		//System.out.println("getposting_creator_id:"+posting_creator_id);
		return posting_creator_id;
	}// close String getID()
	
	//=========================================================================
	public void setposting_creator_id(String posting_creator_id)
	// this sets the description  of the posting
	{
		System.out.println("setposting_creator_id:"+posting_creator_id);
		super.setpost_creator_id( posting_creator_id  ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getposting_status()
		// this method gets the status of the posting
	{
		String posting_status=super.getpost_status() ;
		// temporary
		return posting_status;
	}// close String getID()
	
	//=========================================================================
	public void setposting_status(String posting_status)
	// this sets the status  of the posting
	{
		super.setpost_status( posting_status ); ;
		//insert implementation here.
	}//close set posting_status
	
	
	
	//=========================================================================
	public String getposting_date()
		// this method gets the date of the posting
	{
		String posting_date=super.getpost_date() ;
		// temporary
		return posting_date;
	}// close String getposting_venue()
	
	//=========================================================================
	public void setposting_date(String psting_date)
	// this sets the date  of the posting
	{
		super.setpost_date( psting_date ); ;
		//insert implementation here.
	}//close setposting_date(String psting_date)
	
	
	//=========================================================================
		public String getposting_type()
			// this method gets the type of the posting
		{
			String posting_type=super.getpost_type() ;
			// temporary
			return posting_type;
		}// close String getposting_type()
		
	//=========================================================================
		public void setposting_type(String posting_type)
		// this sets the type  of the posting
		{
			super.setpost_type( posting_type ); ;
			//insert implementation here.
		}//close setposting_type(String posting_type)
		
	//=========================================================================
				public String getposting_image()
					// this method gets the image of the posting
				{
					String posting_image=super.getpost_image() ;
					// temporary
					return posting_image;
				}// close String getposting_image()
				
	//=========================================================================
				public void setposting_image(String posting_image)
				// this sets the image  of the posting
				{
					super.setpost_image( posting_image ); ;
					//insert implementation here.
				}//close setposting_image(String posting_image)
		
	
	

	
	
	/*
	 * 
	 */

}// close the event class
