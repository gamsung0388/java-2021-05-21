package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤패턴: 인스턴스를 하나만 생성해서 재사용//static으로 만들고
	private static Connection conn = null;
	//은닉화
	static Connection getConn() {
		
		//컨넥션을 리턴하는 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		try {//만약 컨넥션 객체가 널이라면 컨넥션이 끊어졌다면
			if(conn == null || conn.isClosed()) {
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//컨넥션객체 생성
				conn = DriverManager.getConnection(url,user,password);
				System.out.println("db연결 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션객체 생성 실패");
			e.printStackTrace();
		}
		return conn;
	}
	//컨넥션 접속 해제 메소드
	public static void dbClose() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("db연결 해체");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


