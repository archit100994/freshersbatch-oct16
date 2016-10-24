package oct24;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImageSave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		
		PreparedStatement pstmt = 
				con.prepareStatement("INSERT INTO IMAGETABLE VALUES (?, ?)");
		pstmt.setString(1,  "Tom");
		
		File file = new File("C:/Users/jain_ar/Desktop/download.jpg");
		FileInputStream fis = new FileInputStream(file);
		pstmt.setBinaryStream(2, fis, file.length());
		//pstmt.setAsciiStream(3, fis, file.length());
		pstmt.executeUpdate();
		
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM IMAGETABLE");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1) + rs.getBlob(2));
		}
		

	}

}
