package ex08_inheritance;
//
//토끼,사자, 코끼리
class Animal{
	
}
//토끼
class Rabbit extends Animal{
	
	@Override
	public String toString() {
		return "토깽이" ;
	}
}
//사자
class Tiger extends Animal{
	
	@Override
	public String toString() {
		return "호랭이";
	}
	
}
//애니멀케어
class AnimalCare{
	//먹이주기 메소드
	void eating(Animal a) {
		System.out.println(a+ "에게 먹이를 줬다.");
	}
	//목욕시키기 메소드
	void washing(Animal a) {
		System.out.println( a+ "를 목욕을 시켰다.");
	}

}
public class J20210504_3_Animal {

	public static void main(String[] args) {
		// 객체 생성
		AnimalCare ac = new AnimalCare();
		Animal r1 = new Rabbit();
		Animal t1 = new Tiger();
		//메소드 실행
		ac.eating(r1);
		ac.eating(t1);
		ac.washing(r1);
		ac.washing(t1);
	}
}
