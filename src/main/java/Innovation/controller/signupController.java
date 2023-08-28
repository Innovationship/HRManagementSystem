package Innovation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import Innovation.Dao.signup_Dao;
import Innovation.bo.Signup_bo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class debitcontroller
 */
@WebServlet("/signupController")
public class signupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public signupController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		 String email=request.getParameter("email");
		 String First_Name=request.getParameter("First_Name");
		 String Last_Name=request.getParameter("Last_Name");
		 String E_mail_Address=request.getParameter("E_mail_Address");
		 String password=request.getParameter("password");
		 String confir_password=request.getParameter("confir_password");
		 
		
		 Signup_bo em=new Signup_bo();
		 
		 em.setE_mail_Address(email);
		 em.setFirst_Name(First_Name);
		 em.setLast_Name(Last_Name);
		 em.setE_mail_Address(E_mail_Address);
		 em.setPassword(password);
		 em.setPassword(confir_password);
		 
		 int status=signup_Dao.signup(em);
		 
		 if(status>0)
		 {
			 pw.print("scussess");
		   	RequestDispatcher rd=request.getRequestDispatcher("");
			 rd.forward(request, response);
		 }
		 else
		 {
			 pw.print("somthing went rong...!!");
			 RequestDispatcher rd=request.getRequestDispatcher("");
			rd.include(request, response);
		 }
	}

}
