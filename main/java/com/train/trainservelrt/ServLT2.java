package com.train.trainservelrt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServLT2
 */
@WebServlet("/ServLT2")
public class ServLT2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServLT2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out =response.getWriter();
		out.println("<html><body><table border='6'>");
		Enumeration parNAmes = request.getParameterNames();
		
		while (parNAmes.hasMoreElements()) {
			String parNAme = (String) parNAmes.nextElement();
			out.println("<tr><td>"+parNAme+"</td> \n <td>");
			String[] parValues = request.getParameterValues(parNAme);
			
			//r 1 v
			
			
			if(parValues.length==1) {
				String parValue = parValues[0];
				if(parValue.length()==0) 
				{
					out.println("<i>no value<i>");
				}
				else
				{
						out.println(parValue);
						}
					
				}
			else 
			{
				out.println("<ul>");
				
				for (int i = 0; i < parValues.length; i++) {
					out.println("<li>"+parValues[i]);
				}
				out.println("</ul>");
					
				}
			}
		out.println("</table> \n </body> \n </html>");
			
		
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
