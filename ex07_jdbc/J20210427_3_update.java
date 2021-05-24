package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_3_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		String itemname = "스프라이트";
		String itemcode = "8810";
	
		
		String sql = "UPDATE ITEM\r\n" + 
				"SET ITEMNAME = ? \r\n" + 
				"WHERE ITEMCODE = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt +"건 수정");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
