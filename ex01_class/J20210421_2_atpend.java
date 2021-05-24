package ex01_class;

import java.text.SimpleDateFormat;
import java.util.Date;

//학생클래스
//필드:코드,이름,수강과목
class Attendee{
	private String code;
	private String name;
	private String subject;
	
	Attendee(){};
	public Attendee(String code, String name, String subject) {
		super();
		this.code = code;
		this.name = name;
		this.subject = subject;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}
//수강클래스 : LectureManager
//메소드: 입실 퇴실 출력
class LectureManager{
	//클래스 필드,클래스 변수:클래스 안에 생성 //C언어의 전역변수랑은 좀 다름
	//클래스가 메모리에 로딩될 때 생성,프로그램이 종료시 소멸
	//Static final : 상수(선언과 동시에 초기화)
	static final String collageName = "국제학원"; //변수에 final 붙이면 상수 //공용불가하게 만듬
	//인스턴스 필드,객체변수:객체안에 들어가있어야 생성 //C언어의 지역변수랑은 좀 다름
	//인스턴스 생성시 생성, 객체소멸시 소멸
	static final int buildYear = 2001;
	static final int day;//오늘날짜
	static {//static 블럭을 이용해서 초기화
		//db에서 가져오거나 파일에서 가져오는 등등..		//static 변수를 초기화 //static 블럭을 이용해서 초기화)
		Date now = new Date();//현재 날짜 가져오기
		SimpleDateFormat sf = new SimpleDateFormat("dd");
		day = Integer.parseInt(sf.format(now));
	}
	//자바반 홍길동이 입실
	static void enter(Attendee att) {//지역변수//
		System.out.println(day+"일 "+att.getSubject()+"반 "+att.getName()+"님이 입실");
	}
	//자바반 홍길동이 입실
	static void leave(Attendee att) {
		System.out.println(day+"일 "+att.getSubject()+"반 "+att.getName()+"님이 퇴실");
	}
	
}


public class J20210421_2_atpend {

	public static void main(String[] args) {
		System.out.println(LectureManager.collageName);
		System.out.println(LectureManager.buildYear);
		
		Attendee attd = new Attendee("A001","홍길동","자바");
		System.out.println(attd);
	
		System.out.println(LectureManager.buildYear);
		LectureManager.enter(attd);
		LectureManager.leave(attd);
	}

}
