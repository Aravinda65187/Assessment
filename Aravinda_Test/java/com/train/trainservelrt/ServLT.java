package com.train.trainservelrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServLT
 */
@WebServlet("/ServLT")
public class ServLT extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServLT() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		
	    String n = request.getParameter("txtname");
		String p = request.getParameter("txtpwd");
//		
//		if(n.equals("Gopal")&& p.equals("Gopal_Rocks")) {
//			out.print("<html><body><h1>VA YA GOVALUUU !!!</h1></body></html>");
//		}
//		else {
//			out.print("<html><body><h1>YARAA NEE!!!</h1></body></html>");
//		}
//		
		pw.print("hahaha");// pw = printWriter
//RequestDispatcher rd = request.getRequestDispatcher("/Welcome");
	//	rd.forward(request, response);
		//response.sendRedirect("http://www.google.com");
	
		
		//rd.include(request, response);
		Cookie c=new Cookie("n", n);
		response.addCookie(c);
		 c=new Cookie("p", p);
		response.addCookie(c);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
