package Innovation.controller;

import java.io.IOException;
import java.io.PrintWriter;


import Innovation.Dao.signup_Dao;

import Innovation.bo.jobapplication_bo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CreditController
 */
@WebServlet("/CreditController")
public class jobapplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public jobapplicationController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		 String Email_Address=request.getParameter("Email_Address");			
		 String Todays_Date=request.getParameter("Todays_Date");
		 String Name=request.getParameter("Name");
		 String Date_Of_Birth=request.getParameter("Date_Of_Birth");			
		 String Position_hired=request.getParameter("Position_hired");
		 String Permanent_Address=request.getParameter("Permanent_Address");
		 String Contact_No=request.getParameter("Contact_No");			
		 String Ending_Date=request.getParameter("Ending_Date");
		 String Joining_Date=request.getParameter("Joining_Date");
		 String duration_internship=request.getParameter("duration_internship");
		 //pw.print(Email_Address+Todays_Date);
		 
		 
		 
		 jobapplication_bo rt=new jobapplication_bo(Email_Address,Todays_Date, Name, Date_Of_Birth, Position_hired,Permanent_Address,Contact_No,Ending_Date,Joining_Date,duration_internship);

		 int status = signup_Dao.addjobapplication(rt);

		 
		 if(status>0)
		 {
			RequestDispatcher rd=request.getRequestDispatcher("Succsefully Data Added");
			rd.forward(request, response);
		 }
		 else
		 {
			 pw.print("data not added");
		 }
		 
		 
		
		 
	}

}
