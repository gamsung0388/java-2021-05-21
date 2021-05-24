package ex01_class;

//원클래스
class Circle{
	private double r;//반지름
	private double area;//넓이
	
	//생성자
	Circle(){};
	Circle(double r){
		this();//생성자 호출 //클래스이름으로는 불가
		this.r=r;
		/*this.*/areaCal(r);//생성자에서 메소드 실행
	};
	
	//게터
	double getArea() {
		return area;
	}
	
	
	
	//원의 넓이를 구하는 메소드
	double areaCal(double r ) {//원의 넓이 계산 메소드
		area = r*r*Math.PI;
		return area;
	}
	double areaCal(int r) {
		area = r*r*Math.PI;
		return area;
	}
	double areaCal(double r,double pi) {
		area = r*r*pi;
		return area;
	}
	double areaCal(int r,double pi) {
		area = r*r*pi;
		return area;
	}
	
	
	
	
	//toString
	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";}
}

public class J20210420_5_Area {

	public static void main(String[] args) {
		Circle c = new Circle(5.5);
		System.out.println(c);
		
		System.out.println(c.areaCal(10.5)); 
		System.out.println(c.areaCal(10.5,3.14)); 
		
	}

}
