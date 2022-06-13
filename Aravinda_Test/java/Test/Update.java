package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<body style='background-color: darkgrey;'>");
		pw.write("<form ><center>");
		pw.write("<h1>Update</h1><br><br><br>");
	
		pw.write("<center>RollNumber</center><input type='text' name='RollNumber'><br>");
		
		
		pw.write("<center>TotalMarks</center><input type='text' name='TotalMarks'><br>");
		pw.write("<center>Grade</center><input type='text' name='Grade'><br><br>");
		pw.write("<input type='submit' name='Create' value='ADD' formaction='Update2'>");
		pw.write("<br><br><a href='index.html'>Go Back To Home</a>"); 
		pw.write("</center></form >");
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
