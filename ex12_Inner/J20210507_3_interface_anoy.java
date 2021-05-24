package ex12_Inner;
interface School{//자식들이 해야할 것을 꼭 출력하도록 하는것//추상클래스//추상메소드가 들어가있기때문
	void namePrint();
}

public class J20210507_3_interface_anoy {

	public static void main(String[] args) {
		//익명클래스 생성
		//School인터페이스를 상속받은 객체 생성
		School high = new School() {
			@Override
			public void namePrint() {
				System.out.println("국제고등학교");
			}
		};
		
		high.namePrint();
		
	}		
}
