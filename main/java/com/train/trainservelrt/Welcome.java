package com.train.trainservelrt;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.ObjectInputFilter.Config;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
//		pw.println("<b>welcome<b> ");
//		ServletContext contxt= getServletContext();
//		String greet =contxt.getInitParameter("hello");
//		pw.print(greet);
//		ServletConfig comfig=getServletConfig();
//		String g=comfig.getInitParameter("Gopal");
//		pw.println("<br>"+g);
	
	//pw.print("AAAAAA");
	try {
		Cookie[] cc=request.getCookies();
		pw.print(cc[0].getValue());
		pw.print(cc[1].getValue());
		pw.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		pw.print(e);
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
