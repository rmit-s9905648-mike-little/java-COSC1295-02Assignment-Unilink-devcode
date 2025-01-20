package dev.research.devcode.model;/*--------------------------------------------------------------------------
	 * This is a project of... 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Mob: +61 476 136 482

	 * 
	 * -------------------------------------------------------------------------
	 *            THIS IS THE Job Class.
	 * 
	 * About this class:
	 * 1. This is an abstract class.
	 * 2. It is extended from the post class. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	////////////////////////////////////////////////////////////////////////////////
public class job extends post
{
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes from here
	private int job_proposed_price;
	/*
		the maximum amount of money the job post creator is 
		willing to paid for the job.
	*/
	private int job_lowest_offer;
	/*
		the lowest amount offered among all replies from students 
		interested in taking this job.
	*/
	
	private String job_type;
	// This is the job type
		
	private String job_image;
	//This is the job image
	
	private String post_postdetails;
	// this is a concenated string of the sale.
	
	private String job_reply_details;
	//This stores the details of the replies
	
	
	
	protected Reply job_replies;
	// This stores the details of the replies
	


	///////////////////////////////////////////////////////////////////////////
	//Define Class Constructor from here
	//
	//
	public job( 
				String jb_id, 
				String jb_name, 
				String jb_creatid, 
				String jb_status, 
				String jb_description, 
				String jb_date,  
				int  jb_proposed_price,
				int  jb_lowest_offer,
				String jb_type,
				String jb_image
			) 
	{
	//super( jb_id, jb_name, jb_creatid, jb_status);
	
		super(
				jb_id,
				jb_name,
				jb_description, 
				jb_creatid,
				jb_date,
				jb_status,
				jb_type,
				jb_image
			);
	
	this.job_proposed_price=jb_proposed_price; 
	this.job_lowest_offer=jb_lowest_offer;
	this.job_type=jb_type;
	this.job_image=jb_type;

	}// close constructor job()
	
	///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	
	//=========================================================================
	public String getPostDetails() 
	/*This is method that  overrides in the parent class method
	 * Consider using String buffer and append new items to the string buffer
	 * and print out the string buffer
	 * This will have the output as..
			ID:JOB001
			Title:Moving House
			Description:Need a person to help me move my belongings to a new house
			Creator ID:s3
			Status:OPEN
			Proposed price: $190.00
			Lowest offer:$180.00

	 * 
	 * 
	 */
	
	{
		
		post_postdetails=
				"                                                 "+	"\n"+
				"------------------------------------------------"+		"\n"+
				"ID:				"+super.getpost_id()+					"\n"+
				"Title:				"+super.getpost_title()+				"\n"+
				"Description:		"+super.getpost_description()+			"\n"+
				"Creator ID:		"+super.getpost_creator_id()+			"\n"+
				"Status:			"+super.getpost_status()+				"\n"+
				"Proposed Price:	"+job_proposed_price+					"\n"+
				"Lowest Offer:		"+job_lowest_offer+					"\n"+ 
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
		return job_reply_details;
	}// close public String getReplyDetails()
	
	//=========================================================================
	public String getjob_id()

	
	// this method gets the Id of the post
	{
		String post_id=super.getpost_id();
		// temporary
		return post_id;
	}// close String getID()
	
	
	//=========================================================================
	public void setjob_id(String jb_id)
	{
		//post_id=Post_ID;
		//insert implementation here.
		super.setpost_id( jb_id );
	}//
	
	//=========================================================================
	public String getjob_name()
		// this method gets the name of the job
	{
		String job_name=super.getpost_title();
		// temporary
		return job_name;
	}// close String getjob_name()
	
	//=========================================================================
	public void setjob_name(String job_name)
	// this sets the name or title of the job
	{
		super.setpost_title(job_name);
		//insert implementation here.
	}//close setjob_name
	//=========================================================================
	public String getjob_description()
		// this method gets the description of the job
	{
		String job_description=super.getpost_description() ;
		// temporary
		return job_description;
	}// close String getjob_description()
	
	//=========================================================================
	public void setjob_description(String job_description)
	// this sets the description  of the job
	{
		super.setpost_description( job_description ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getjob_creator_id()
		// this method gets the description of the job
	{
		String job_creator_id=super.getpost_creator_id() ;
		// temporary
		return job_creator_id;
	}// close String getID()
	
	//=========================================================================
	public void setjob_creator_id(String job_creator_id)
	// this sets the description  of the job
	{
		super.setpost_creator_id( job_creator_id  ); ;
		//insert implementation here.
	}//
	
	//=========================================================================
	public String getjob_status()
		// this method gets the status of the job
	{
		String job_status=super.getpost_status() ;
		// temporary
		return job_status;
	}// close String getID()
	
	//=========================================================================
	public void setjob_status(String job_status)
	// this sets the status  of the job
	{
		super.setpost_status( job_status ); ;
		//insert implementation here.
	}//close set job_status
	//=========================================================================
	public int getjob_proposed_price()

	
	// this method gets the Id of the post
	{

		return job_proposed_price;
	}// close String getjob_asking_price()
	
	
	//=========================================================================
	public void setjob_proposed_price(int jb_proposed_price)
	{
		
		//insert implementation here.
		job_proposed_price=jb_proposed_price;
	}//close setjob_minimum_raise(int jb__minimum_raise)
	
	
	
	
	//=========================================================================
	public int getjob_lowest_offer()

	
	// this method gets the Id of the post
	{

		return job_lowest_offer;
	}// close String getjob_lowest_offer()
	
	
	//=========================================================================
	public void setjob_lowest_offer(int jb_lowest_offer)
	{
		
		//insert implementation here.
		job_lowest_offer=jb_lowest_offer;
	}//close setjob_highest_offer(int jb__highest_offer)
	
	//=========================================================================
	
	public String getjob_type()
		// this method gets the type of the job
	{
		String job_type=super.getpost_type() ;
		// temporary
		return job_type;
	}// close getjob_type()

	//=========================================================================
	public void setjob_type(String job_type)
	// this sets the type  of the job
	{
		super.setpost_type( job_type ); ;
		//insert implementation here.
	}//close setjob_type(String job_type)


	//=========================================================================
	public String getjob_image()
	// this method gets the image of the job
	{
	String job_image=super.getpost_image() ;
	// temporary
	return job_image;
	}// close String getjob_image()

	//=========================================================================
	public void setjob_image(String job_image)
	// this sets the image  of the job
	{
	super.setpost_image( job_image ); ;
	//insert implementation here.
	}//close set job_image

}// close the job class
