package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class EmpDrive {
private static String cc="jdbc:postgresql://localhost:5432/demo";
private static String driv="org.postgresql.Driver";
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		

	}
	public static Connection con()
	{
		Connection c=null;
		try {
			Class.forName(driv);
			c=DriverManager.getConnection(cc,"postgres","postgres");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return c;
		
	}	
	public static int save(Emp e) {
		Connection c=con();
		int status = 0;
		try {
		    PreparedStatement ps=c.prepareStatement("insert into EMPDET values (?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());
            status=ps.executeUpdate();
		} catch (Exception err) {
			System.out.println(err);
		}
		return status;
		
		
	}
	
	public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDrive.con(); 
            PreparedStatement ps=con.prepareStatement("update EMPDET set password=? where name=?;");  
            ps.setString(1,e.getPassword());   
            ps.setString(2,e.getName());  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
	 public static int delete(String name){  
	        int status=0;  
	        try{  
	            Connection con=EmpDrive.con(); 
	            PreparedStatement ps=con.prepareStatement("delete from EMPDET where name=?");  
	            ps.setString(1,name);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }
	 
	  public static Emp getEmployeeByName(String name){  
	        Emp e=new Emp();  
	          
	        try{  
	            Connection con=EmpDrive.con();  
	            PreparedStatement ps=con.prepareStatement("select * from EMPDET where name=?");  
	            ps.setString(1,name);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	               
	                e.setName(rs.getString(1));  
	                e.setPassword(rs.getString(2));  
	                
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	    }  
	    public static ArrayList<Emp> getAllEmployees(){  
	    	ArrayList<Emp> list=new ArrayList<Emp>();  
	          
	        try{  
	            Connection con=EmpDrive.con();  
	            PreparedStatement ps=con.prepareStatement("select * from EMPDET");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                Emp e=new Emp();  
	              
	                e.setName(rs.getString(1));  
	                e.setPassword(rs.getString(2));  
	              
	                list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }  
	 
	
}

