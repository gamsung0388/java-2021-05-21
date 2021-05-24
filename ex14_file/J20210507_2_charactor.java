package ex14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class J20210507_2_charactor {
	public static void main(String[] args) {
		//문자기반:문자데이터의 입출력을 다루는 스티림
		//cha형 변수: 2byte
		//자바는 모든문자를 유니코드를 기준으로 표현
//		
//		char c = '홍';
//		System.out.println(c);
		//문자단위로 쓰기
//		 System.out.println("자바".getBytes().length);
//		//try-with문
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) {	
//			 fw.write('A');
//			 fw.write("자바");
//			 fw.write('B');
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//파일 읽기
//		int ch;
//		try (FileReader fr =new FileReader("./data/charSample.txt")){
//			while ((ch = fr.read()) != -1) {
//				System.out.print((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			// TODO: handle finally clause
//		}
		
		
		
		
		
		//실습) 좋아하는 칼라를 입력받아 파일을 만들고
		//파일을 읽어서 리스트 출력
		
		try (FileWriter fw =  new FileWriter("./data/colorful.txt")) {
			fw.write("파랑");
			fw.write("초록");
			fw.write("노랑");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		List<Character> list = new ArrayList<>();
		
		int ch;
		char hc;
		try (FileReader fr = new FileReader("./data/colorful.txt")){
			while ((ch = fr.read()) != -1) {
					hc = (char)ch;
					list.add(hc);
			}	
			System.out.println(list.toString());
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		//실습)이름과 점수를 입력받아 파일에 저장하고
		//파일을 읽어서 합계와 평균구하기
		//문자를 숫자로 바꾸기
//		
//		try (FileWriter fw = new FileWriter("./data/score.txt")){
//			fw.write("아이유,100,70");
//			fw.write("이지동,50,80");
//			fw.write("이지금,90,20");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		//read
//		int cr;
//		char d;
//		try(FileReader fr = new FileReader("./data/score.txt")){
//			while((cr = fr.read()) != -1) {
//				 d =(char)cr;
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println(Integer.parseInt("100")+ Integer.parseInt("80"));;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
