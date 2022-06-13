package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Methods {
	public static PreparedStatement ps;
	static String link="jdbc:postgresql://localhost:5432/Student";
	static String UID_PW="postgres";
	public static Connection Connection() {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			
			c=DriverManager.getConnection(link,UID_PW,UID_PW);
			System.out.println("Connected");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
		
		
	}
	public static int add(Student s) {
		int done=0;
		 int ID =s.id;
		 
		try {
			Connection c=Connection();
			ps=c.prepareStatement("INSERT INTO Student VALUES(?,?,?,?,?,?) ");
			ps.setInt(1, ID);
			ps.setInt(2, s.getRollNumbr());
			ps.setString(3, s.getName());
			ps.setInt(4, s.getAge());
			ps.setInt(5, s.getTotalMarks());
			ps.setString(6, s.getGrade());
			 done = ps.executeUpdate();
			 System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return done;
		
	}
	
	public static ResultSet viewAll(boolean check) {
		ResultSet rs = null;
		try {
			Connection c=Connection();
			if(check) {
				ps=c.prepareStatement("SELECT * FROM Student;");
				
			}
			else {
				ps=c.prepareStatement("SELECT * FROM Student WHERE Grade='S';");
			}
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rs;
				
		
	}
	
	public static int delete(int RollNumber) {
		int done=0;
		try {
			Connection c=Connection();
			ps=c.prepareStatement("DELETE FROM Student WHERE roll_number=?;");
			ps.setInt(1, RollNumber);
			done = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return done;
	}
	
	public static int update(int tm,String g,int r) {
		int done=0;
		try {
			Connection c=Connection();
			ps=c.prepareStatement("update Student SET Total_marks=?,Grade=?WHERE roll_number=?;");
			ps.setInt(1, tm);
			ps.setString(2, g);
			ps.setInt(3, r);
			done = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return done;
	}
	
//	public static ResultSet sGrade() {
//		ResultSet rs = null;
//		try {
//			Connection c=Connection();
//			ps=c.prepareStatement("SELECT * FROM Student WHERE Grade=S;");
//			rs = ps.executeQuery();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return rs;
//				
//		
//	}
	

}
