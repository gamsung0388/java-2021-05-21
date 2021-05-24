package ex01_class;

import java.util.Scanner;

public class J20210420_4_main {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String str : args) {
			System.out.println(str);
		}
		
		//실습 id와 pw를 아규먼트로 받아서
		//만약 id가 java이고 pw가 1111이면 관리자모드
		//아니면 일반 사용자모드
		if(args.length >1&& args[0].equals("java")&& args[1].equals("1111")) {
			System.out.println("관리자모드");
		}else 
			System.out.println("일반사용자모드");
		
		
		
		
		
		
		
		
		
		
	}

}
