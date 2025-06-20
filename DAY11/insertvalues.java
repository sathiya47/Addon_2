package Connection;	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class insertvalues {
		public static void main(String[] args) throws ClassNotFoundException, SQLException  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sample";
			String username="root";
			String password ="Kgisl@123";
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String Query="insert into student values(1,'sat',20),(2,'susi',25),(3,'sushmi',30),(4,'udhaya',40)";
			stmt.executeUpdate(Query);
			System.out.println("Table Create suceessfully");
		}
	}


