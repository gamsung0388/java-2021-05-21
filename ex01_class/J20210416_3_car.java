package ex01_class;

//자동차 클래스
class Car{
	
	//속성(name,color,power,speed)
	String name = "벤틀리";
	String color = "은색";
	boolean power; //false
	int speed; //0값.
	
	//기능(powerToggle(on,off),speedUp, speedDown)
	void powerToggle() {//파워토글
		power = !power;
		if(power) { 
			System.out.println("전원을 킵니다.");
		}else {
			System.out.println("전원을 끕니다");
		}
	}
	void speedUp() {//속도업// 100초과 될 수 없다.
		if(speed < 100) {
			speed ++;
		}
	}
	void speedDown() {//속도다운
		if(speed > 50) {
			speed --;
		}
	}
}


public class J20210416_3_car {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		System.out.println("----------------");
		System.out.println("차종: "+ c1.name );
		System.out.println("색: "+ c1.color);
		System.out.println("----------------");
		c1.powerToggle();
		System.out.println("----------------");
		
		for (int i = 0; i < 100; i++) {
			System.out.println("속력:" + c1.speed);
			c1.speedUp();
			System.out.println("----------------");
		}
		
		for (int i = 0; i < 100 ; i++) {
			System.out.println("속력:" + c1.speed);
			c1.speedDown();
			System.out.println("----------------");;
		}
		
		

		c1.powerToggle();
		
		
	}

}
