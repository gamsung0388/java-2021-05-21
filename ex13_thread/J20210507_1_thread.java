package ex13_thread;
//프로그램: 소스를 컴파일해서 실행코드로 변환된 파일
//프로세스: 실행파일이 cpu에 의해서 실행된 상태
//스래드: 프로세스내에서 실행되는 세부 실행단위
//멀티스래드 : 하나의 프로세스내에서 여러개의 스래드가 병행처리
//자바가 멀티스래드로 동작을 한다.
//스레드 스케줄링
//JVM의 스레드 스케쥴러가 각 스레드에게 CPU를 할당하여 실행
//스래드만들기

class Thread1 extends Thread{
	//실행하고 싶은 작업 구현
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread:"+i);
		}
	}
	
}

public class J20210507_1_thread {
	
	public static void main(String[] args) { //스래드
		//스래드 객체 생성
		Thread1 th = new Thread1(); 
		Thread1 thr = new Thread1(); 
		
		
		
		thr.start();//스래드 실행
		th.start();//스래드 실행
		for (int i = 0; i < 10; i++) {
			System.out.println("main:"+i);
			}
		
	}

}
