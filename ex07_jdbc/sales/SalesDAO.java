package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.member.DBConn;

public class SalesDAO {
	//일일 상품 판매리스트
	List<Map<String, Object>> dayitemSalesList(){
		List<Map<String, Object>> list = new ArrayList<>();
		//connection 객체 생성
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE,S.SEQ,S.ITEMCODE,I.ITEMNAME,S.QTY,S.AMOUNT ");
		sb.append("FROM SALES S  JOIN  ITEM I ON(S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE,S.SEQ ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
//				System.out.println(saledate+itemcode+itemname+qty+amount);
				Map<String, Object> map = new HashMap<>(); //매출 한 건 데이터 저장 
				map.put("seldate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//일일 상품별 집계판매
	List<Map<String, Object>> dayitemsumlist(){
		List<Map<String, Object>> list = new ArrayList<>();
		
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE,S.ITEMCODE,MAX(I.ITEMNAME) ITEMNAME,SUM(S.QTY) QTY,SUM(S.AMOUNT) AMOUNT ");
		sb.append("FROM SALES S JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE) ");
		sb.append("GROUP BY S.SALEDATE,S.ITEMCODE ");
		sb.append("HAVING SUM(S.QTY) >3 ");
		sb.append("ORDER BY S.SALEDATE ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs =pstmt.executeQuery();
			if(rs.next()) {
				String saledate = rs.getString("saledate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//상품별 집계판매
		List<Map<String, Object>> itemsumlist(){
			List<Map<String, Object>> list = new ArrayList<>();
			
			Connection conn = DBConn.getConn();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT S.ITEMCODE,I.ITEMNAME,SUM(S.QTY) QTY, SUM(S.AMOUNT) AMOUNT ");
			sb.append("FROM SALES S JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE) ");
			sb.append("GROUP BY S.SALEDATE,S.ITEMCODE ");
			sb.append("ORDER BY S.ITEMCODE; ");
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				rs =pstmt.executeQuery();
				if(rs.next()) {
					String itemcode = rs.getString("itemcode");
					String itemname = rs.getString("itemname");
					int qty = rs.getInt("qty");
					int amount = rs.getInt("amount");
					Map<String, Object> map = new HashMap<>();
					map.put("itemcode", itemcode);
					map.put("itemname", itemname);
					map.put("qty", qty);
					map.put("amount", amount);
					list.add(map);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
		}
	List<Map<String, Object>> itemsalesum(String saledate) {
		List<Map<String, Object>> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT I.ITEMCODE,I.ITEMNAME,I.PRICE, NVL(S.AMOUNT,0) AMOUNT ,NVL(I.BIGO,' ') BIGO, I.REGDATE ");		
		sb.append("FROM ITEM I LEFT JOIN ");		
		sb.append("(SELECT ITEMCODE, SUM(AMOUNT) AMOUNT ");		
		sb.append("FROM SALES ");		
		sb.append("WHERE SALEDATE = ? ");		
		sb.append("GROUP BY ITEMCODE)S ");		
		sb.append("ON(I.ITEMCODE = S.ITEMCODE)  ");		
		sb.append("ORDER BY I.ITEMCODE  ");		
		
	try {
		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setString(1, saledate);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			Map<String, Object> map = new HashMap<>();
			map.put("itemcode", rs.getString("itemcode"));
			map.put("itemname", rs.getString("itemname"));
			map.put("price", rs.getInt("price"));
			map.put("amount", rs.getInt("amount"));
			map.put("bigo", rs.getString("bigo"));
			map.put("regdate", rs.getDate("regdate"));
			list.add(map);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		return list;
	}
	 
	List<Map<String, Object>>dayitemview(String saledate){
		List<Map<String, Object>> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM DAY_ITEM_SALES_VIEW ");
		sb.append("WHERE SALEDATE = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, saledate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getInt("price"));
				map.put("amount", rs.getInt("amount"));
				map.put("bigo", rs.getString("bigo"));
				map.put("regdate", rs.getDate("regdate"));
				list.add(map);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}



