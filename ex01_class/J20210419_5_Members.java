package ex01_class;

//회원클래스
//필드:id, passward, 출생년도, 혈액형
class Member{
	//은닉화 private
	private	String id;
	private String passward; //읽기 불가
	private int birth;
	private char blood;
	private double height;
	
	//생성자:객체가 생성될 때 실행되는 메소드
	//		 반드시 객체가 생성될때 생성자가 실행되어야 한다.
	//클래스의 이름과 같다.
	//반환형이 없다.
	
	
	//기본생성자 (1번밖에 실행 못함)
	//만약에 생성자가 없으면 컴파일러가 기본생성자를 생성]
	//만약에 생성자를 만들면 컴파일러가 기본생성자를 생성하지 않는다.
	//생성자의 오버로딩
	Member(){};
	Member(String id, String passward, int birth, char blood, double height ){
		this.id = id;
		this.passward = passward;
		this.birth = birth;
		this.blood = blood;
		this.height = height;
		
	}
	//둘다 있어야 M1 M2 다 쓸 수 있음 M1:기본생성자
	
	
	
	
	
	//setter:쓰기
	//setter를 없애서 바꾼다. 여러번 사용가능.
	void setId(String id) {
		this.id = id;
	}
	void setPassward(String passward) {
		this.passward = passward;
	}
	void setBirth(int birth) {
		this.birth = birth;
	}
	void setBlood(char blood) {
		this.blood = blood;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	
	//getter:읽기
	String getId() {
		return id;
	}
	String getPassward() { //비밀번호는 앞두자리만 반환
		return passward.substring(0,2) + "***";
	}
	int getBirth() {
		return birth;
	}
	char getBlood() {
		return blood;
	}
	double getHeight() {
		return height;
	}


}

public class J20210419_5_Members {

	public static void main(String[] args) {

		Member m = new Member("gamsung","qwe123",19951101,'A',175.5);
//		//기본 생성자를 이용해서 객체를 생성
//		Member m = new Member(); 
//		m.setId("gamsung");
//		m.setPassward("qwe123");
//		m.setBirth(19951101);
//		m.setBlood('A');
//		m.setHeight(175.5);
		System.out.println("아이디: "+m.getId() 
							+" 비번: "+ m.getPassward()
							+" 생년월일: "+m.getBirth()
							+ " 혈액형: "+ m.getBlood()+ " 형" 
							+ " 키: " + m.getHeight() + "km");
		
		Member m2 = new Member("ryan","abc987",19991026,'B',176.7);
		System.out.println("아이디: "+m2.getId() 
						+" 비번: "+ m2.getPassward()
						+" 생년월일: "+m2.getBirth()
						+ " 혈액형: "+ m2.getBlood()+ " 형" 
						+ " 키: " + m2.getHeight() + "km");
		
	}

}
