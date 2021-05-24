package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210414_3_for {

	public static void main(String[] args) {
		// 반복문 (for)
		
//		for (int i=0;i<10;i++) {
//			System.out.println(i);			
//		
//		}
		
		//1~10합 구하기
//		int sum = 0;
//		
//		for (int i = 1;i<11;i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
	
		//실습)업다운 게임 만들기
		//1~100사이의 수중 하나개를 랜덤으로 추출
		//사용자에게 정수입력받기
		//랜덤수와 비교해서 업 또는 다운 출력
		//2~3을 5번 반복
		//반복하면서 정답을 입력하면 사용자가 승리
//		int num = (int)(Math.random()*100+1); //랜덤값. 정해진 값.
//		
//		Scanner sc = new Scanner(System.in);
//		int a,count =0;
//		boolean win =false;//성공여부
		//for 문
		
//		for (int i =0;i < 5;i++) { //5번
//			System.out.printf("%d)맞춰보세요:",i+1);
			

			//hasNextInt 문
//		if (!sc.hasNextInt()) {//입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼지우기
//				i--;
//				continue; //반복문의 처음으로 다시 돌아가서 계속
//			}

			//try 문
//			try {
//				a = sc.nextInt();
//			} catch (Exception e) {
//				sc.hasNextLine();
//				System.out.println("숫자를 입력하셔야합니다.");
//				i--;
//				continue;
//			}
			
//			a = sc.nextInt();
//			
//			if(num==a) {
//				System.out.println("정답입니다.");
//				win=true;
//				break;
//			}else if(num>a){
//				System.out.println("업입니다.");
//			}else if(num<a){
//				System.out.println("다운입니다.");
//			}else {
//				System.out.println("숫자가 아닙니다.");
//			}
//		
//		}
//		if(!win)System.out.println("횟수를 초과하였습니다.");
//		System.out.println("답은 " + num + "입니다.");
//		
		//while 문
	
//		while(count < 5) {
//			System.out.printf("%d) 맞춰보세요",count+1);
//			
//			//hasNextInt 문
//			if (!sc.hasNextInt()) {//입력한 값이 숫자가 아니면
//					sc.nextLine(); //버퍼지우기
//					continue; //반복문의 처음으로 다시 돌아가서 계속
//				}
//			a = sc.nextInt();
//			
//			if(num==a) {
//				System.out.println("정답입니다.");
//				win=true;
//				break;
//			}else if(num>a){
//				System.out.println("업입니다.");
//			}else if(num<a){
//				System.out.println("다운입니다.");
//			}else {
//				System.out.println("숫자가 아닙니다.");
//			}
//			
//			count++;
//			
//		}
//		System.out.println("정답은 " + num + "입니다.");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	

}
