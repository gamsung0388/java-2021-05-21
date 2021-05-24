package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_2_throws {
	
	static void arrayIndex(int index){
		int[] arr = {10,20,30};
		try {
			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오류");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
	
	
	//비지니스 로직
	
	
	
	//throw : 예외를 던진다
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException{
		int[] arr = {10, 20, 30};
		System.out.println(arr[index]);
		
	}
	//파일을 읽기 메소드
	static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		System.out.println(file);
		
		//Scanner sc = new Scanner(file, "utf-8"); 파일 utf-8로 저장시
		Scanner sc = new Scanner(file);
		System.out.println("파일을 성공적으로 읽어드렸습니다");
		while (sc.hasNextLine()) { //다음 데이터가 있는가?
			String s = sc.nextLine();
			System.out.println(s);
			}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// throws : 예외던지기
		//J20210423_2_throws.arrayIndex(3);
		//던진 예외를 처리
//		try {
//			J20210423_2_throws.arrayIndex_throws(3);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("trows로 처리, 인덱스 오류");
//		} catch (Exception e) {
//			System.out.println("예외발생");
//		}
		
		
		try {
			J20210423_2_throws.fileRead("sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
			e.printStackTrace();
		}
			
		

		
		
	}

}
