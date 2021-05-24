package ex02_access;

import ex01_class.Bank;

public class J20210421_1_package {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getA());
		
		// ex01_class.Bank b1 = new ex01_class.Bank("국제통장","11-22-33");
		// 접근제어자
		
		//클래스 제한
		// public : 모든 클래스가 접근 가능
		// default(접근제어자 없음) : 같은 패키지만 접근 가능//키워드가 없다.
		//필드 메소드 제한
		// public : 모든 클래스가 접근 가능
		// private : 자신의 클래스 내부에서만 접근 가능
		// protected : 같은 패키지와 자식클래스 허용
		// default(접근제어자 없음) : 같은 패키지만 접근 가능//키워드가 없다.
		
		
		//static 클래스맴버(필드,메소드)
		//final 변수(필드):값을 변경 불가 상수
		//final 메서드/ 변경 불가 메서드 오버라이딩 불가
		//final 클래스 /내용을 더이상 변경 불가 
		
		Bank b1 = new Bank("국제통장","11-22-33");
		
		
		
		
		
		
	}	
}
