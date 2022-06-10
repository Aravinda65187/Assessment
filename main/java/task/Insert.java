package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert {

	public static void main(String[] args) 
	{
	
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro","postgres","postgres");
			st=con.createStatement();
			//String sql="insert into employee values(104,'pravin','pondy','1236329','pravin@gamil.com',50000);";
			String sql1="insert into employee values(106,'pranesh','westbengal',null,'pranesh@gamil.com',50690);";
			int sql=st.executeUpdate(sql1);
			System.out.println(sql);
		}
		catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e);
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}

}
