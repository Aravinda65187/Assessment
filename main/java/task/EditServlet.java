package task;
    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/EditServlet")  
    public class EditServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            out.println("<h1>Update Employee</h1>");  
          //  String name=request.getParameter("name"); 
            
            
              
            //Emp e=EmpDrive.getEmployeeByName(name); 
            
              
            out.print("<form  method='post'>");  
            out.print("<table>");  
           
            out.print("<tr><td>Name:</td><td><input type='text' name='name' /></td></tr>");
           // out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getPassword()+"'/></td></tr>");
            out.print("<tr><td>password:</td><td><input type='text' name='password' /></td></tr>");
            out.print("<tr><td colspan='2'><input type='submit' value=' Save ' formaction='EditServlet2'/></td></tr>");  
            out.print("</table>");  
            out.print("</form>");  
              
            out.close();  
        }  
    }  