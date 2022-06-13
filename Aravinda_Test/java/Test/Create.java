package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
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
		pw.write("<h1>Create</h1><br><br><br>");
		pw.write("<center>ID</center><input type='text' name='ID'><br>");
		pw.write("<center>RollNumber</center><input type='text' name='RollNumber'><br>");
		pw.write("<center>Name</center><input type='text' name='Name'><br>");
		pw.write("<center>Age</center><input type='text' name='Age'><br>");
		pw.write("<center>TotalMarks</center><input type='text' name='TotalMarks'><br>");
		pw.write("<center>Grade</center><input type='text' name='Grade'><br><br>");
		pw.write("<input type='submit' name='Create' value='ADD' formaction='Create2'><br><br>");
		pw.write("<a href='index.html'>Go Back To Home</a>"); 
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
