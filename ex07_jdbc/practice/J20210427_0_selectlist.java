package ex07_jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ex07_jdbc.MemberDTO;

public class J20210427_0_selectlist {
	//한건만 조회
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstdt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<>();
		
		MemberDTO mb = null;
		
		String like = "%1%";
		
		String sql = "SELECT * \r\n" + 
				"FROM MEMBER \r\n" + 
				"WHERE PASSWD LIKE ? ";
		
		try {
			pstdt = conn.prepareStatement(sql);
			pstdt.setString(1, like);
			rs = pstdt.executeQuery();
			if(rs.next()) {
				String userid = "RYAN9320";
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				mb = new MemberDTO(userid,passwd,birthyear,regdate);
				list.add(mb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //예외가 발생 하든지 안하든지 무조건 실행
			try {
				if(rs != null) rs.close();
				if(pstdt != null) pstdt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			MemberDTO m = list.get(i);
			System.out.println(m);
		}
	}

}
