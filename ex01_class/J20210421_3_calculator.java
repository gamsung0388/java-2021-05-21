package ex01_class;

public class J20210421_3_calculator {
	public static final String maker = "국제계산기";
	private int result;
	private boolean light;
	
	
	
	static String getMaker() {
		return maker;
	}
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static필드만 사용 가능
	static int add(int a,int b) { //변경요소 없는 것은 static 가능
		return a+b; 
	}
	int add(int a) {
		this.result += a;
		return result;
	}
	//라이트 켜기/끄기
	void lightToggle() {
		light = !light;
	}
	
	
	public static void main(String[] args) {
		J20210421_3_calculator c = new J20210421_3_calculator();
//		System.out.println(c.sum(13, 42));
//		System.out.println(J20210421_3_calculator.sum(20,30));		
//		System.out.println(J20210421_3_calculator.result);
		System.out.println(J20210421_3_calculator.getMaker());
		System.out.println(J20210421_3_calculator.add(20,30));		
		System.out.println(J20210421_3_calculator.add(20,30));		
		c.lightToggle();
	}

}
