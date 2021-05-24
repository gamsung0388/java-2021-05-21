package ex01_class;

//setter,getter

//상품클래스(Item)
//필드:itemcode(코드),Itemname(이름),price(단가)
//메소드:
//1)판매 금액 계산: 매개변수(판매수량) 리턴값(판매금액)
//2)

class Item{

	
	//private 접근제한자: 클래스 내부에서만 접근가능. //은닉화,캡슐화
	private String itemcode;
	private String itemname;
	private int price;
	
	int amount(int buy) {
		return price * buy;
	}
	//메소드를 이용해서 접근
	//세터(setter)
	//this는 객체자신.
	void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	void setPrice(int price) {
		this.price = price;
	}
	//getter
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
	
}

public class J20210419_4_Item {

	public static void main(String[] args) {
		Item item = new Item();
		item.setItemcode("8801");
		item.setItemname("사이다");
		item.setPrice(2500);
		System.out.println("코드명: "+ item.getItemcode() + " "+ item.getItemname() + "의 판매금액: "+ item.amount(5)+"원");
		
		Item item2 = new Item();
		item2.setItemcode("8802");
		item2.setItemname("콜라");
		item2.setPrice(3000);
		System.out.println("코드명: "+ item2.getItemcode() + " " + item2.getItemname() + "의 판매금액: "+ item2.amount(5)+"원");
		
		
	
	}

}
