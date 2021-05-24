package ex08_inheritance;

class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
	}
	void info(String name){}; //컴파일 에러를 피하기 위해
}
class Stud extends School{
	@Override
	void info(String name) {
		System.out.println(name + "학생");
	}
}
class Tech extends School{
	@Override
	void info(String name) {
		System.out.println(name + "선생");
	}//오버로딩--똑같은 형식으로 만드는것.
}

public class J20210504_1_Student {

	public static void main(String[] args) {
		School s1 =new Stud();
		s1.schoolName();
//		Stud s2 = (Stud)s1;
//		s2.info("지성");//다운캐스팅
//		((Stud)s1).info("홍길동"); //다운캐스팅
		s1.info("홍길동"); 

		
		s1 = new Tech();
		s1.schoolName();
//		((Tech)s1).info("이지은"); //다운캐스팅
		s1.info("이지은");
	}

}
