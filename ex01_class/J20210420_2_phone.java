package ex01_class;
//핸드폰 클래스
//필드:이름,용량,화소
//생성자 , 게터, 세터, toString
//메소드 
class Phone{
	private String name;
	private int capacity;
	private int pixel;
	
	//생성자
	Phone(){
		super();
	};
	
	
	public Phone(String name, int capacity, int pixel) {
		this(name, capacity); //나 자신의 생성자 호출 , 반드시 가장 먼저실행
		this.name = name;
		this.capacity = capacity;
		this.pixel = pixel;
	}
	
	public Phone(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	//toString
	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}

}


public class J20210420_2_phone {

	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시",512,12000);
		System.out.println(p1);
		p1.setCapacity(256);
	}

}
