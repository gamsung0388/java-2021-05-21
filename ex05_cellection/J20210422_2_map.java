package ex05_cellection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J20210422_2_map {

	public static void main(String[] args) {
		// 맵 :key, value
		// 순서가 없다(index없다)
		// key 중복 안되고, value는 중복허용
//				키의 형, 값의 형
//  	인터페이스 Map		
		Map<String, Integer> hmap = new TreeMap<>();
		Map<String, Integer> hmap2 = new HashMap<>();
//		hmap.put(1, "one");
//		hmap.put(2, "two");
//		hmap.put(3, "three");
//		
//		System.out.println(hmap);
//		System.out.println(hmap.get(2));
	
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("이름?");
			String name = sc.next();
			if(name.equals("q"))break;
			System.out.println("나이");
			int age = sc.nextInt();
			hmap.put(name, age);
		}
		System.out.println(hmap.get("감성"));
		
		
		
		
		
		
		
		
		
	}

}
