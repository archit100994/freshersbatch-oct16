package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
			urlPatterns="/WelcomeServlet",
			initParams= @WebInitParam(name="hello", value="Archit")
	)
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		//String driver= config.getInitParameter("driverClassName");
		//try {
			super.init(config);
			String d=getInitParameter("hello");
			System.out.println(d);
			//Class.forName(driver);
		//} //catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(uname.equals("archit") && pwd.equals("archit"))
		{
			out.println("<html><head><title>Login Successful</title></head><body><h1>LOGIN SUCCESSFUL: "+ uname +"</h1></body></html>");
		}
		else
			out.println("<html><head><title>Login Failed</title></head><body><h1>LOGIN FAILED: "+ uname +"</h1></body></html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
