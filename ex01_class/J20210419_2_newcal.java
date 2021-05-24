package ex01_class;

class NewCal{
	//필드:maker, result(결과값)
	String maker = "감성 계산기";
	double result;
	//메소드: 결과값에 더하는 기능
	//오버로딩:메소드의 이름은 같고 매개변수에 갯수나 형이 다른 경우 메소드의 이름을 중복해도된다.
	void add(double a) {
		 result += a;
	}
	double add(double a, double b) {//개수가 다른경우
		return a+a;
	}
	void add(int a) {//형이 다른 경우
		result += a;
	}
	
	void sub(double a) {
		 result -= a;
	}
	void mul(double a) {
		 result *= a;
	}
	void div(double a) {
		result /= a;
	}
}

public class J20210419_2_newcal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCal c = new NewCal();
//		System.out.println(c.result);
//		c.add(10);
//		System.out.println(c.result);
//		c.sub(3);
//		System.out.println(c.result);
//		c.mul(4.5);
//		System.out.println(c.result);
//		c.div(2.5);
//		System.out.println(c.result);
		
		System.out.println(c.add(20,10));
//		System.out.println(c.add(100));
	}

}
