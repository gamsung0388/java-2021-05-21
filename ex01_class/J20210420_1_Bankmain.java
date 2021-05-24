package ex01_class;

import java.util.Scanner;

//은행클래스:Bank
//필드:은행명(bankname),계좌번호(bankno),잔액(balance),
//생성자, getter, setter

public class J20210420_1_Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//한개의 계좌
//		Bank[] ar = new Bank[3];
		
		Bank b1 = null;
		while(true) {
			System.out.println("-------------------");
			System.out.println("-----감성은행------");
			System.out.println("-------------------");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("9.종료");
			System.out.println("--------------------");
			
			
			System.out.println("하실 업무를 선택해주세요");
			int a = sc.nextInt();
			
			String bankname,bankno;
			int in,out;
			
			//nextLine: int의 엔터값을 받아들여서/버퍼 비우기.
			switch (a){
			case 1:
				sc.nextLine();
				System.out.print("통장이름?");
				bankname = sc.nextLine();
				System.out.print("계좌번호?");
				bankno = sc.next();
				b1 = new Bank(bankname, bankno);
				System.out.println("통장이름은 "+ b1.getBankname()+ " 계좌번호: "+ b1.getBankno());
				break;
			case 2:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.println("얼마를 입금하시겠습니까");
				in = sc.nextInt();
				b1.input(in);
				break;
			case 3:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.println("얼마를 출금하시겠습니까");
				out = sc.nextInt();
				int result = b1.output(out);
				if (result ==0) {
					System.out.println("출금이 완료되었습니다.");
				}else
					System.out.println("잔액부족");
				System.out.println("잔액: "+ b1.getBalance());
				break;
			case 4:
				System.out.println("현재 잔액은 "+ b1.getBalance() +"입니다.");
				break;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0);
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
			
			sc.nextLine();
			System.out.println("enter 한번만 더 눌러주세요");
			sc.nextLine();
			
		}
		
	}

}
