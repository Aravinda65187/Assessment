package task;
    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/EditServlet2")  
    public class EditServlet2 extends HttpServlet {  
        protected void doPost(HttpServletRequest request, HttpServletResponse response)   
              throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
         
          
            String name=request.getParameter("name");  
            String password=request.getParameter("password");  
           
              
            Emp e=new Emp();  
          
            try {
            	e.setName(name);  
            	e.setPassword(password);  
            	 int status=EmpDrive.update(e);  
                 if(status>0){  
                     response.sendRedirect("ViewServlet");  
                 }else{  
                     out.println("Sorry! unable to update record"); } 
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
          
            
              
            out.close();  
        }  
      
    }  