package basic01;

//파일이름과 public class의 이름은 같아야한다.
public class J20210412_1_main { //클래스의 이름
	
	//main(메소드): 클래스 안에 들어있는 메소드, 진입점 메소드
	//void 반환형
	//main 메소드 이름
	//(String[] args) 매개변수
	public static void main(String[] args) { //(String args[] )
		
		
		
		System.out.print("헬로우 자바!!");  //프린터는 개행이없디.
	//클래스이름의 첫자는 대문자.//메쏘드
	//println 다음줄.개행.
		System.out.println("나의 나이는 " + 20); //개행기능포함
	//10+20=30
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("%d+%d=%d\n",10,20,10+20); //포맷 문자열 사용
		
		
		
	}

}
