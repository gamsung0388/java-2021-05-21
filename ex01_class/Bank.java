package ex01_class;

//import java.util.Scanner;

//은행클래스:Bank
//필드:은행명(bankname),계좌번호(bankno),잔액(balance),
//생성자, getter, setter

public class Bank{
	//필드
	private String bankname;
	private String bankno;
	private int balance;
	
	//생성자:오버로딩
	public Bank(String bankname,String bankno){
		this.bankname = bankname;
		this.bankno = bankno;
	}
	public Bank(String bankname, String bankno, int balance) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
	}
	//새터//개터
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	//source - 필드,세터 게터
	
	//입금메소드
	void input(int money) {
		balance += money;
	}
	//출금 메소드
	int output(int money) {
		if(balance-money <0) {
			return -1; //출금안됨
		}
		balance -= money;
		return 0; //출금됨
		
	}
	
	//어노테이션
	//오버라이딩 : 부모클래스의 메소드를 재정의
	@Override 
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}//toString - 필드값출력 / 그냥 b1은 주소값 출력 //	System.out.println(b1); 출력
	
	
//}


//public class J20210420_1_Bank {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		Bank[] ar = new Bank[3];
//		
//		Bank b1 = null;
//		while(true) {
//			System.out.println("-------------------");
//			System.out.println("-----감성은행------");
//			System.out.println("-------------------");
//			System.out.println("1.계좌개설");
//			System.out.println("2.입금");
//			System.out.println("3.출금");
//			System.out.println("4.잔액조회");
//			System.out.println("0.종료");
//			System.out.println("--------------------");
//			
//			
//			System.out.println("하실 업무를 선택해주세요");
//			int a = sc.nextInt();
//			
//			String bankname,bankno;
//			int in,out;
//			int balance = 0;
//			
//			//nextLine: int의 엔터값을 받아들여서/버퍼 비우기.
//			switch (a){
//			case 1:
//				sc.nextLine();
//				System.out.print("통장이름?");
//				bankname = sc.nextLine();
//				System.out.print("계좌번호?");
//				bankno = sc.next();
//				b1 = new Bank(bankname, bankno);
//				System.out.println("통장이름은 "+ b1.getBankname()+ " 계좌번호: "+ b1.getBankno());
//				break;
//			case 2:
//				if(b1 == null) {
//					System.out.println("계좌를 먼저 개설하세요");
//					continue;
//				}
//				System.out.println("얼마를 입금하시겠습니까");
//				in = sc.nextInt();
//				b1.input(in);
//				break;
//			case 3:
//				if(b1 == null) {
//					System.out.println("계좌를 먼저 개설하세요");
//					continue;
//				}
//				System.out.println("얼마를 출금하시겠습니까");
//				out = sc.nextInt();
//				int result = b1.output(out);
//				if (result ==0) {
//					System.out.println("출금이 완료되었습니다.");
//				}else
//					System.out.println("잔액부족");
//				System.out.println("잔액: "+ b1.getBalance());
//				break;
//			case 4:
//				System.out.println("현재 잔액은 "+ b1.getBalance() +"입니다.");
//				break;
//			case 0:
//				System.out.println("종료합니다.");
//				System.exit(0);
//			default:
//				System.out.println("입력이 잘못되었습니다.");
//			}
//			
//			sc.nextLine();
//			System.out.println("enter 한번만 더 눌러주세요");
//			sc.nextLine();
//			
//		}
//		

			
		
//		if (a == 1) {
//			Bank b1 = new Bank("저금","110-2231-3333");
//			System.out.println("은행업무:"+ b1.getBankname());
//			System.out.println("계좌번호:"+ b1.getBankno());
//		}else if(a==2) {
//			
//		}
//		System.out.println("=================================================");
//		Bank b2 = new Bank("예금","130-2221-3342",300000);
//		b2.setBankname("감성적금");
//		System.out.println("은행업무:"+ b2.getBankname());
//		System.out.println("계좌번호:"+ b2.getBankno());
//		System.out.println("잔액:"+ b2.getBalance());
//		b2.output(25000);
//		System.out.println(b2);
//	
		
		
//	}

}
