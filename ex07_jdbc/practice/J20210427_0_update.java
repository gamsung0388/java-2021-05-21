package ex07_jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import ex07_jdbc.MemberDTO;

public class J20210427_0_update  {
	//한건만 조회
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstdt = null;
		MemberDTO mb = null;
		
		String userid = "RAYN9320";
		int birthyear = 9;
		
		String sql = "UPDATE MEMBER\r\n" + 
				"SET BIRTHYEAR = ?\r\n" + 
				"WHERE USERID = ?"; 
		
		try {
			pstdt = conn.prepareStatement(sql);
			pstdt.setInt(1, birthyear);
			pstdt.setString(2, userid);
			
			int cnt = pstdt.executeUpdate();
			System.out.println(cnt +"건 수정");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
