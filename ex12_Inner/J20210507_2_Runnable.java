package ex12_Inner;
//스래드 만들기 2 
//class MyRunn implements Runnable{
//	
//	
//	
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("runnable 스레드:" + i);
//		}
//		
//	}
//	
//}


public class J20210507_2_Runnable {

	public static void main(String[] args) {
		
		
//		// TODO Auto-generated method stub
//		MyRunn myRun = new MyRunn(); //실행 구현
//		Thread th =new Thread(myRun); //스레드 생성
//		th.start(); //스래드 시작
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("main:"+i);
//		}
		//익명클래스:Runnable을 상속
//		Runnable r = new Runnable() {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("main:"+i);
//				}
//			}
//		};
//		
//		Thread th = new Thread(r);//스레드 생성
//		th.start();
//		//스레드 우선순위 : 1~10 (클수록 높음)
		//스레드1 생성
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("th1 스레드:"+i);
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int i = 0; i < 10; i++) {
						System.out.println("th2 스레드:"+i);
					}
				}
			});
		
		th1.setPriority(10);
		th2.setPriority(1);
		
		//스레드 생성
		th1.start();
		th2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main 스레드:"+i);
		}
		
	}

}
