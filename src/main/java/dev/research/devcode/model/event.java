package dev.research.devcode.model;/*--------------------------------------------------------------------------
	 * This is a project of... 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Mob: +61 476 136 482

	 * 
	 * -------------------------------------------------------------------------
	 *            THIS IS THE event Class.
	 * 
	 * About this class:
	 * 1. This is a concrete class.
	 * 2. It is extended from the post class. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	////////////////////////////////////////////////////////////////////////////////
public class event extends post
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	//=========================================================================
	private String event_venue;
	//which is the location of the event

	private String event_date;
	/*
	 * the date when the event happens. For simplicity, no need to store 
	 * the event time. It is sufficient to use a value of type String 
	 * to store a date in the format dd/mm/yyyy, for example 20/03/2020.

	 */
	
	private int event_capacity=0;
	// an integer which is the maximum number of attendees of the event
	
	private int event_attendee_count=0;
	/*
	 * the current number of participants in the event. A newly created event 
	 * has zero attendee count. When a student selects to join the event, 
	 * attendee count increments by one. When the attendee count is equal 
	 * to event capacity, the UniLink system will automatically close the 
	 * event, i.e. the event status set to CLOSED. A closed event no 
	 * longer accepts participants
	 */
	
	private String event_type;
	// This is the event type
	
	private String event_image;
	//This is the event image
	
	String post_postdetails;
	// This provides a string containing the details of the post
	
	String event_reply_details;
	// This provide a string of the event reply details
	
	protected Reply event_replies;
	// This stores the details of the replies
	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	
	
	public event(
			String evnt_id,
	 		String evnt_name,
	 		String evnt_Creatid,
	 		String evnt_status,
			String evnt_description,
			String evnt_venue,
			String evnt_date,
			int evnt_capacity,
			String evnt_type,
			String evnt_image
			
		)
	{
		super(
				evnt_id, 
				evnt_name, 
				evnt_description,
				evnt_Creatid,
				evnt_date, 
				evnt_status,
				evnt_type,
				evnt_image
				
				
				
			);
		this.event_venue=evnt_venue;
		this.event_date=evnt_date;
		this.event_capacity=evnt_capacity;
		this.event_type=evnt_type;
		this.event_image=evnt_type;
		
		
	
	}// close constructor event()
	
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
		post_postdetails=
				"                                                 "+	"\n"+
				"------------------------------------------------"+		"\n"+
				"ID:			"+super.getpost_id()+					"\n"+
				"Title:			"+super.getpost_title()+				"\n"+
				"Description:	"+super.getpost_description()+			"\n"+
				"Creator ID:	"+super.getpost_creator_id()+			"\n"+
				"Status:		"+super.getpost_status()+				"\n"+
				"Date:			"+super.getpost_date()+					"\n"+
				"Capacity		"+event_capacity+						"\n"+
				"Attendees:		"+event_attendee_count+					"\n"+ 
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

	 */
	{
		return true;
	}//close  handleReply(Reply reply)
	
	
	//=========================================================================
	public String getReplyDetails()
	/*
	 *  As shown in the Post class, this method should only be called by the post 
	 *  creator on their own posts. It returns a String containing details of all 
	 *  replies to that post. When calling this method on an event post, this 
	 *  method must return a comma-separated string of the ids of students 
	 *  who have sent replies to join the event and have been accepted by 
	 *  the system as attendees, according to the following format:
	 *  
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
	 *  
	 *  This has the the typical output as...
	 *  
	 *  Attendee list: s3488456,s3599643,s3737458,s3483921
	 *  

	 */
	{
		return event_reply_details;
	}// close public String getReplyDetails()
	


	
	//=========================================================================
	public String getevent_id()
		/*
	 * 
	 public String getevnt_id()
	// this gets the ID from the parent
	{
		String event_id="";

		
		//super.getID();
		return event_id;
	}
	 
	 */
	
	
	// this method gets the Id of the post
	{
		String post_id=super.getpost_id();
		// temporary
		return post_id;
	}// close String getID()
	
	//=========================================================================
	public void setevent_id(String evnt_id)
	{
		//post_id=Post_ID;
		//insert implementation here.
		super.setpost_id( evnt_id );
	}//
	
	//=========================================================================
	public String getevent_name()
		// this method gets the name of the event
	{
		String event_name=super.getpost_title();
		// temporary
		return event_name;
	}// close String getID()
	
	//=========================================================================
	public void setevent_name(String event_name)
	// this sets the name or title of the event
	{
		super.setpost_title(event_name);
		//insert implementation here.
	}//close setevent_name
	//=========================================================================
	public String getevent_description()
		// this method gets the description of the event
	{
		String event_description=super.getpost_description() ;
		// temporary
		return event_description;
	}// close String getID()
	
	//=========================================================================
	public void setevent_description(String event_description)
	// this sets the description  of the event
	{
		super.setpost_description( event_description ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getevent_creator_id()
		// this method gets the description of the event
	{
		String event_creator_id=super.getpost_creator_id() ;
		// temporary
		return event_creator_id;
	}// close String getID()
	
	//=========================================================================
	public void setevent_creator_id(String event_creator_id)
	// this sets the description  of the event
	{
		super.setpost_creator_id( event_creator_id  ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getevent_status()
		// this method gets the status of the event
	{
		String event_status=super.getpost_status() ;
		// temporary
		return event_status;
	}// close String getID()
	
	//=========================================================================
	public void setevent_status(String event_status)
	// this sets the status  of the event
	{
		super.setpost_status( event_status ); ;
		//insert implementation here.
	}//close set event_status
	
	//=========================================================================
	public String getevent_venue()
		// this method gets the status of the event
	{
		
		// temporary
		return event_venue;
	}// close String getevent_venue()
	
	//=========================================================================
	public void setevent_venue(String evnt_venue)
	// this sets the status  of the event
	{
		event_venue = evnt_venue;
		//insert implementation here.
	}//close setevent_venue(String event_venue)
	
	//=========================================================================
	public String getevent_date()
		// this method gets the date of the event
	{
		String event_date=super.getpost_date() ;
		// temporary
		return event_date;
	}// close String getevent_venue()
	
	//=========================================================================
	public void setevent_date(String evnt_date)
	// this sets the date  of the event
	{
		super.setpost_date( evnt_date ); ;
		//insert implementation here.
	}//close setevent_date(String evnt_date)
	
	//=========================================================================
	public int getevent_capacity()
		// this method gets the capacity of the event
	{

		return event_capacity;
	}// close String getevent_venue()
	
	//=========================================================================
	public void setevent_capacity(int evnt_capacity)
	// this sets the date  of the event
	{
		event_capacity=evnt_capacity ;
		//insert implementation here.
	}//close setevent_venue(String event_venue)
	
	//=========================================================================
	public int getevent_event_attendee_count()
	// this method gets the capacity of the event
{	

	return event_attendee_count;
}// close String getevent_venue()
	
	//=========================================================================
	public void setevent_event_attendee_count(int evnt_attendance)
	// this method gets the capacity of the event
{	
		event_attendee_count=evnt_attendance;
	//return event_attendee_count;
}// close String getevent_venue()
	
	//=========================================================================
public String getevent_type()
	// this method gets the type of the event
{
	String event_type=super.getpost_type() ;
	// temporary
	return event_type;
}// close getevent_type()

//=========================================================================
public void setevent_type(String event_type)
// this sets the type  of the event
{
	super.setpost_type( event_type ); ;
	//insert implementation here.
}//close setevent_type(String event_type)


//=========================================================================
public String getevent_image()
// this method gets the image of the event
{
String event_image=super.getpost_image() ;
// temporary
return event_image;
}// close String getevent_image()

//=========================================================================
public void setevent_image(String event_image)
// this sets the image  of the event
{
super.setpost_image( event_image ); ;
//insert implementation here.
}//close set event_image

	
	
	/*
	 * 
	 */

}// close the event class
