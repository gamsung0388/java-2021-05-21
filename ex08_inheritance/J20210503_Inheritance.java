package ex08_inheritance;

//부모클래스
class Person{
	//protected 자식클래스 접근가능
	protected String name = "";//컴파일 에러
	void breath() {
		System.out.println(name+" 숨쉬기");
	}
	void eat() {
		System.out.println(name+" 먹기");
	}
	
	//오버라이딩
}

//자식클래스
class Student extends Person{
	private String name = "학생";
	Student(){
		super.name = this.name;
	}
	void learn() {
		System.out.println(name+" 배운다.");
	}
}
//선생클래스
class Teacher extends Person{
	private String name = "선생";
	Teacher(){
		super.name =this.name;
	}
	void teach() {
		System.out.println(name+" 가르친다.");
	}
}

public class J20210503_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		s1.breath();
		s1.eat();
		t1.breath();
		t1.eat();
		s1.learn();
		t1.teach();
		
	}	
	

}
