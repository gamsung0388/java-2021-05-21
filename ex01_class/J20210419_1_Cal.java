package ex01_class;

class Cal{
	//속성:필드
	//객체가 사라지기 전까지 사용 가능
	String maker = "계산기";
	//기능:메소드
	//메소드가 사라지면 소멸.
	int add(int a, int b) {//더하기:더한 값을 리턴.
		int r = a+b; //r은 지역변수//stack에 존재
		return r;
	}
	
	int sub(int a, int b) {
		return  a-b;
	}
	
	int mul(int a, int b) {
		int r = a*b;
		return r;
	}
	
	double div(int a, int b) {
		double r = (double)a/b;
		return r;
	}
	
}




public class J20210419_1_Cal {

	public static void main(String[] args) {
		Cal c1 = new Cal(); //heap에 존재.
		System.out.println(c1.maker);
		int a= 20, b= 3;
		int r = c1.add(a, b);
		int t = c1.sub(a, b);
		int y = c1.mul(a, b);
		double x = c1.div(a, b);
		System.out.println("더하기계산: "+r) ;
		System.out.println("빼기계산 "+ t);
		System.out.println("곱계산 " + y);
		System.out.printf("나누기 계산 %.2f",x);
	}

}
