package ex03_lang;

public class J20210421_1_wrapper {

	public static void main(String[] args) {
		// 래퍼클래스 //기본형을 감싸서 클래스로
//		int a = 10;
//		System.out.println(String.valueOf(a)+100);
//		
//		//객체에 집어넣는다//기본형을 문자열에 집어넣는다
//		String s= "10";
//		System.out.println(Integer.parseInt(s)+100);
//		System.out.println(Integer.valueOf(s)+100);
//		
		
		Integer a = 10; //객체 생성
		Integer c = new Integer(10);//되도록 쓰지 말라는 것. 호환성 문제 발생 가능성
		System.out.println(c);
		
		int b = a; //오토박싱(int->Integer), 언박싱(Integer->int)
		System.out.println(a+b);
		
		
//		int b =a; //기본형.
//		System.out.println(a+b);
//		
//		String J ="자바";
		
		//기본형 변환
//		double d = 1.5;
//		int aa = (int)d;
		
		//2진수 변환
//		int a = 255;
//		System.out.println(Integer.toBinaryString(a));
		
		//boolean 클래스
//		String s = "TrUE";
//		System.out.println(Boolean.parseBoolean(s));
		
		
		
		
	
	}
}
