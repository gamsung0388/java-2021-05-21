package basic01;

import java.util.Scanner;

public class J20210412_4_Scanner {

	public static void main(String[] args) {
		// 사용자에게 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("입력받은 값은: "+ a);
		
		//반지름을 입력받아 원의 넓이 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반지름을 입력하세요");
//		double r = sc.nextDouble();
//		//Math.PI: 원주율
//		System.out.printf("원의 넓이는 %.2f 입니다\n",r*r*Math.PI); //static은 눕습니다.
		
		
		//문자열을 입력받을 때
//		Scanner sc = new Scanner(System.in);
//   클래스(구조체) 변수
		
//		System.out.print("이름은?");
//		String name = sc.next(); 
//		System.out.println("당신의 이름은 " + name);
	//				메소드
	
		//한줄을 읽어들이는 메소드(enter값을 기준으로 읽기
		//공백허용
//		Scanner sc = new Scanner(System.in); //키보드로 불러들이겠다는 scanf
//		System.out.print("이름");
//		String name = sc.nextLine();
//		System.out.println("이름은 "+name);
//		
		
		//실습)나이와 이메일을 입력받아 출력.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		System.out.print("이메일?");
//		String email = sc.next(); //문자열(공백,엔터기준)
//		sc.nextLine(); //엔터처리 (버퍼를 비우기 위해서
//		System.out.print("이름은?");
//		String name = sc.nextLine(); //엔터를 기준으로 문자열 읽기
//		
//		//enter 기준으로 한라인을 통제로 불러들여 읽힘.
//		System.out.println("이름은 " + name + " 나이는 " + age + "살 " + "이메일은 " + email);
		
		//실습)반, 이름, 파이썬,c,자바 정수를 입력받아 
		//총점과 평균을 구하라.
		
		//스캐너
//		Scanner sc = new Scanner(System.in);
//		//반,이름 정의
//		System.out.print("어떤 반이십니까? 이름은 어떻게되시죠? ");
//		String clase = sc.next();
//		String name = sc.nextLine();
//		//점수들 정의
//		System.out.print("파이썬, C , 자바 점수를 입력하세요 ");
//		int python = sc.nextInt();
//		int c = sc.nextInt();
//		int java = sc.nextInt();
//		//총점,평균 정의
//		int sum =  python +  c +  java;
//		double avg = (double)sum/3; //자동형변환
//		
//		//출력
//		System.out.println("------------------------------------------------------");
//		System.out.println(clase + "반의 "+ name + "님의 점수는 파이썬은 "+ python + "점 C는 " + c + "점 자바는 " + java + "점으로 입력받았습니다."  );
//		System.out.printf("그럼으로 총점은 %d점 평균은 %.2f 점 입니다.",sum,avg);
		
//		double avg = 123.456789;
		
		//math round 이용
		
//		System.out.println(avg * 100);
//		System.out.println(Math.round(avg * 100));
//		System.out.println((double)Math.round(avg * 100)/100);
		
		
		//format 메소드 이용
//		System.out.println("포맷메소드: "+String.format("%.2f", avg));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
