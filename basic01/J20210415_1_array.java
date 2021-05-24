package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class J20210415_1_array {

	public static void main(String[] args) {
		// 배열
		//컴파일시 바로 빨간줄.런파임시 런타임때
//		int cnt =5;
//		int[] arr; //선언은 stack에 생성
//		//자바는 동적배열
//		arr = new int[cnt]; //배열은 heap에 생성//객체생성해서 주소를 arr에 대입
//		arr[0] = 10;
//		System.out.println(arr[0]);
//		arr[5] = 100; //5번 index는 없다//에러
	
		
		
		//선언하고 객체 생성
//		int[] arr = new int[5];
//		//1~5까지의 값을 대입한다.
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
//		}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//선언과 초기화 //사이즈 생략해야함[]
//		int[] arr = new int [] {10, 20, 30};
		
		//int[] arr = new int[] {10, 20, 30};
//		int[] arr = {10, 20, 30};
//		//둘다 가능.
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//for~each문
//		for (int a : arr) {
//			System.out.println(a);
//		}
//		//Arrays 클래스 이용  문자열 출력
//		System.out.println( Arrays.toString(arr));//오버로딩.다른것을 중복실행
//		System.out.println(arr.toString()); //오버라이딩 부모를 가져와 재정의.
//		System.out.println(arr);//println 메소드는 toString()실행
//		
		
		//실습)학생 3명의 점수를 입력받아서 합계평균
//		int[] score = new int[3];
//		int sum=0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i<score.length;i++) {
//			System.out.printf("%d) 점수를 입력하세요",i+1);
//			score[i] = sc.nextInt();
//		}
//		
//
//		
//		for (int s : score) {
//			sum += s;
//		}
//		System.out.println("합계:"+sum);
//		System.out.printf("평균=%2.f 점",(double)sum/3);
		
		//문자열 배열
////		String[] arr = new String[] {"java","python","c"};
//		String[] arr = {"java","python","c"};
//		
//		for (String s : arr) {
//			System.out.println(s); //tostring 생략가능.
//
//		}
//		int[] a = new int[3]; //12byte
		
//		실습) 좋아하는 칼라 3개를 입력받아 배열에 저장하고 출력.
//		String[] arr = new String[3];
//		
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("좋아하는 색 3가지");
//			arr[i] = sc.nextLine();
//		}
//		for (String s : arr) {
//			System.out.print(s+ " ");
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇번하시겠습니까? ");
//		int n = sc.nextInt()  ; //몇번
//		
//		
//		int[] fibo = new int[n];
//		fibo[0] = 0;
//		fibo[1] = 1;
//
//		for (int i = 2; i < n; i++) {
//			
//			fibo[i]=fibo[i-2]+fibo[i-1];
//		}
//		for (int f : fibo) {
//			System.out.print(f+" ");
//		}
		
		
		//시험채점 프로그램
		
//		int[] test = new int[] {5,4,2,2,1,4,3,3,2,5};
//		int[] ans = new int[10];
//		int score = 0,o=0,x=0;	
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("답안을입력하세요.");
//		
//		for (int i = 0; i < test.length; i++) {
//			
//			ans[i] = sc.nextInt();
//			if(ans[i]==test[i]) {
//				score+=10;
//				o++;
//			}else {
//				x++;
//			}
//		}
//		if(score>90) {
//			System.out.print(score + "점: 상위권 정답:" + o + "개 오답:"+ x +"개 오답체크하세요");
//		}else if(score>70) {
//			System.out.println(score + "점: 중위권 정답:" + o + "개 오답:"+ x +"개 오답체크하세요");
//		}else {
//			System.out.println(score + "점: 하위권 정답:" + o + "개 오답:"+ x +"개 오답체크하세요");
//		}
		
		
		
		
		
		
		
//		실습)최대값/최소값 출력
//		int max= 0, min = 0;//범위안의 가장 작은값을 초기값.
		
		
//		int[] arr = {4,6,7,2,5};
//		for (int i = 0; i < (arr.length-1); i++) {
//			if (arr[i]>arr[i+1]) {
//				max = arr[i];
//			}else if(arr[i]<arr[i+1]){
//				min = arr[i];
//			}
//				
//		}System.out.println("최대: "+max +"\n최소: "+ min);
//		
//		int[] arr = {4,6,7,2,5};
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>max)max = arr[i];
//		}
//		System.out.println("가장큰값:"+ max);
//		
		
		
		
		
		//배열의 복사
		//얕은 복사 : 주소만 복사
//		int[]src = {1,2,3,4,5};
//		int[]dest = src;
//		
//		System.out.println(src);
//		System.out.println(dest);		
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("-------------------------------------------------");
//		
//		src[1]=20; dest[3]=40;
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//				
		
		
		//깊은 복사: 값을 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("-------------------------");
//		
//		for (int i = 0; i < src.length; i++) {
//			dest[i]=src[i];//값을 복사
//			
//		}
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("---------------------------");
//		dest[5] = 6;//6번째에 값추가
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("----------------------------");
//
//		src =dest;//주소복사
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("----------------------------");
//		
//		
		
		
//		//프레임 워크를 이용한 데이터 추가.
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
//		
//		System.arraycopy(src, srcPos, dest, destPos, length);
					//원본/복사시작인덱스/복사본/덮어쓰기 시작/길이,갯수/
		
		//배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
//		
//		System.arraycopy(src, 2, dest, 0, 2);
//		System.out.println("----------------------------");
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest"+Arrays.toString(dest));
//		System.out.println("----------------------------");

		
		
		
		
		
		
		
		
		//선택 정렬
		//{2,4,5,6,7};(오름차순
		//{7,6,5,4,2};(내림차순
//		int[] sortArr = {4,6,7,2,5};
//	
//		for (int j = 0; j < sortArr.length-1; j++) {
//
//			int min =sortArr[j];
//			int minIndex=j; //가장 작은 값의 index
//			for (int i = j+1; i < sortArr.length; i++) {
//				if (sortArr[i] < min) {
//					min = sortArr[i];
//					minIndex = i;
//				}
//			}
//		
//			System.out.println(min);
//			System.out.println(minIndex);
//			
//			//두수를 바꾸기
//			sortArr[minIndex]=sortArr[j];
//			sortArr[j]= min;
//			
//			System.out.println(Arrays.toString(sortArr));
//			
//		}
		
		//오름차순
//		int[] fre = {5,2,4,7,6};
//
//		int i, j, tmp = 0;
//		for (i= 0; i < (fre.length-1); i++) {
//			for (j = i+1; j < fre.length; j++) {
//				if(fre[i]>fre[j]) {
//					tmp = fre[i];
//					fre[i] = fre[j];
//					fre[j] = tmp;
//				}
//			}
//		}
//		for (i = 0; i < fre.length; i++) {
//			System.out.print(fre[i]+ " ");
//		}
//		
//		System.out.println("");
//		
//		
//		//내림차순
//		int[] post = {7,4,2,5,6};
//		
//		int e,f,tem = 0;
//		for (e = 0; e < (post.length-1); e++) {
//			for (f = e+1 ; f < post.length; f++) {
//				if(post[e]<post[f]) {
//					tmp = post[e];
//					post[e]=post[f];
//					post[f]=tmp;
//				}
//			}
//		}
//		for (e = 0; e < post.length; e++) {
//			System.out.print(post[e]+" ");
//		}
		
		
		
		//실습)로또번호 맞춘 갯수 출력.
//		int no = 6,num=0;
		//로또 번호 6을 만들기 (Math.random()*100+1);
		
//		int [] lot = new int [no];
//		int [] ans = new int [no];
//		
//		for (int a = 0; a < 6; a++) {//랜덤수 집어넣기
//			lot[a]  = (int) (Math.random()*100+1);
//			for (int l = 0; l < args.length; l++) {
//				if(lot[l]==a) {
//					a--;
//					continue;
//				}
//			}
//		}
//		
//		for (int k : lot) {
//			System.out.println(k);
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < lot.length; i++) {
//			System.out.println("번호를 입력하세요");
//			ans[i] = sc.nextInt();
//			
//			if(lot[i]==ans[i]) {
//				System.out.println(lot[i]);
//				num++;
//			}
//			
//		}
//		if(num<4) {
//			System.out.println(num+"개 맞췄습니다. 다음기회에");
//		}else if(num<5) {
//			System.out.println(num+"개 맞췄습니다. 3등입니다.");
//		}else if(num<6) {
//			System.out.println(num+"개 맞췄습니다. 2등입니다.");
//		}else if(num<7) {
//			System.out.println(num+"개 맞췄습니다. 1등입니다.");
//		}
//		
		
//		int[] no = {9,12,21,25,33,42};
		//로또 번호 6 만들기 
		
		//int의 범위
		System.out.println("MAX: "+Integer.MAX_VALUE);
		System.out.println("MIN: "+Integer.MIN_VALUE);
		
		int[]no = new int[6];
		Random rd = new Random();
		
		boolean b = false; //기존에 존재하지 않는다.
		for (int i = 0; i < no.length; i++) {
			int r = rd.nextInt(45)+1;
			//기본에 번호가 등록되어있다면
			for (int j = 0; j < i; j++) {
				if(no[j]==r) {
					i --;
					b = true; //존재한다.
					continue;
				}
			}			
			if(b) continue; //기존에 존재한다면
			no[i] = r;
		}
		
		Arrays.sort(no);
		System.out.println(Arrays.toString(no));
//	
		
		//실습)실수형 참조변수
		
		
		
	}

}
