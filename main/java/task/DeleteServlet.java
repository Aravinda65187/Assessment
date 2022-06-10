package task;
    import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/DeleteServlet")  
    public class DeleteServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
                 throws ServletException, IOException {  

            try {
          	  String name=request.getParameter("name");
          	 System.out.println("hhhh");
                EmpDrive.delete(name);  
                response.sendRedirect("ViewServlet"); 
  		} catch (Exception e) {
  			System.out.println(e.getStackTrace());
  		}
             
        }  
    }  