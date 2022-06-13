package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.write("<body style='background-color: rgb(37, 37, 37)'>");
		pw.write("<center >");
		pw.write("<img alt='Gopal' src='govalu1.jpg' height='135' width='105'>");
		pw.write("<p style='color: cornsilk'> MENU </p>");
		pw.write("<table ><br>");
		 pw.print("<tr><td><a href='Withdraw'><h2 style='color: cornsilk;'>$ Withdraw</h2></a></td> </tr>"
		 		+ "<tr> <td><a href='MiniStatment'><h2 style='color: cornsilk;'>$ Balance Enquiry  </h2> </a> </td></tr>"
		 		+ "<tr> <td><a href='CheckBookRequest'><h2 style='color: cornsilk;'>$ Check Book Request  </h2> </a> </td></tr>"
		 		+ "<tr> <td><a href='MiniStatment'><h2 style='color: cornsilk;'>$ Mini Statment  </h2> </a> </td></tr>"
		 		+ "<tr> <td><a href='NewFile1.html'><h2 style='color: cornsilk;'>$ BACK TO LOGIN  </h2> </a> </td></tr>");
		 pw.write("</table >");
		 pw.write("</center >");
		 pw.write("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
