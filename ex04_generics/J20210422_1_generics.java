package ex04_generics;

//사각형클래스
//필드:가로(int width) 세로(int height) 넓이(int)
//제너릭타입:인스턴스 생성시 형을 결정
//T: Type , K: Key, V: Value, E:Element
class Rectangle<T>{
	private T width;
	private T height;
	private double area;
	
	public Rectangle(T width, T height) {
		super();
		this.width = width;
		this.height = height;
		area = getArea(width,height);
	}
	
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public double getArea(T width, T height) {
		double result = 0;
		if(width instanceof Integer) {//width가 Integer형이라면
			result = (int)width * (int)height;
		}else if(width instanceof Double) {//width가 Double형이라면
			result = (double)width * (double)height;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
}

public class J20210422_1_generics {
	public static void main(String[] args) {//두번째가로에 <> 숨김 가능
		Rectangle<Integer> r1 = new Rectangle<>(5,6); //<>에 기본형 못넣음
		System.out.println(r1);
	
		Rectangle<Double> r2 = new Rectangle<>(5.5,6.5); 
		System.out.println(r2);
		
		
	}

}
