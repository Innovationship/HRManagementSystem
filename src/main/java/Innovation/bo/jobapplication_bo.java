package Innovation.bo;


public class jobapplication_bo
{
	private String Email_Address;
	private String Todays_Date;
	private String Name;
	private String Date_Of_Birth;
	private String Position_hired;
	private String Permanent_Address;
	private String Contact_No;
	private String Joining_Date;
	private String Ending_Date;
	private String duration_internship;
	
	
	public jobapplication_bo(String email_Address, String todays_Date, String name, String date_Of_Birth,
			String position_hired, String permanent_Address, String contact_No, String joining_Date, String ending_Date,
			String duration_internship)
	{
		super();
		Email_Address = email_Address;
		Todays_Date = todays_Date;
		Name = name;
		Date_Of_Birth = date_Of_Birth;
		Position_hired = position_hired;
		Permanent_Address = permanent_Address;
		Contact_No = contact_No;
		Joining_Date = joining_Date;
		Ending_Date = ending_Date;
		this.duration_internship = duration_internship;
	}
	
	
	
	@Override
	public String toString() {
		return "jobapplication_bo [Email_Address=" + Email_Address + ", Todays_Date=" + Todays_Date + ", Name=" + Name
				+ ", Date_Of_Birth=" + Date_Of_Birth + ", Position_hired=" + Position_hired + ", Permanent_Address="
				+ Permanent_Address + ", Contact_No=" + Contact_No + ", Joining_Date=" + Joining_Date + ", Ending_Date="
				+ Ending_Date + ", duration_internship=" + duration_internship + "]";
	}
	
	public String getEmail_Address() 
	{
		return Email_Address;
	}
	public void setEmail_Address(String email_Address) 
	{
		Email_Address = email_Address;
	}
	public String getTodays_Date() 
	{
		return Todays_Date;
	}
	public void setTodays_Date(String todays_Date)
	{
		Todays_Date = todays_Date;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getDate_Of_Birth()
	{
		return Date_Of_Birth;
	}
	public void setDate_Of_Birth(String date_Of_Birth) 
	{
		Date_Of_Birth = date_Of_Birth;
	}
	public String getPosition_hired() 
	{
		return Position_hired;
	}
	public void setPosition_hired(String position_hired) 
	{
		Position_hired = position_hired;
	}
	public String getPermanent_Address() 
	{
		return Permanent_Address;
	}
	public void setPermanent_Address(String permanent_Address)
	{
		Permanent_Address = permanent_Address;
	}
	public String getContact_No() 
	{
		return Contact_No;
	}
	public void setContact_No(String contact_No) 
	{
		Contact_No = contact_No;
	}
	public String getJoining_Date() 
	{
		return Joining_Date;
	}
	public void setJoining_Date(String joining_Date) 
	{
		Joining_Date = joining_Date;
	}
	public String getEnding_Date() 
	{
		return Ending_Date;
	}
	public void setEnding_Date(String ending_Date) {
		Ending_Date = ending_Date;
	}
	public String getDuration_internship() {
		return duration_internship;
	}
	public void setDuration_internship(String duration_internship) {
		this.duration_internship = duration_internship;
	}
	 
	

}
