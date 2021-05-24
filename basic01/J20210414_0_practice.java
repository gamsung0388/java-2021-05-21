package basic01;

import java.util.Scanner;

public class J20210414_0_practice {

	public static void main(String[] args) {
		
		
		
		// 설탕배달
		//3kg 봉지 5kg 봉지.
		//3의 배수	|	5의 배수
		// 3+5 
		//최대한 적은 봉지.
		// kg = n a개.
		//while 문 
		//안되면 -1
		//3<=n<=5000
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = 0,count5,count3, rest; //총개수 ,5,3,나머지
		System.out.print("입력하세요");
		int n = sc.nextInt(); //이동할 kg수 
		count5= n/ 5;
		
//		while(n>0) {
//			
//			if (n%5==0) {
//				n= n-5;
//			}else if(n%3==0) {
//				n = n-3;
//			}else {
//				n = n-5;
//			}			
//			a++;
//		}
//		if(n<0) {
//			a =-1;
//		}
//		System.out.println(a);
//	
		while(true) {
			rest = n - (5 * count5); //1
			if(rest % 3 == 0) {//나누어떨어지면
				count3 = rest /3;
				System.out.printf("필요한 봉지 수 : %d(5) + %d(3) 총개수: $d", count5,count3);
				break;
			
			}
			else {
				if(count5 ==0) {//5kg이 -이면 더이상 반복문 불가
					System.out.printf("%d\n",-1);
					break;
				}
				count5 -= 1; //5kg짜리 봉지수를 1를 줄인다.
			}
		}
		
		
		//별찍기
		
//		for(int i =1;i<11;i++) {
//			for(int j =11;j>1;j--) {
//				if (i<j) {
//					System.out.print(" ");
//				}else {
//				System.out.print("*");
//				}
//			}
//				
//			System.out.println("");
//		}
//		
		//소수
		
		//1안
//		Scanner sc = new Scanner(System.in);
//		System.out.println("양의정수? ");
//		int a = sc.nextInt();
//		boolean b = true; //소수여부
//		
//		for(int i = 2; i<a;i++) {
//			if(a%i !=0) {
//				System.out.printf("%d은 소수가 아닙니다.",a);
//				b = false;
//				break;
//			}
//		}
//		if (b) {
//			System.out.printf("%d은 소수 입니다.",a);
//		}
		
//		
		//2안
		
//		int a =5, i;
//		
//		for(i = 2; i<a;i++) {
//			if(a%i==0) {
//				System.out.printf("%d은 소수가 아닙니다.",a);
//				break;
//			}
//			
//		}
//		
//		if (i==5) {
//			System.out.printf("%d은 소수 입니다.",a);
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("양의정수?");
//		
//		int n = sc.nextInt(); 
//		boolean b; //소수여부
//		
//		
//		for(int j=2; j<n;j++) {
//			b =true; //소수라고 가정하고 시작.
//			for(int i = 2; i<j;i++) {
//				if(j%i ==0) { //나누어 떨어지면 소수가 아님.
////					System.out.println(j+"소수아님");
//					b = false; //소수 아님.
//					break;
//				}
//			}
//			if (b) {
//				System.out.print(j+" ");
//			}
//		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
