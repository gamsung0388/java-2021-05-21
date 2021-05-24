package ex12_Inner;
interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
//	int mul(int a, int b);
//	int div(int a, int b);
}
public class j20210507_5_Cal {

	public static void main(String[] args) {
		// 익명클래스
		Cal cal = new Cal() {
//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
			@Override
			public int add(int a, int b) {
				return a+b;
			}
//			@Override
//			public int mul(int a, int b) {
//				return a*b;
//			}
//			@Override
//			public int div(int a, int b) {
//				return a/b;
//			}
		};
	System.out.println(cal.add(5, 2));
//	System.out.println(cal.sub(5, 2));
//	System.out.println(cal.mul(5, 2));
//	System.out.println(cal.div(5, 2));
	
	//람다식
	//한개의 추상메소드만 가지고 잇어야한다.(함수적 인터페이스)
	Cal cal2 = (a,b)->a+b; 
	System.out.println(cal2.add(10, 20));
	
	
	}

}
