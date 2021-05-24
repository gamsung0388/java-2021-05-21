package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_5_selectOne {

	public static void main(String[] args) {
		// 한건만 조회
		Connection conn = DBConn.getConn();
		PreparedStatement pstnt = null;
		ResultSet rs = null;
		ItemDTO idto = null;
		
		String itemcode = "8810";
		
		String sql = "SELECT*FROM ITEM\r\n" + 
				"WHERE ITEMCODE = ? ";
		
		try {
			pstnt =	conn.prepareStatement(sql);
			pstnt.setString(1, itemcode);
			rs = pstnt.executeQuery();
			if(rs.next()){//데이터가 있다면
				String itemname = rs.getString("itemname");
				int price = rs.getInt("price");
				String bigo = rs.getString("bigo");
				Date regdate = rs.getDate("regdate");
				idto = new ItemDTO(itemcode, itemname, price, bigo, regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//item 출력
		System.out.println(idto.getItem_code()+" "+idto.getItem_name()+" "+idto.getPrice()+" "+idto.getBigo()+" "+idto.getRegdate());
		
		
	}

}
