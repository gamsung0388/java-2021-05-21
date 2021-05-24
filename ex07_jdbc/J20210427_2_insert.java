package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_2_insert {

	public static void main(String[] args) {
		// 오라클에 데이터 추가 :insert
		Connection conn = DBConn.getConn();
//		Statement stmt = null;
		
//		sql문을 간결하게 보안에 우수
		PreparedStatement pstnt = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품코드");
		String itemcode = sc.next();
		sc.nextLine(); //엔터값 처리
		System.out.println("상품명");
		String itemname = sc.nextLine();
		System.out.println("상품가격");
		int price = sc.nextInt();
	
//		String sql = "INSERT INTO ITEM(ITEMCODE,ITEMNAME,PRICE) VALUES('"+ itemcode +"','"+itemname+"',"+price+")";
		
		String sql = "INSERT INTO ITEM(ITEMCODE,ITEMNAME,PRICE) VALUES(?,?,?)";
		
		try {
//			conn.setAutoCommit(false);
			 pstnt = conn.prepareStatement(sql); //미리 넘긴다
			//sql문의 ?에 값 대치
			pstnt.setString(1, itemcode);
			pstnt.setString(2, itemname);
			pstnt.setInt(3, price);
			int cnt = pstnt.executeUpdate(); //적용된 건수를 반환 //sql문 X
			System.out.println(cnt+"건 추가");
//			conn.commit();
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}		 
		
		System.out.println("프로그램 종료");
		
	}

}
