package Innovation.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Innovation.bo.Signup_bo;
import Innovation.bo.jobapplication_bo;




public class signup_Dao 
{
	public static Connection getConnection()
	{
		Connection con=null;
		
		try
		{
			String url="jdbc:mysql://localhost:3306/Innovationship";
			String username="root";
			String password="rohit";
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection(url,username,password);
			
	         
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return con;
	}
//************************************************************************************************************************************************************************************
	public static int signup(Signup_bo em) 
	{
		
		int status=0;
		try
		{
			Connection con =Signup_bo.getConnection();
			String sql="insert into signup(Username,First_Name,Last_Name,E-mail_Address,Password,Confirm_Password)values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,em.getUsername());
			ps.setString(2,em.getFirst_Name());
			ps.setString(3,em.getLast_Name());
			ps.setString(4,em.getE_mail_Address());
			ps.setString(5,em.getPassword());
			ps.setString(6,em.getConfir_password());
			
			status=ps.executeUpdate();
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
			
		}
		return status;
	}
//********************************************************************************************************************************************************************************
	public static boolean Login(String email, String password)
	{
		boolean status = false;
		
		try 
		{
			Connection con =Signup_bo.getConnection();
			String sql="select * from signup where E-mail_Address=? and Password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		} catch (Exception m)
		{
			System.out.println(m);
		}
		return status;
	}
	
//**************************************************************************************************************************************************************************************
		public static int addjobapplication(jobapplication_bo rt) 
	{
		int status=0;
		try
		{
			Connection con =Signup_bo.getConnection();
			String Quary="insert into Jobapplication(Email_Address,Todays_Date, Name, Date_Of_Birth, Position_hired,Permanent_Address,Contact_No,Ending_Date,Joining_Date,duration_internship)values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(Quary);
			ps.setString(1,rt.getEmail_Address());
			ps.setString(2,rt.getTodays_Date());
			ps.setString(3,rt.getName());
			ps.setString(4,rt.getDate_Of_Birth());
			ps.setString(5,rt.getContact_No());
			ps.setString(6,rt.getEnding_Date());
			ps.setString(7,rt.getJoining_Date());
			ps.setString(8,rt.getDuration_internship());
			
			
			
			status=ps.executeUpdate();
		} 
		catch (Exception e)
		{
			System.out.println(e);
			
		}
		return status;
	}
//*********************************************************************************************************************
	 
}