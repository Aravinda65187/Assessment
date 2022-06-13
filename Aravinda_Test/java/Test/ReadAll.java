package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAll
 */
@WebServlet("/ReadAll")
public class ReadAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		 pw.write("<html>");
		 pw.write("<body style='background-color: darkgrey;'>");
		 ResultSet rs=Methods.viewAll(true);
		 show(rs,pw);
		pw.write("<br><br><a href='index.html'>Go Back To Home</a>"); 
		pw.write("</body></html>");
	}
	
	public static void show( ResultSet rs,PrintWriter pw) {
		try {
			 pw.write("<form><table border='1' width =100% >");
			 pw.write("<tr><td>ID</td><td>Roll number</td><td>Name</td><td>Age</td><td>Total Marks</td><td>Grade</td></tr>");
			 while (rs.next()) {
				 pw.write("<tr><td>"+rs.getInt("id")+"<td>"+rs.getInt("Roll_number")+
						 "</td><td>"+rs.getString("Name")+"</td><td>"+rs.getInt("Age")+"</td><td>"+
						 rs.getInt("Total_marks")+"</td><td>"+rs.getString("Grade")+"</td></tr>");
				
			 }
			 pw.write("</table></form>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
