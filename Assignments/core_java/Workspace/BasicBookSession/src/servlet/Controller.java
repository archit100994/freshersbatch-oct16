package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward=request.getParameter("forward");
		RequestDispatcher rd;
		
		if(forward.equals("login"))
		{
			rd=request.getRequestDispatcher("Login");
			rd.forward(request, response);
		}
		else if(forward.equals("addbook"))
		{
			rd=request.getRequestDispatcher("AddBook");
			rd.forward(request, response);
		}
		else if(forward.equals("gotocart"))
		{
			rd=request.getRequestDispatcher("AddBook");
			rd.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
