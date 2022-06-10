package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Withdraw
 */
@WebServlet("/Withdraw")
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Withdraw() {
        super();
      
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		
		out.write("<html><body style='background-color: rgb(37, 37, 37)'>");
		out.write("<center ><br>");
		 out.write("<h1 style='color: cornsilk'> Withdraw</h1><br><br><br>");  
     
           
           
             
           
		   
             
           out.write("<form  method='post'>");  
            
          
           out.write("<h2 style='color: cornsilk;'>Enter Amount </h2><input type='text' name='num' ><br><br>");

          
           out.write("<input id='in' type='submit' value=' Withdraw ' formaction='w2'/>   <input type='submit' value='Back' formaction='Menu'/>");  
           
           out.write("</form>");  
           out.write("</center ></body></html>");
           out.close();  
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
