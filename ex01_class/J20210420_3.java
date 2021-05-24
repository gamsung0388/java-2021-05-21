package ex01_class;

import java.util.Arrays;


class Sum{
	//두 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b){
		
		return a+b;
	}
	//세 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b,int c){
		return a+b+c;
	}
	//배열을 매개변수로 받아서 합을 리턴하는 메소드
	int add(int[] arr) {//매개변수 하나.
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		arr[arr.length-1] = sum; //마지막 index에 합계넣기
		return sum;
	}
	//가변인자
	
	int addVarargs(int...arr) {//매개변수가 몇개든 상관없음.
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void valiableString(String...arr) {
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for (String str : arr) {
			System.out.println(str);
		}
	}
}

public class J20210420_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		System.out.println(s.add(1, 2));
		System.out.println(s.add(12, 3, 6));
		//배열
		int[] arr = {10,20,30,40,0};
		System.out.println(s.add(arr));
		System.out.println(Arrays.toString(arr));
		
		//가인인자
		System.out.println(s.addVarargs(10,20,30,40));
		s.valiableString("buy","sell","bye","hi");
		
		
	}

}
