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
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String E_mail_Address=request.getParameter("E_mail_Address");				 
		 String password=request.getParameter("password");
		 
		 
		 if(signup_Dao.Login(E_mail_Address,password))
		 {
			 pw.print("login Succsessfull");
			 RequestDispatcher rd=request.getRequestDispatcher("Home.html");
			 rd.forward(request, response);
		 }
		 else
		 {
			 pw.print("login UnSuccsessfull");
			 RequestDispatcher rd=request.getRequestDispatcher("");
			 rd.include(request, response);
		 }
	}

}
