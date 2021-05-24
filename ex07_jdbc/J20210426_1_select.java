package ex07_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_1_select {

	static Connection conn; //필드: 자동 초기화
	
	public static void main(String[] args) {
		// 오라클 db 연결

		Connection con = DBConn.getConn();
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로딩 성공");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //connection 으로 변환
//			System.out.println("접속성공");
//			
//			//localhost == ip xe 바뀔 수 있음
//		} catch (ClassNotFoundException e) {
//			System.out.println("오라클 드라이버 로딩 실패");
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("오라클 접속 실패");
//			e.printStackTrace();
//		}
//		
//		if(conn == null) return; //컨넥션 실패시 종료
		
		//db 정보 select
		List<Countries> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {//비즈니스 로직
			stmt = conn.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			rs = stmt.executeQuery(sql);//조회
			System.out.println(rs);
			while (rs.next()) {
				String country_name = rs.getString("country_name");
				String country_id = rs.getString("country_id");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id, country_name, region_id);
				list.add(cot);
				
				
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally { //예외가 발생 하든지 안하든지 무조건 실행
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//출력
		System.out.println("---------------------------");
		
		System.out.println(list);
		System.out.println("---------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			Countries c = list.get(i);
			System.out.println(c.getCountry_id() + " "+ c.getCountry_name()+ " "+c.getRegion_id());
		}
		System.out.println("---------------------------");
		for (Countries c : list) {
			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
		}
		
		
		
		
	}

}
