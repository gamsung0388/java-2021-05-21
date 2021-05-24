package ex12_Inner;
//내부클래스
class OuterClass{
	
	class InnerClass{
		public String toString() {
			return "인스턴스 클래스";
		}
	}
	InnerClass inner = new InnerClass(); //필드
	void method1() {
		InnerClass localinner = new InnerClass(); //변수
		System.out.println(localinner);
	}
	
	class InnerClassNew{
		public String toString() {
			return "새로운 인스턴스 클래스";
		}
	}
}

public class J20210507_1_inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		System.out.println(outer.inner);
		outer.method1();
		
		//inner클래스 생성
		
		OuterClass.InnerClassNew innerNew = outer.new InnerClassNew();
		System.out.println(innerNew);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
