package ex08_inheritance;

class MyCar{
	static final String name = "제네시스 g80";//상수개념
}
//타이어
class Tire extends MyCar{
	private String company; //회사이름

	public Tire(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "타이어회사 : " + company ;
	}
	
}
//미러 부품
class Mirror extends MyCar{
	private String company;

	public Mirror(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "백미러회사 : " + company ;
	}
	
	
}
//수리업체
class Repair{
	//부품을 체인지 해주는 메소드
	void changePart(MyCar m) {
		System.out.println(m + " 교체 완료");
	}
//		void changePart(Mirror m) {
//		System.out.println(m + "교체 완료");
//	}
}

public class J20210504_2_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyCar.name);
		Tire t1 = new Tire("넥센");
//		System.out.println(t1);
		Mirror m1 = new Mirror("모비스");
//		System.out.println(m1);
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
		
	}

}
