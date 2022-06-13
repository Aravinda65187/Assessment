package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBookRequest
 */
@WebServlet("/CheckBookRequest")
public class CheckBookRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBookRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter(); 
        pw.write("<html><body style='background-color: rgb(37, 37, 37)'>");
		pw.write("<center ><br>");
		pw.write("<h1 style='color: cornsilk'> Check Book Request </h1><br><br><br>"); 
		pw.write("<img alt='vadivelu' src='i.jpeg' height='159' width='318'>");
		pw.write("<h2 style='color: cornsilk'> HAAAA Check Book THOLACHITIYA</h2><br><br><br>");
		//pw.write("<h1 style='color: cornsilk'> Check Book VARUM PORU </h1><br><br><br>");
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
