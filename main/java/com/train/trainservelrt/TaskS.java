package com.train.trainservelrt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TaskS
 */
@WebServlet("/TaskS")
public class TaskS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TaskS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String n = request.getParameter("name");
		String a = request.getParameter("address");
		String ph = request.getParameter("phone");
		String p = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		HttpSession hp = request.getSession();
		hp.setAttribute("n", n);
		int pl = p.length();
		//char[] ca=p.toCharArray();
		boolean hasN = false;
		
		String[] numb={"1","2","3","4","5","6","7","8","9","0"};
		
		for (int j = 0; j < numb.length; j++) {
			if(p.contains(numb[j])) {
				hasN=true;
				break;
			}
		}
		
		
		
//			for (int i = 0; i < ca.length; i++) {
//				System.out.println(i+""+hasN);
//				for (int j = 0; j < 10; j++) {
//					 if(ca[i]==j) {
//							hasN=true;
//							pw.print(hasN);
//							return;
//							
//						}
//						 else {
//							continue;
//						}
//				}
//				
//			}
		
		
		

		if (n.equals("") && p.equals("")) {
		
			//RequestDispatcher rd= request.getRequestDispatcher("NewFile.html");
			//rd.include(request, response);
			pw.println  ("blank");
			

		} else {
			if (pl > 6) {
				if (hasN) {
					pw.println(n + "\n" + a + "\n" + ph + "\n" + p);

				}
				else {
					pw.println("\n password must have atleast 1 number ");
					
					
				}
			}
			else {
				pw.println("\n password must have more than 6 charactors ");
				
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
