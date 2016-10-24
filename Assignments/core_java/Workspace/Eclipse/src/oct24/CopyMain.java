package oct24;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class CopyMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		
		
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		
//		Statement stm= con.createStatement();
//		int create= stm.executeUpdate("CREATE TABLE EMP_COPY ( ID NUMBER(4) , NAME VARCHAR2(30) , SALARY NUMBER(8),	COMMISSION NUMBER(8), ROLE VARCHAR2(30), DEPT_NO NUMBER(3), HIRED_DATE DATE, MANAGER_ID NUMBER(4))");
//		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO EMP_COPY VALUES(?,?,?,?,?,?,?,?)");
		
		while(rs.next())
		{
			pstmt.setInt(1, rs.getInt(1));
			pstmt.setString(2, rs.getString(2));
			pstmt.setInt(3, rs.getInt(3));
			pstmt.setInt(4, rs.getInt(4));
			pstmt.setString(5, rs.getString(5));
			pstmt.setInt(6, rs.getInt(6));
			pstmt.setDate(7, rs.getDate(7));
			
			//System.out.println(rs.getString(8));
			
			pstmt.setInt(8, rs.getInt(8));
			
			int updates=pstmt.executeUpdate();
		}
		
		
		
	}

}
