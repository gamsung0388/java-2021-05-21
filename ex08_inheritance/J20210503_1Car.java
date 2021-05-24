package ex08_inheritance;
//부모클래스
//사칙연산 계산 
class Cal{
	private String color;
	//같은 패키지 클래스와 자식 클래스에서
	protected int result; 
	
	
	//부모클래스의 생성자를 자식클래스에서 실행
	Cal(String color) {
		this.color = color;
	}
	int add(int a) {
		result += a;
		return result;
		}
	
	public String getColor() {
		return color;
	}
	int add(int a, int b){
		return a+b;
	}int sub(int a, int b ){
		return a-b;
	}
	public int getResult() {
		return result;
	}

	
}
//자식클래스
//나머지,제곱 추가
class NewCal extends Cal{
	//private int result;//6
	NewCal(String color) {
		super(color); //부모클래스의 생성자를 실행한다.
	}
	int add(int a) {
		result += a;
		return result;
		}
	
	
	int multiple(int a, int b) {
		return a*b;
	}
	int remain(int a, int b) {
		return a%b;
	}
	
}
public class J20210503_1Car {
	public static void main(String[] args) {
		NewCal c1 = new NewCal("초록");
		
		System.out.println(c1.getColor() + " 계산기");
		System.out.println("더하기 "+c1.add(100, 50));
		System.out.println("빼기 "+c1.sub(100, 50));
		System.out.println("곱 "+c1.multiple(100, 50));
		System.out.println("나머지 "+c1.remain(10, 50));
		
		System.out.println(c1.add(1));
		System.out.println(c1.add(1));
		System.out.println(c1.add(1));
		System.out.println(c1.add(1));
		System.out.println(c1.add(1));
		System.out.println(c1.add(1));
		System.out.println(c1.getResult());//0 
		
		
		//object의 메소드 사용가능
		System.out.println(c1.hashCode());
	}
}
