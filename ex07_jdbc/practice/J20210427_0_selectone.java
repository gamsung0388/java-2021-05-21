package ex07_jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import ex07_jdbc.MemberDTO;

public class J20210427_0_selectone {
	//한건만 조회
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstdt = null;
		ResultSet rs = null;
		MemberDTO mb = null;
		
		String userid = "RYAN9320";
		
		String sql = "SELECT*FROM MEMBER \r\n" + 
				"WHERE USERID = ? "; 
		
		try {
			pstdt = conn.prepareStatement(sql);
			pstdt.setString(1, userid);
			rs = pstdt.executeQuery();
			if(rs.next()) {
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				mb = new MemberDTO(userid,passwd,birthyear,regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(mb.getUserid()+" "+mb.getPasswd()+""+mb.getBirthyear()+ " " + mb.getRegdate());
		
		
	}

}
