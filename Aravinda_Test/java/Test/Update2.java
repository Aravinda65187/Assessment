package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update2
 */
@WebServlet("/Update2")
public class Update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update2() {
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
		 int RollNumbr =Integer.parseInt((request.getParameter("RollNumber"))) ;
		 int TotalMarks=Integer.parseInt((request.getParameter("TotalMarks"))) ;
		 String grade=request.getParameter("Grade");
		 pw.write("<html>");
		 pw.write("<body style='background-color: darkgrey;'>");
		if(Methods.update(TotalMarks,grade,RollNumbr)>0) {
			
			pw.write("<center><h1> DONE!!! (^_^) </h1></center>");
		}
		else {
			pw.write("<center><h1> ERROR!!! (>_<)</h1></center>");
		}
		pw.write("<br><br><a href='index.html'>Go Back To Home</a>"); 
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
