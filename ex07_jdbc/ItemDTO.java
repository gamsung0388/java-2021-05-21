package ex07_jdbc;

import java.util.Date;

public class ItemDTO {
	private String item_code;
	private String item_name;
	private int price;	
	private String bigo;
	private Date regdate;
	
	
	public ItemDTO() {
		super();
	}
	
	public ItemDTO(String item_code, String item_name, int price, String bigo, Date regdate) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.price = price;
		this.bigo = bigo;
		this.regdate = regdate;
	}


	public String getBigo() {
		return bigo;
	}

	public void setBigo(String bigo) {
		this.bigo = bigo;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemDTO [item_code=" + item_code + ", item_name=" + item_name + ", price=" + price + ", bigo=" + bigo
				+ ", regdate=" + regdate + "]";
	}

	
}
