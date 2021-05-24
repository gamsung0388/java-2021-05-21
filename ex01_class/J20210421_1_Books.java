package ex01_class;

import java.util.Arrays;

//책클래스
//필드 책코드(string),책명(string),단가(int),할인율(double)
//메소드 판매내역계산(매개반수 수량 반환값 판매금액
//dto                                                                                           /mvc 패턴
class Books{ //model(mvc
	private String bookcode;
	private String bookname;
	private int cost;
	private double discountrate;
	
	Books(){};
	public Books(String code, String name, int cost, double discount) {
		super();
		this.bookcode = code;
		this.bookname = name;
		this.cost = cost;
		this.discountrate = discount;
	}
		
	public String getBookcode() {
		return bookcode;
	}
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public double getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}
	@Override
	public String toString() {
		return "Books [code=" + bookcode + ", name=" + bookname + ", cost=" + cost + ", discount=" + discountrate + "]";
	}
	
}

//책관리 클래스
class Manager{ //cotrolor(mvc
	//판매금액합계
	//b001: 0 b002: 1
	private int[] tot = new int [10];
	int[] getTot() {
		return tot;
	}
	
	
	//판매금액 계산
	int salesell(Books book,int cnt,int index) {
//		System.out.println(book);
//		System.out.println(cnt);
		String bookcode = book.getBookcode();
		int cost = book.getCost();
		double discountRate = book.getDiscountrate();
		int totPrice = (int)(cost- cost*discountRate)*cnt;
		tot[index]+= totPrice;
		
		return totPrice;
	}
}

public class J20210421_1_Books {//view(mvc

	public static void main(String[] args) {
		Books[] barr = new Books[10];
		
		 barr[0] = new Books();
		 barr[0] .setBookcode("b001");
		 barr[0] .setBookname("java의 모든 것");
		 barr[0] .setCost(50000);
		 barr[0] .setDiscountrate(0.3);
//		System.out.println(b1);
		
		barr[1] = new Books ("b002","파이썬 100제",65000,0.2);
		
		Manager mg = new Manager();
		System.out.printf("책코드    책명		   판매금액\n");
		System.out.println("-------------------------------------");
		System.out.printf("%-8s %-10s %8d원\n",barr[0].getBookcode(), barr[0].getBookname(),mg.salesell( barr[0], 2, 0));
		System.out.printf("%-8s %-10s %8d원\n",barr[0].getBookcode(), barr[0].getBookname(),mg.salesell( barr[0], 4, 0));
		System.out.printf("%-8s %-10s %8d원\n",barr[1].getBookcode(), barr[1].getBookname(),mg.salesell( barr[1], 3, 0));
		
		
		System.out.println("-------------------------------------");
		System.out.println(Arrays.toString(mg.getTot()));
	}

}
