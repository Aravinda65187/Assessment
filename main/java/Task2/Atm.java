package Task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Atm
 */
@WebServlet("/Atm")
public class Atm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int paper =10;
	public static int bal =10000;
	public static String current;
	public static HashMap<String, Integer> hm=new HashMap<String, Integer>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Atm() {
        super();
        hm.put("1111111111111111",1111);
		hm.put("2222222222222222",2222);
        // TODO Auto-generated constructor stub
    }
    
    public int check(String num,String p) throws InvalidCardNumber, InvalidPin {
    	int i=0;
    	if(num.length()!=16) {
			
			throw new InvalidCardNumber(num);
		}
    	else {
    		i++;
    		}
    	
        if(p.length()!=4) {
			
			throw new InvalidPin(p);
			
			
		}
        else {
    		i++;
    		}
        return i;
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String num= request.getParameter("accnum");
		String pin= request.getParameter("pin");
		current=num;
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.write("<body style='background-color: rgb(37, 37, 37)'>");
		pw.write("<center >");
		 pw.write("<br><br>");
		 
		 
		try {
			int p=Integer.parseInt(pin);
			
				
				if(check(num,pin)==2) {
					
					
					if((hm.get(num)==p)){
						
						response.sendRedirect("Menu");
					}
			}
		
			 

	    } catch (InvalidCardNumber e) {
			// TODO: handle exception
	    	
	    	pw.write("<img alt='Gopal' src='index2.jpg' height='188' width='105'>");
			pw.write("<h2 style='color: cornsilk'> "+e.Show()+" </h2>");
	    	System.out.println(e.Show());
	    	//pw.write("\t"+e.Show());
		}
		catch (InvalidPin e2) {
			// TODO: handle exception
			pw.write("<img alt='Gopal' src='go.jpg' height='150' width='183'>");
			pw.write("<h2 style='color: cornsilk'> "+e2.Show()+" </h2>");
			//pw.write("\t"+e2.Show());
			System.out.println(e2.Show());
		}
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
