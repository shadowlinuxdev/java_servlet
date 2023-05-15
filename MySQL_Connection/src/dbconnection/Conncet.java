package dbconnection;
import java.sql.*;

public class Conncet {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","nodeMachine");
			Statement stmt = con.createStatement();
			System.out.println("Inserting records....");
			String sql = "Insert into tree values(2)";
			stmt.execute(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
