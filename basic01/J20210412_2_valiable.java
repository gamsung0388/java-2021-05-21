package basic01;

import java.math.BigDecimal;

public class J20210412_2_valiable {

	public static void main(String[] args) {
		//정수형 변수
		
		//10 + 20 = 30
		
//		int a = 10,b =20; //선언,초기화
//		//덧셈
//		System.out.println(a + "+" + b + "=" +(a+b));
//		//뺄셈
//		System.out.println(a + "-" + b + "=" + (a-b));
//		//곱셈
//		System.out.println(a + "*" + b + "=" + (a*b));
//		//나눗셈
//		System.out.println(a + "*" + b + "=" + ((double)a/b));
//		
//		byte b1 = 10;
//		System.out.println(b1);
		
		//실수형
		
//		float f = 3.14f;  //4byte (float)3.14
//		double d = 3.14; //8byte 
//		
//		System.out.println(f);
//		System.out.println(d);
		
		
		//부동소수점의 오차
//		
//		double d = 608.4, d2 = 206.2;
//		System.out.println(d+d2); //부동 소수점으로 계산
//		System.out.printf("%.2f\n", d+d2); //돈계산할 때는 안됨.
		
		
		//정확한 계산을 해야할 경우(돈계산등)
		//참조형 생성//클래스로 만듬//
//		BigDecimal b1 = new BigDecimal("608.4"); //new BigDecimal 객체. 
//		BigDecimal b2 = new BigDecimal("206.2");
//		
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
//		
		
		//문자형
		
//		char c = 'a'; //a - 97 - 10 - 1
//		System.out.println(c);
//		char c2 = '가';
//		System.out.println(c2); //유니코드
//		System.out.println(c2 +0); //코드화(유니코드값 출력)
//		
		
		//논리형
		
//		boolean b = true;
//		System.out.println(b);
		
		//문자열은 형이 없다.
		//참고형 //주소를 가지고 있다.
		//클래스형 대문자.
//		String s1 = new String("자바");
//		String s2 = "자바";//상수플에 저장.
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		//다르다.
//		if(s1 ==s2)
//			System.out.println("같다.");
//		else
//			System.out.println("다르다");
//		
		
		//같다.
//		if(s1.equals(s2))
//			System.out.println("같다.");
//		else
//			System.out.println("다르다");
		
		
		//형변환
		//자동형변환
		//명시적인 형변환
//		byte b = 10;
//		int a = b; //자동형변환(작은형이 큰형으로 자동형변환)
//		
//		byte c = (byte)a; //명시적인 형변환(큰형이 작은형의 변환)
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
		//메모리값을 바뀔 수 있어서 변수
		
		
		//상수
//		//const int a = 10; //c언어
//		final float PI = 3.14f; //상수는 대문자.
//		//PI = 5.15f; //상수는 변경 불가능
//		System.out.println(PI);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
