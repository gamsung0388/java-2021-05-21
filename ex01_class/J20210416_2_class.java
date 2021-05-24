package ex01_class;

//클래스:객체를 만들어내기위한 틀.
class Dog{ //클래스의 첫자는 대문자 
	//속성:필드					
	//자동초기화
	String type ="강아지";
	int legs = 4;
	String name = "달이";
	int cnt;//걸음수
	//기능: 메소드
	void walking() {
		cnt++;
		System.out.println(name + "는" + cnt + "번 걷는다.");
	}
	void running() {
		cnt++;
		System.out.println(name + "는" + cnt + "번 뛴다.");
	}
}

class Cat{
	String type = "고양이";
	int legs = 4;
	
	void jump() {
		System.out.println("뛴다");
	}
}
public class J20210416_2_class {//public class 파일명 같아야함.하나여야만 함.//public 누구든지 이용할 수 있다.
	public static void main(String[] args) {
		//클래스
//		Dog d1 = new Dog();
//		Cat c1 = new Cat();
//		
//		System.out.println("이름: "+d1.name);
//		System.out.println("종: "+d1.type);
//		System.out.println("다리수: "+d1.legs);
//		d1.running();
//		d1.running();
//		d1.walking();
//		d1.walking();
		
	
	}	

}