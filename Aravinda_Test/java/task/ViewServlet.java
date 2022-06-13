package task;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='LogIn.html'>Add New Employee</a>");  
        out.println("<h1>Employees List</h1>");  
          
        List<Emp> list=EmpDrive.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
    
        for(Emp e:list){  
         out.print("<tr><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td></tr> "); 
                
        }  
        out.print("</table>");  
          
        out.close();  
    }  
} 