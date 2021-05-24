package ex10_Interface;

import java.util.Scanner;

//기능 별 인터페이스 구현
//전화통화(Call)
//카메라(Camera)
//메모장(Memo

interface Call{
	void call();
}
interface Camera{
	void camera();
}
interface Memo{
	void memo();
}
//전화와 사진찍기
class Phone implements Call,Camera{
	
	@Override
	public void call() {
		System.out.println("헌폰 전화를 걸었습니다.");
	}
	@Override
	public void camera() {
		System.out.println("512화소 카메라를 켰습니다.");
	}
}
//전화와 사진찍기,메모장
class NewPhone implements Call,Camera,Memo{

	@Override
	public void camera() {
		System.out.println("1024화소 카메라를 켰습니다.");
	}

	@Override
	public void call() {
		System.out.println("새폰 전화를 걸었습니다.");
	}

	@Override
	public void memo() {
		System.out.println("메모장을 열었습니다.");
	}
	
}
//폰사용
class PhoneUse{
	void call(Call cl) {
		cl.call();
	}
	void camera(Camera ca) {
		ca.camera();
	}
	void memo(Memo me) {
		me.memo();
	}
}

public class J20210504_8_Phone {
	
	public static void main(String[] args) {
		Phone p = new Phone();
		NewPhone np = new NewPhone();
		PhoneUse pu = new PhoneUse();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------");
			System.out.println("0.시스템종료");
			System.out.println("1.헌폰");
			System.out.println("2.새폰");
			System.out.println("-------------------------");
			System.out.println("폰의 종류가 몇번입니까?");
			int nh =sc.nextInt();
			
			if(nh ==1) {
				System.out.println("-------------------------");
				System.out.println("1.전화 2.카메라 ");
				System.out.println("-------------------------");

				System.out.println("무슨일을 실시하시겠습니까?");
				int work =sc.nextInt();
				if(work==1)pu.call(p);
				else if(work==2)pu.camera(p);
				else System.out.println("잘못누름");

			}else if(nh == 2) {
				System.out.println("1.전화 2.카메라 3.메모장 ");
				System.out.println("무슨일을 실시하시겠습니까?");
				int work =sc.nextInt();
				if(work==1)pu.call(np);
				else if(work==2)pu.camera(np);
				else if(work==3)pu.memo(np);
				else System.out.println("잘못누름");
				
			}else if(nh == 0){
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못누름");
			}
			
		}
		
	
	
	}

}
