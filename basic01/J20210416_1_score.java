package basic01;

import java.util.Scanner;

public class J20210416_1_score {

	public static void main(String[] args) {
		//실습 2명의 국영수 점수 입력 합계 평균

		Scanner sc = new Scanner(System.in);
		String[] sub = {"국어","수학","영어"};
		int[][] score = new int[2][3];
		
		//타이틀
		while(true) {
			System.out.println("---------------------------");
			System.out.println("성적관리 프로그램v.1.0.0");
			System.out.println("---------------------------");
			System.out.println("1.성적등록");
			System.out.println("2.학생별 합계/평균");
			System.out.println("3.과목별합계 평균");
			System.out.println("0.종료");
			System.out.println("---------------------------");
			System.out.print("무엇을 하시겠습니까?");
			int no = sc.nextInt();
			System.out.println("---------------------------");			
			
//			if(no==1) {
//				//점수 입력 받기
//				for (int i = 0; i < score.length; i++) {
//					System.out.printf("[%d]의 점수를 입력하세요\n",i+1);
//					for (int j = 0; j < score[i].length; j++) {
//						System.out.printf("%s?",sub[j]);
//						score[i][j]= sc.nextInt();				
			
//						//{{30,40,50},{40,20,60}}
//					}
//				}
//			
//			}else if(no==2) {
//				//학생별로 합계 평균 출력
//				for (int i = 0; i < score.length; i++) {
//					int sum = 0;
//					for (int j = 0; j < score[i].length; j++) {
//						
//						sum +=score[i][j];
//					}
//					System.out.println("-----------------------------");
//					System.out.printf("[%d] 합계: %d 평균: %.2f\n",i+1,sum, (double)sum/score[i].length);
//				}
//				
//				System.out.println("-----------------------------");
//			}else if(no==3) {
//				//과목별로 합계평균 출력.
//				for (int j = 0; j < score[0].length; j++) {
//					int sum = 0;
//					for (int i = 0; i < score.length; i++) {
//						sum += score[i][j];
//					}
//					System.out.println("===========================================");
//					System.out.printf("[%s] 합계: %d 평균: %.2f\n",sub[j],sum,(double)sum/score.length);
//					System.out.println("===========================================");
//					}
//			}
//			else if(no==0){
//				break;
//			}else {
//				System.out.println("잘못된번호");
//			}
			switch(no){
				case 1:
					//점수 입력 받기
					for (int i = 0; i < score.length; i++) {
						System.out.printf("[%d]의 점수를 입력하세요\n",i+1);
						System.out.println("----------------------------");
						for (int j = 0; j < score[i].length; j++) {
							System.out.printf("%s?",sub[j]);
							score[i][j]= sc.nextInt();
						}
					}
					break;
				case 2:
					//학생별로 합계 평균 출력
					for (int i = 0; i < score.length; i++) {
						int sum = 0;
						for (int j = 0; j < score[i].length; j++) {
							
							sum +=score[i][j];
						}
						System.out.println("-----------------------------");
						System.out.printf("[%d] 합계: %d 평균: %.2f\n",i+1,sum, (double)sum/score[i].length);
						System.out.println("-----------------------------");
					}
					
					
					break;
				case 3:
					//과목별로 합계평균 출력.
					for (int j = 0; j < score[0].length; j++) {
						int sum = 0;
						for (int i = 0; i < score.length; i++) {
							sum += score[i][j];
						}
						System.out.println("===========================================");
						System.out.printf("[%s] 합계: %d 평균: %.2f\n",sub[j],sum,(double)sum/score.length);
						System.out.println("===========================================");
					}
					break;
				case 0:
					System.out.println("프로그램 종료");
					System.exit(0);
				default:
					System.out.println("잘못된번호");
		
				}
			sc.nextLine();//키보드 버퍼 비우기
			System.out.println("enter키를 한번더 눌러주세요");
			sc.nextLine();//홀딩입니다.
			}
	}
}
