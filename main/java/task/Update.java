package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Update {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","postgres");
			st=con.createStatement();
			
			String update="update empdet set password=?, where name=?;";
			int updates=st.executeUpdate(update);
			System.out.println(updates);
		}
		catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e);
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}

	}

}
