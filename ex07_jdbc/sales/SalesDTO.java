package ex07_jdbc.sales;

import java.util.Date;

public class SalesDTO {
	private String saledate;
	private int seq;
	private String itemcode;
	private int qty;
	private int amount;
	private Date regdate;
	public SalesDTO() {
		super();
	}
	public SalesDTO(String saledate, int seq, String itemcode, int qty, int amount, Date regdate) {
		super();
		this.saledate = saledate;
		this.seq = seq;
		this.itemcode = itemcode;
		this.qty = qty;
		this.amount = amount;
		this.regdate = regdate;
	}
	public String getSaledate() {
		return saledate;
	}
	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "SalesDTO [saledate=" + saledate + ", seq=" + seq + ", itemcode=" + itemcode + ", qty=" + qty
				+ ", amount=" + amount + ", regdate=" + regdate + "]";
	}
	
}
