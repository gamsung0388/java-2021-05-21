package ex09_abstract;

//부모클래스
//추상메소드를 한개라도 가지고 있으면 추상 클래스로 만들어야함.
//형체가 없으며 객체 소환 불가
abstract class Education{
	static String name = "교육청";
	
	//구현부가 없는 추상메소드
	//자식이 반드시 구현부를 작성
	abstract void schoolName(); //강제화하려면 abstract

}
//초등학교
class Elementary extends Education{
	@Override
	void schoolName() {
		System.out.println("호계 초등학교");
	}
}
//중학교
class Middle extends Education{
	@Override
	void schoolName() {
		System.out.println("호계 중학교");
	}
}
//고등학교
class High extends Education{
	@Override
	void schoolName() {
		System.out.println("부흥 고등학교");
	}
}
class Eduinfo{
	//출신 학교 출력
	void schoolNamePrint(Education edu) {
		//다운 캐스팅 
//		if(edu instanceof Elementary) 
//			((Elementary)edu).schoolName();
//		else if (edu instanceof Middle)
//			((Middle)edu).schoolName();
//		else if (edu instanceof High)
//		((High)edu).schoolName();
			edu.schoolName();
	}
}
public class J20210504_5_abstract {

	public static void main(String[] args) {
		Elementary elem = new Elementary();
		Middle mid = new Middle();
		High high = new High();
		Eduinfo info = new Eduinfo();
		//학교 출력
		info.schoolNamePrint(elem);
		info.schoolNamePrint(mid);
		info.schoolNamePrint(high);
		
//		new Education();
			
			
	
	}

}
