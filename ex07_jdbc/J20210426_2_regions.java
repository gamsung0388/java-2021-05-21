package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_2_regions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨넥션 객체 얻기
		Connection con =DBConn.getConn();
		List<RegionsDTO> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			stmt = con.createStatement();
			String sql = "SELECT * FROM REGIONS ORDER BY REGION_ID";
			rs = stmt.executeQuery(sql);//조회
			System.out.println(rs);
			while (rs.next()) {
				RegionsDTO rdto= new RegionsDTO();
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				rdto.setRegoin_id(region_id);
				rdto.setRegoin_name(region_name);
				list.add(rdto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}
		
		System.out.println(list);
		for(RegionsDTO dto: list) {
//			System.out.println(dto);
			System.out.println(dto.getRegoin_id()+" "+dto.getRegoin_name());
		}
		
		
		
	}

}
