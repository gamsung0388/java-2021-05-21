package ex08_inheritance;
//부모클래스
//final 클래스는 상속 불가
class Bird{
	protected String name = "";
	
	void born() {
		System.out.println( name +"알을 낳는다");
	}
	//final void fly() : final 메소드는 오버라이딩 불가
	void fly() {
		System.out.println(name + "은/는 날 수 있다.");
	}
	
}
//참새
class Sparrow extends Bird{
	private String name = "참새 ";
	Sparrow(){
		super.name = this.name;
	}
	
}
//타조
class Ostrich extends Bird{
	private String name = "타조 "
			;
	Ostrich(){//부모의 실행자를 실행
		super.name = this.name;
	}
	//오버라이딩:부모클래스의 메소드를 다시 작성
	@Override
	void fly() {
		System.out.println(name + " 날 수 없다.");
	}
	
}


public class J20210503_2_Bird {

	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		Ostrich o1 = new Ostrich();
		s1.born();
		o1.born();
		s1.fly();
		o1.fly();
		
		Bird o2 = new Ostrich();//업캐스팅
		Ostrich o3 = (Ostrich)o2; //다운캐스팅(수동)
		o3.fly();
		
		
		
		
		
	}

}
