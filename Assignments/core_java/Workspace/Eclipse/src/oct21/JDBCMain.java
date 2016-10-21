package oct21;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "root");
		
		PreparedStatement pstmt= con.prepareStatement("UPDATE DEPT SET NAME = ? where id=?");
		pstmt.setString(1,"ResearchAndDevelopment");
		pstmt.setInt(2,3);		
		int updates = pstmt.executeUpdate();
		System.out.println("No of updates: " + updates);
		
		PreparedStatement pstmt_delete= con.prepareStatement("DELETE FROM DEPT WHERE ID=?");
		pstmt_delete.setInt(1, 5);
		int deletes = pstmt_delete.executeUpdate();
		System.out.println("No of deletes: "+deletes);
		
		
		PreparedStatement pstmt_select= con.prepareStatement("Select * from dept");
		ResultSet rs = pstmt_select.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt("ID") + " - " + rs.getString("NAME"));
		}
		
	}

}
