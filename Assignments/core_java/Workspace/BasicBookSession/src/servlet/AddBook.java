package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList <String> email= new ArrayList <String>();
		
		String[] books=request.getParameterValues("comp");
		HttpSession sn= request.getSession(false);
		
		for(String s: books)
		{
			//session.setAttribute("Book", books);
			email.add(s);
			sn.setAttribute("Book",email);
		}
	
		if(request.getParameter("flag").equals("1"))
		{
			response.sendRedirect("Book2.html");
		}
		else if(request.getParameter("flag").equals("2"))
		{
			response.sendRedirect("Cart");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
