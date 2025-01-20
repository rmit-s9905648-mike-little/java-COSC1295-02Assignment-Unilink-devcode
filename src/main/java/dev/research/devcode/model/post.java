package dev.research.devcode.model;/*--------------------------------------------------------------------------
	 * This is a project of... 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Mob: +61 476 136 482

	 * 
	 * -------------------------------------------------------------------------
	 *            THIS IS THE Post Class.
	 * 
	 * About this class:
	 * 1. This is an abstract class.
	 * 2. It is extended to the Event, Sale, and job class. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	
	////////////////////////////////////////////////////////////////////////////////
public abstract class post 
{
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	private String post_id;
	// a string which uniquely identifies each post. The UniLink system 
	// must generate a unique id for each newly created post according 
	// to the following format
	/*
	 * And..
	 * An event post id begins with the string "EVE" followed by a three-digit, 
	 * zero-padding number. The first event post has id EVE001, the subsequent 
	 * event posts have id EVE002, EVE003, EVE004, EVE005…
	 * A sale post id begins with the string "SAL" followed by a three-digit, 
	 * zero-padding number. The first sale post has id SAL001, 
	 * the subsequent sale posts have ids SAL002, SAL003, SAL004, SAL005...
	 * A job post id begins with the string "JOB" followed by a three-digit, 
	 * zero-padding number. For example, the first job post has id JOB001, 
	 * the subsequent job posts have id JOB002, JOB003, JOB004, JOB005..
	 */

	private String post_title; //name
	/* a short string to summarise the post. It can be a name of an event in 
	 * an event post, or name of an item in a sale post 
	 * or name of a job in a job post.
	 */
	
	private String post_description;
	/*
	 * a longer string which provides more information about the post. 
	 * It can be a description of an event, or an item on sale 
	 * or a job specification.
	 */
	
	private String post_creator_id;
	/* A string which is the id of the student who created the post 
	 * in the UniLink system. Student id begins with the character 's'
	 *  followed by a number, for example, s1, s2, s3... are all 
	 *  acceptable student id in this assignment.
	 */
	
	private String post_status;
	/* Indicates whether the post is open to receive replies or closed 
	 * and no longer accepts replies. In your implementation, 
	 * you must make sure that a post status can only 
	 * be either OPEN or CLOSED.
	 * 
	 */
	
	private String post_date;
	// date of the post.

	
	
	private String post_details;
	/*
	 * This is a concatenated string that will return the post details. 
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 * 
	 */
	
	private String post_reply_details;
	/*
	 * This is a concatenated string that will return the reply details. 
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 * 
	 */
	
	private String post_type;
	/* Indicates the type of post
	 * 
	 * 
	 */
	
	private String post_image;
	/* path name and image name to be captured
	 * 
	 * 
	 */
	
	
	
	//protected Reply post_replies;
	// This stores the details of the replies
	
	

	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	
	
	
	
	post(
			 String PST_ID,
			 String PST_NAME,
			 String PST_DESCRIPTION,
			 String PST_CREATID,
			 String PST_DATE,
			 String PST_STATUS,
			 String PST_TYPE,
			 String PST_IMAGE
		)	 
	/*  IMPORTANT!!!!
	   I HAVE COMMENTED OUT THE   Reply  pst_replies
	   for the moment. once I have the post class working.. 
	*/    
	
	// Set post status in the child class
	
	/* Your implementation should not allow constructors in the Post class to 
	 * be used directly to create Post objects. Instead, these constructors 
	 * should only be called in constructors of subclasses of the Post class, 
	 * such as the Event, Sale and Job classes (more details below). 
	 * Remember that one of our objectives is to reduce code duplication, 
	 * especially when initializing common attributes of all post objects.
	 */
	{
		this.post_id =PST_ID;
		this.post_title =PST_NAME;
		this.post_description=PST_DESCRIPTION;
		this.post_creator_id =PST_CREATID;
		this.post_date=PST_DATE;
		this.post_status =PST_STATUS;
		this.post_type =PST_TYPE;
		this.post_image =PST_IMAGE;
		//this.post_replies=pst_replies;
	}// close the Post constructor
	
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	
	//=========================================================================
	public String getPostDetails() 
	/*This is an abstract method that will be overriden in the child class
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 */
	
	{
		
		//override with your implementation.
		return post_details;
		
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

	 */
	{
		return true;
	}// close  handleReply(Reply reply)
	
	
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
		return post_reply_details;
	}// close public String getReplyDetails()
	
	
	
	//=========================================================================
	public String getpost_id()
	// this method gets the Id of the post
	{
		//post_id="EVE001";
		return post_id;
	}// close String getID()
	
	//=========================================================================
	public void setpost_id(String Post_ID)
	{
		post_id=Post_ID;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getpost_title()
	{
		return post_title;
	}// close gettitle;
	
	//=========================================================================
	public void setpost_title(String name)
	{
		post_title=name;
	}// close Settitle()
	
	
	//=========================================================================
	public String getpost_description()
	{
		return post_description;
	}// close getDescription;
	
	
	//=========================================================================
	public void setpost_description(String Descr)
	{
		post_description=Descr;
	}// close Set	
	
	//=========================================================================
	public String getpost_date()
	{
		return post_date;
	}// close getDescription;
	
	
	//=========================================================================
	public void setpost_date(String event_date)
	{
		post_date=event_date;
	}// close Set	
	
	//=========================================================================
	public String getpost_creator_id()
	{
		return post_creator_id;
	}// close getCreator_id;
	
	//=========================================================================
	public void setpost_creator_id(String CreatID)
	{
		post_creator_id=CreatID;
	}// close Set
	
	
	//=========================================================================
	public String getpost_status()
	{
		return post_status;
	}// close getStatus;
	
	//=========================================================================
	public void setpost_status(String Stat)
	{
		post_status=Stat;
	}// close SetStatus	
	
	//=========================================================================

	public String getpost_type()
	{
		return post_type;
	}// close getStatus;
	
	//=========================================================================
	public void setpost_type(String typ)
	{
		post_type=typ;
	}// close SetStatus	
	
	//=========================================================================
	
	public String getpost_image()
	{
		return post_image;
	}// close getStatus;
	
	//=========================================================================
	public void setpost_image(String imge)
	{
		post_image=imge;
	}// close SetStatus	
	
	//=========================================================================
	
	
	/*
	 * 
	 */

}// close the post class.
