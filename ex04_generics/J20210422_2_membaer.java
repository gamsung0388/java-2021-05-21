package ex04_generics;

//맴버 클래스
//필드:아이디, 패스워드

class Member{
	private String userid;
	private String passwd;
	Member(){}
	
	public Member(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}

}

//Vip
//필드: 아이디,패스워드,할인율
class Vip{
	private String userid;
	private String passwd;
	private double rate;
	Vip(){}
	public Vip(String userid, String passwd, double rate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.rate = rate;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Vip [userid=" + userid + ", passwd=" + passwd + ", rate=" + rate + "]";
	} 
	
}


//로그인 관리 클래스
class LoginManager<T>{
	//로그인 메소드
	void loginMember(T member) {
		System.out.println(member);
		if(member instanceof Member) {
			
			System.out.println(((Member)member).getUserid()+"님이 로그인하셨습니다.");
		}else if(member instanceof Vip) {
			System.out.println(((Vip)member).getUserid()+"님이 로그인하셨습니다.");
		}
	}

}


public class J20210422_2_membaer {

	public static void main(String[] args) {
		
		//membe,vip
		Member m1 = new Member("qwe","1234");
		Vip v1= new Vip("abc","9876",0.6);
		//로그인
		LoginManager<Member> l1 = new LoginManager<>();
		LoginManager<Vip> l2 = new LoginManager<>();
		
//		System.out.println(m1);
//		System.out.println(v1);
		
		l1.loginMember(m1);
		l2.loginMember(v1);

		
		
	}

}
