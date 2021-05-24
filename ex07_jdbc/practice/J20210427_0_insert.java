package ex07_jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import ex07_jdbc.MemberDTO;

public class J20210427_0_insert {
	//한건만 조회
	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstdt = null;
		MemberDTO mb = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디?");
		String userid = sc.nextLine();
		System.out.println("비밀번호?");
		String passwd = sc.next();
		System.out.println("만든 날?");
		int birthyear = sc.nextInt();
		
		String sql = "INSERT INTO MEMBER(USERID,PASSWD,BIRTHYEAR) VALUES( ? , ? , ?)"; 
		
		try {
			pstdt = conn.prepareStatement(sql);
			pstdt.setString(1, userid);
			pstdt.setString(2, passwd);
			pstdt.setInt(3, birthyear);
			int cnt = pstdt.executeUpdate();
			System.out.println(cnt + "건 추가");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
