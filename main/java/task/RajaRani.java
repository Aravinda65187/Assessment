package task;

import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RajaRani
 */
@WebServlet("/RajaRani")
public class RajaRani extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String[] s= {"RAja","RANI","Thirudan","police"};
	private static final ArrayList<String> p = new ArrayList<String>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RajaRani() {
        super();
      
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String n = request.getParameter("name");
		  p.add(n);
		
		  //RequestDispatcher rd = request.getRequestDispatcher("/TP.html");
			//rd.forward(request, response);
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
