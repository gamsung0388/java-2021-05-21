package ex01_class;

import java.util.Arrays;

//학생클래스
//필드:반,이름,점수(자바,파이썬,c),합계(sum)
//메소드:합계 계산, 평균을 계산해서 반환.
class Student{
	String group = "1반";
	String name = "빌게이츠";
	int[] score = new int[3];
	int sum;
	//합계구하기
	//method의 overloading
	////call by value
	void sumCal(int a, int b, int c) { //합계 
		sum = 0;
		score[0] = a; score[1] =b; score[2] = c;
		sum = a+b+c;
	}
	////call by reference
	void sumCal(int[] score) {//합계
		sum = 0;
		this.score = score; //얉은 복사.
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
	}
	//평균구하기.
	double avgCal() {
//		double avg = (double)sum/score.length;
		
		return (double)sum/score.length;
		//return Math.round(avg * 100)/100;
	}

}

public class J20210419_3_student {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sumCal(60,50,70);
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계"+s1.sum);
		System.out.println("평균"+ s1.avgCal());
		s1.sumCal(new int[] {70,80,90});
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계" + s1.sum);
		System.out.println("평균"+ s1.avgCal());
	}
	
}
