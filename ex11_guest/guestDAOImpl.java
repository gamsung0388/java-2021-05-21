package ex11_guest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex11_guest.DBConn;

public class guestDAOImpl implements guestDAO{
	Connection conn = DBConn.getConn();
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	
	@Override
	public int insert(guestDTO gdto) {
		//추가
		int cnt = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO GUEST(SEQ,NAME,EMAIL,PS,SUB) ");
		sb.append("VALUES( GUEST_SEQ.NEXTVAL,?,?,?,?)");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPs());
			pstmt.setString(4, gdto.getSub());
			cnt =pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int update(guestDTO gdto) {
		Connection conn = DBConn.getConn();
		// 수정
		int cnt = 0;
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE GUEST ");
		sb.append("SET NAME  = ?, ");
		sb.append("EMAIL = ?, ");
		sb.append("PS = ?, ");
		sb.append("SUB = ? ");
		sb.append("WHERE SEQ = ?");		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPs());
			pstmt.setString(4, gdto.getSub());
			pstmt.setInt(5, gdto.getSeq());
			cnt =pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		Connection conn = DBConn.getConn();
		// 삭제
		int cnt = 0;
		String sql = "DELETE FROM GUEST " + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	//한건조회
	public guestDTO selectOne(int seq) {
		guestDTO gdto = null;
		Connection conn = DBConn.getConn();
		
		
		String sql = "SELECT * FROM GUEST\r\n" + 
					 "WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				gdto = new guestDTO();
				gdto.setSeq(seq);
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPs(rs.getString("ps"));
				gdto.setSub(rs.getString("sub"));
				gdto.setRegidate(rs.getDate("regidate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return gdto;
	}

	@Override
	//전체 조회
	public List<guestDTO> selectList() {
		Connection conn = DBConn.getConn();
		List<guestDTO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM GUEST ORDER BY SEQ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				guestDTO gdto = new guestDTO();
				gdto.setSeq(rs.getInt("seq"));
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPs(rs.getString("ps"));
				gdto.setSub(rs.getString("sub"));
				gdto.setRegidate(rs.getDate("regidate"));
				list.add(gdto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		
	
	
		}
		return list;
	}

	

}
