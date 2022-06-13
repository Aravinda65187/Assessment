package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Showtable {

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
	
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro","postgres","postgres");
			System.out.println("opened database successfully");
			st=con.createStatement();
			rs=st.executeQuery("select * from employee;");
			while(rs.next())
			{
				int id=rs.getInt("emp_id");
				String name=rs.getString("emp_name");
				String city=rs.getString("emp_city");
				String phone=rs.getString("emp_phone");
				String mail=rs.getString("emp_mail");
				int salary=rs.getInt("emp_salary");
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("City : "+phone);
				System.out.println("Phone : "+mail);
				System.out.println("Salary : "+salary);
				System.out.println();
				
			}
			
        }
		catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e);
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}

}
}
