package ex05_cellection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J20210422_1_list {
	//프레임워크
	//잘만들어진 틀
	public static void main(String[] args) {
		//List<E> //인터페이스
		//저장순서가 있다.(인덱스가 있다)
		//데이터 중복 허용
		//1) ArrayList : 배열구조 : 검색시 유리, 추가, 삭제가 어렵다
		//element:<E>요소들
//		ArrayList <Integer> arrlist = new ArrayList<>();
////		arrlist.add(10);
////		arrlist.add(20);
////		arrlist.add(30);
////		System.out.println(arrlist);
//		//for 문
//		for (int i = 0; i < 3; i++) {
//			arrlist.add((i+1)*10);
//			System.out.println(arrlist);
//			
//		}
//		
//		//for문
//		for (int i = 0; i < arrlist.size(); i++) {
//			System.out.println(arrlist.get(i));
//		}
//		
//		//foreach문
//		for (Integer a : arrlist) {
//			System.out.println(a);
//		}
//		
//		arrlist.remove(1);
//		System.out.println(arrlist);
//		
//		arrlist.add(1,50);
//		System.out.println(arrlist);
	
//		System.out.println(arrName);
//		arrName.add("이리");
//		System.out.println(arrName);
//		arrName.set(0, "아");
//		System.out.println(arrName);
		
		//실습)이름을 입력을 받아 ArrayList만들기
//		Scanner sc = new Scanner(System.in);
//		List<String> arrName = new ArrayList<>();
		
//		String name;
//		do{
//			System.out.println("이름을 입력해주세요");
//			name = sc.next();
//			if(!name.equals("q")) {
//				arrName.add(name);
//			}else {
//				break;
//			}
//			//System.out.println(arrName);
//		}while(!name.equals("q"));
//		
//		for (int i = 0; i < arrName.size(); i++) {
//			System.out.println(i+1+":"+ arrName.get(i));
//		}
		

		//삭제
//		1안)
//		arrName.add("홍");
//		arrName.add("흙");
//		arrName.add("청");
//		arrName.add("백");		
//		System.out.println(arrName);
//		System.out.println("삭제할 이름은?");
//		String name = sc.next();
//		for (int i = 0; i < arrName.size(); i++) {
//			if(arrName.get(i).equals(name)) {
//			arrName.remove(i);
//			i--;
//			}
//		}
//		System.out.println(arrName);
		
		//2안)
//		//반복자 : iterator : 인덱스를 사용하지않음
//		arrName.add("홍");arrName.add("흙");arrName.add("청");arrName.add("백");		
//		System.out.println(arrName);
//		System.out.println("삭제할 이름은?");
//		String name = sc.next();
//		//반복자 생성
//		Iterator<String> it= arrName.iterator();
//		while(it.hasNext()) {
//			String n = it.next();
//			if(name.equals(n)) {
//				it.remove();
//			}
//		}
//		System.out.println(arrName);
		
		//실습)
		//선언과 동시에 초기화
//		Scanner sc = new Scanner(System.in);
		
//		//Arrays.asList(): 고정길이 배열 반환
//		List<String> list  = Arrays.asList("red","blue","yello"); 
//		System.out.println(list);
//		System.out.println("삭제할 단어? ");
//		String name = sc.next();
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) { //다음데이터가 있다면
//			String n = it.next();
//			if(name.equals(n)) {
//				it.remove();
//			}
//		}
//		System.out.println(list);
		
		//111 -> 하면 삭제 가능
//		List<String> list = new ArrayList<String>(Arrays.asList("red","blue","yello"));
		
		
		
		//실습)반 학생들의 키의 평균
//		Scanner sc = new Scanner(System.in);
//		List<Double> arrhei = new ArrayList<>();
//		double sum = 0;
//		int ch;
//		do {
//			System.out.println("키를 입력하세요");
//			ch =sc.nextInt();
//			if(ch != 0) {
//				arrhei.add(ch);
//			}
//		}while(ch !=0);
//		for (int i = 0; i < arrhei.size(); i++) {
//			sum += arrhei.get(i);
//		}
//		System.out.println(sum);
		
		//teach
//		while(true) {
//			System.out.println("키는?");
//			double hei = sc.nextDouble();
//			if (hei ==0)break;
//			arrhei.add(hei);
//			sum += hei;
//		}
//		System.out.println(sum);
//		System.out.println(arrhei.size());
//		System.out.println(sum/arrhei.size());
		
//		System.out.println(100.0/0);//무한
//		System.out.println(100/0);//예외
		
		//2)LinkedList : 리스트 기반
		//각 요소가 자신의 이전요소의 주소와 다음요소의 주소를 가지고 있다.
		//추가삭제가 쉽다. 검색시 성능이 저하
		
//		List<String> linklist = new ArrayList<>();		

		List<String> linklist = new LinkedList<>();		
		linklist.add("아이유");
		linklist.add("유애나");
		linklist.add("이지은");
		System.out.println(linklist);
		for (int i = 0; i < linklist.size(); i++) {
			System.out.println(linklist.get(i));
		}
		
		
		
		
	}

}
