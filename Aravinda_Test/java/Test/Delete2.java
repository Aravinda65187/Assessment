package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete2
 */
@WebServlet("/Delete2")
public class Delete2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete2() {
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
		 int RollNumber =Integer.parseInt((request.getParameter("RollNumber"))) ;;
		 if(Methods.delete(RollNumber)>0) {
				
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
