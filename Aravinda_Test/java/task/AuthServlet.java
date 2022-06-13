package task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final HashMap<String, String> hm=new HashMap<String, String>();


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();//name , password
    	hm.put("a","aa");
    	hm.put("b","bb");
    	hm.put("c","cc");
        
        // TODO Auto-generated constructor stub
    }
    
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String n = request.getParameter("name");
		String p = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		
		if(hm.containsKey(n)&&hm.containsValue(p)){
			pw.println("Name and Password Match");
			pw.print(n+"\t"+p);
		}
		else {
			
			Thread t=new Thread();
		
			RequestDispatcher rd = request.getRequestDispatcher("/LogIn.html");
			rd.forward(request, response);
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
