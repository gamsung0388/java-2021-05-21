package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Junittest {
	
	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String,Object>> list =sdao.dayitemSalesList();
//		for (Map<String, Object> map : list) {
//			System.out.print(map.get("amount"));
//			System.out.print(map.get("itemname"));
//			System.out.print(map.get("itemcode"));
//			System.out.print(map.get("qty"));
//			System.out.print(map.get("seldate"));
//			System.out.print(map.get("seq"));
//			System.out.println("");
//		}
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.print(map.get("amount"));
			System.out.print(" ");
			System.out.print(map.get("itemname"));
			System.out.print(" ");
			System.out.print(map.get("itemcode"));
			System.out.print(" ");
			System.out.print(map.get("qty"));
			System.out.print(" ");
			System.out.print(map.get("seldate"));
			System.out.print(" ");
			System.out.print(map.get("seq"));
			System.out.println("");
			
		}
		
	}
	
	@Test
	void itemsalesum() {
		SalesDAO sd = new SalesDAO();
		List<Map<String, Object>> list = sd.itemsalesum("2021-04-29");
		System.out.println(list);
		for (Map<String, Object> map : list) {
			System.out.print(map.get("itemcode"));
			System.out.print(" ");
			System.out.print(map.get("itemname"));
			System.out.print(" ");
			System.out.print(map.get("price"));
			System.out.print(" ");
			System.out.print(map.get("amount"));
			System.out.print(" ");
			System.out.print(map.get("bigo"));
			System.out.print(" ");
			System.out.print(map.get("regdate"));
			System.out.println(" ");
			
		}
	}
	@Test
	void saledate() {
		SalesDAO sd = new SalesDAO();
		
		String saledate = "20210429";
		saledate = saledate.substring(0,4)+ "-"
				+ saledate.substring(4,6)+ "-"
				+ saledate.substring(6);
		System.out.println(saledate);
	}
	
	@Test
	void saledate2() {
		SalesDAO sd = new SalesDAO();
		List<Map<String, Object>> list = sd.dayitemview("2021-04-09");
		System.out.println(list);
		for (Map<String, Object> map : list) {
			System.out.print(map.get("itemcode"));
			System.out.print(" ");
			System.out.print(map.get("itemname"));
			System.out.print(" ");
			System.out.print(map.get("price"));
			System.out.print(" ");
			System.out.print(map.get("amount"));
			System.out.print(" ");
			System.out.print(map.get("bigo"));
			System.out.print(" ");
			System.out.print(map.get("regdate"));
			System.out.println(" ");
		}
	}
	
	
	
	
}
