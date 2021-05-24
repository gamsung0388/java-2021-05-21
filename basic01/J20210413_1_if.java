package basic01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class J20210413_1_if {

	public static void main(String[] args) {
		//조건문: if
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 정수를 입력하세요 ");
//		int score1 = sc.nextInt();
//		int score2 = sc.nextInt();
//		if(score1>score2) {
//			System.out.println("큰수는 " + score1);
//			System.out.println("좌가 더큽니다"); 
//		}
//		else {
//			System.out.println("큰수는 " + score2);
//			System.out.println("우가 더큽니다"); 
//		}
		
		
		//실습)점수 입력받아 점수에 따라 등급을 나눈다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 ");
//		int score = sc.nextInt();
//		
//		if(score >=90) {
//			System.out.println("A등급입니다");
//		}else if(score>=80) {
//			System.out.println("B등급입니다");
//		}else if(score>=70) {
//			System.out.println("C등급입니다");
//		}else if(score>=60) {
//			System.out.println("D등급입니다");
//		}else {
//			System.out.println("F등급입니다");
//		}

		
		//실습)등수와 전체인원수를 받아
		//상위 15 a 35 b 50 c
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("전체인원수와 등수를 입력하세요");
//		int num = sc.nextInt();
//		int rank = sc.nextInt();

		//try
//		if(rank/num * 100 <= 15) {
//			System.out.println("A학점");
//		}else if(rank/num * 100 <= 35) {
//			System.out.println("B학점");
//		}else if(rank/num * 100 <= 50) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("잘못된 값");
//		}
		
		//teaching
//		if (rank <= num*0.15) {
//			System.out.println("A학점");
//		} else if (rank < num*0.35) {
//			System.out.println("B학점");
//		} else if (rank < num*0.50) {
//			System.out.println("C학점");
//		} else {
//			System.out.println("잘못된 값.");
//		}
		
		//실습)화씨(F) 섭씨(C)로 바꾸기
		//(32x°F − 32) × 5/9 = x°C 화 - 섭
		//(32°C × 9/5) + 32 = 89.6°F 섭 - 화
		//온도 : 10 C 또는 100 F
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도를 넣으시오");
//		int t =sc.nextInt();
//		String s =sc.next(); //참조변수 :주소를 가지고 있다.
//		
//		if (s.equals("C") ) {//섭씨온도
//			System.out.println("화씨온도: "+ ((t * (double)9/5) + 32));
//		}else if(s.equals("F")){//화씨온도
//			System.out.println("섭씨온도: "+ ((t - 32) *(double) 5/9));
//		}else {//그외
//			System.out.println("잘못된 입력");
//		}
		
		//실습)계산기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계산식을 입력하세요");
//		try {
//			int a = sc.nextInt();
//			String sign = sc.next();
//			int b = sc.nextInt();
//			if (sign.equals("+")){
//				System.out.println(a + " + " + b + " = " + (a+b));
//			}else if (sign.equals("-")){
//				System.out.println(a + " - " + b + " = " + (a-b));
//			}else if (sign.equals("*")){
//				System.out.println(a + " * " + b + " = " + (a*b));
//			}else if (sign.equals("/")){
//				System.out.println(a + " / " + b + " = " + ((double)a/b));
//			}
//			
//			
//		} catch (InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요");
//		}
		
		
		//계산기(입력값 확인)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		//System.out.println("숫자:"+ sc.hasNextInt());
		
		
		//코드인스펙션:(규율) ==로 true/false 비교하지않는다.
//		if (sc.hasNextInt()) {//숫자라면
//			int a = sc.nextInt();
//			System.out.println(a);
//		}else {
//			System.out.println("잘못된 숫자");
//		}

//		if (!sc.hasNextInt()) {//숫자아니라면
//			System.out.println("잘못된 숫자");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}
		
		//실습)아이디와 패스워드를 입력받아 로그인을 성공여부를 결정짓는 프로그램
		//아이디를 입력해주세요//일치합니다
		//패스워드를 입력해주세요//일치합니다.
		//로그인성공
		
		
		//teaching
//		String myid = "java";
//		string mypw = "1111";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력해주세요");
//		String id = sc.next();
		
//		if(id.equals(myid)) {
//			System.out.println("비밀번호는?");
//			String pw = sc.next();
//			if(pw.equals(mypw)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호 불일치");
//			}
//		
//		}else {
//				System.out.println("아이디가 불일치");
//			}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력해주세요");
//		String id = sc.next();
//		System.out.print("비밀번호를 입력해주세요");
//		String pw = sc.next();
//	
//		if(id.equals("java")&& pw.equals("1111") ) {
//			System.out.println("로그인 성공하였습니다.");
//		}else if(!id.equals("java") ) {
//			System.out.println("아이디를 제대로 입력해주세요");
//		}else if(!pw.equals("1111")) {
//			System.out.println("비밀번호를 제대로 입력해주세요");
//		}else {
//			System.out.println("둘다 다시입력해주세요");
//		}
	
		
		
		
		
		//실습)전기사용량
		//사용량 받아 요금 계산
		//기본요금+
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용량을 입력하세요");
//		int s = sc.nextInt();
//		
		//저압
		
//		teaching
//		double won; 
//		int use =401; //사용량
//		double eleUse1 = 88.3;//1단계 전력량 요금
//		double eleUse2 = 182.9;//2단계 전력량 요금
//		double eleUse3 = 275.6;//3단계 전력량 요금
//		int base;//기본요금 
//		if(use<=200) {//1단계
//			base = 910;
//			won = base + use * eleUse1;
//		}else if (use <= 400) {//2단계
//			base = 1600;
//			won = base +(200*eleUse1)+ ((use-200)*eleUse2);
//		
//		}else {//3단계
//			base = 7300;
//			won = base +(200*eleUse1)+(200*eleUse2)+ ((use-400)*eleUse3);
//		}
//
//		
//		System.out.println(won);
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		
////		System.out.println("사용요금: " +String.format("%.0f", won));		
////		won = Double.parseDouble(String.format("%.0f", won));	//반올림
//		System.out.println("사용요금:" + (int)won);
//		
//		//기타계절
//		if(s<=200) {
//			System.out.println((910+(88.3*s))+"원");
//		}else if(s<=400) {
//			System.out.println((1600+(182.9*s))+"원");
//		}else if(s>400) {
//			System.out.println((7300+(275.6*s))+"원");
//		}else {
//			System.out.println("다시입력해주세요");
//		}

		
		//하계
//		if(s<=300) {
//			System.out.println((910+(88.3*s))+"원");
//		}else if(s<=450) {
//			System.out.println((1600+(182.9*s))+"원");
//		}else if(s>450) {
//			System.out.println((7300+(275.6*s))+"원");
//		}else {
//			System.out.println("다시입력해주세요");
//		}
		
		//고압
		
		//기타계절
//		if(s<=200) {
//			System.out.println((730+(73.3*s))+"원");
//		}else if(s<=400) {
//			System.out.println((1260+(142.3*s))+"원");
//		}else if(s>400) {
//			System.out.println((6060+(210.6*s))+"원");
//		}else {
//			System.out.println("다시입력해주세요");
//		}

		
		//하계
//		if(s<=300) {
//			System.out.println((730+(73.3*s))+"원");
//		}else if(s<=450) {
//			System.out.println((1260+(142.3*s))+"원");
//		}else if(s>450) {
//			System.out.println((6060+(210.6*s))+"원");
//		}else {
//			System.out.println("다시입력해주세요");
//		}
		
		

		//실습)년을 입력받고 윤년계산.
		
		//4로 나누어떨어지고 
		//100으로 나누어 떨어지지x
		//400으로 나누어 떨어져야한다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("연도를 입력하세요 ");
//		double year = sc.nextDouble();
//		
//		if (year%4 ==0 && year%100!=0 || year%400==0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("평년");
//		}
//		
		
		
		//실습)적정체중 구하기
		//이름/신장/몸무게 입력받고 적정체중여부 출력.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름,신장,몸무게?");
//		String name = sc.next();
//		double cm = sc.nextDouble();
//		double kg = sc.nextDouble();
//		
//		double kgm = (cm-100)*0.9;
//		
//		if(kgm > kg-(kg*0.2)&&kgm< kg+(kg*0.2)) {
//			System.out.println(name + "은 적정체중");
//		}else if(kgm > kg+(kg*0.2)){
//			System.out.println(name +"은 체중미달");
//		}else  {
//			System.out.println(name + "은 과체중");
//		}
		
		
		//무작위의 수 추출
		// 0<= 랜덤값 < 1
		//r * (end-start+1)+start
//		double r = Math.random();
//		System.out.println(r);
		//1 2 3 4 5 6
//		System.out.println((int)(6*r +1)); //1~6까지
		
//		System.out.println((int)(r*(6+1-1)+1)); 
		//마지막- 시작점 +1
		//0/1/2/3/4/5
		//5/6/7/8/9/10
		
//		System.out.println((int)(r*(10-5+1) +5)); //5~10
//		System.out.println((int)(r*(20-11+1) +11)); //11~20
		
		//주사위게임
		
		double r = Math.random();
		double r2 = Math.random();
		
		double a = (int)(r*(6+1-1)+1);
		double b = (int)(r2*(6+1-1)+1);
		System.out.println();
		
		if (a>b) {
			System.out.println("a: "+ a + "b:"+ b +" a승");
		}else if(b>a){
			System.out.println("a: "+ a + "b:"+ b +" b승");
		}else {
			System.out.println("a: "+ a + "b:"+ b +" 무승부");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
