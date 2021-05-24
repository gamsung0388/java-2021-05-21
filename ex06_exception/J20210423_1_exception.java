package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class J20210423_1_exception {
		
	public static void main(String[] args) {
		// 예외처리
//		Scanner sc = new Scanner(System.in);
//		
//		int a = 10,b = 0,cnt = 0;
//		b = sc.nextInt();
//		System.out.println(a/b); 
		
		//while
//		while (true) {
//			System.out.println("나눌 수를 입력하세요");
//			try {//예외 발생 가능성 문장
//				b = sc.nextInt();
//				System.out.println(a/b);
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("숫자를 입력해주세요");
//				sc.nextLine(); //버퍼비우기
//				e.printStackTrace(); //예외발생된 지점 추적 출력
//			} catch (ArithmeticException e) {//예외가 발생했을 때 실행
//				System.out.println("0으로 나눌 수 없어요");
//				e.printStackTrace();
//			} catch (Exception e) {//모든 예외를 처리:마지막에 처리
//				System.out.println("예외발생");
//				e.printStackTrace();
//			}
//		}
//		System.out.println("프로그램 정상종료");
		
		//실습)
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {10,20,30};
//		
////		System.out.println("정수를 입력해주세요!");
////		int c = sc.nextInt();
////		System.out.println(arr[c-1]);
//		
//		while(true) {
//			System.out.println("정수를 입력해주세요!");
//			try {
//				int c = sc.nextInt();
//				System.out.println(arr[c-1]);
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("정수를 입력해주세요");
//				sc.nextLine();
//				e.printStackTrace();
//			} catch (ArrayIndexOutOfBoundsException e) {//예외가 발생했을 때 실행
//				System.out.println("1부터 3이하를 입력해주세요");
//				e.printStackTrace();
//			} catch (Exception e) {//모든 예외를 처리:마지막에 처리
//				System.out.println("예외발생");
//				e.printStackTrace();
//			}
//		}
		
		//예외의 종류
		//1)체크 예외: RuntimeException을 상속하지않는 예외
		//네트워크 db나 파일 등 외부와 연결되는 것들
		
		//2)언체크 예외: RuntimeException을 상속한 예외
		File file = new File("sample.txt");
		System.out.println(file);
		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일을 성공적으로 읽어드렸습니다");
			while (sc.hasNextLine()) { //다음 데이터가 있는가?
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {//체크예외
			System.out.println("파일을 찾을 수 없습니다");
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	}

}
