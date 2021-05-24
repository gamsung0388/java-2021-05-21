package ex08_inheritance;
//부모클래스
class Shape{
	private int height;
	private int width;
	//다형성을 위해서 메소드 작성
	void printShape() {
//		System.out.println("다각형");
	}
}
//사각형 클래스
class Rect extends Shape {
	@Override
	void printShape() {
		System.out.println("사각형");
	}
}

//삼각형 클래스
class Tria extends Shape{
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}

public class J20210503_3_polymorphism {

	public static void main(String[] args) {
		//다형성을 이용해서 메소드를 실행하려면 오버라이딩이 되어있어야한다
		//runtime 시에는 자식 메소드들 실행
		Rect r1 = new Rect();
		Tria t1 = new Tria();
		Shape tri = new Tria();
		r1.printShape();
		t1.printShape();
		tri.printShape();//컴파일 에러
	}

}
