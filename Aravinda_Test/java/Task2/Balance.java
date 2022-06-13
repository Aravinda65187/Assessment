package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Balance
 */
@WebServlet("/Balance")
public class Balance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Balance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter(); 
        pw.write("<html><body style='background-color: rgb(37, 37, 37)'>");
		pw.write("<center ><br>");
		pw.write("<form>");  
		pw.write("<h1 style='color: cornsilk'> Balance Enquiry </h1><br><br><br>");  
		pw.write("<h3 style='color: cornsilk'> NANDRI MEENDUM VARAVUM   </h3><br><br><br>");
		pw.write("<img alt='Gopal' src='govalu1.jpg' height='135' width='105'>");
		pw.write("<h3 style='color: cornsilk'> Balance : "+Atm.bal+"</h3><br><br><br>");  
		
	
	pw.write(" <input type='submit' value='Back' formaction='Menu'/>");
	pw.write("</form>");  
	pw.write("</center >");
	 pw.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
