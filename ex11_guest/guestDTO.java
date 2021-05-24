package ex11_guest;

import java.sql.Date;

public class guestDTO {
	private int seq;
	private String name;
	private String email;
	private String ps;
	private String sub;
	private Date regidate;
	public guestDTO() {
		super();
	}
	public guestDTO(String name, String email, String ps, String sub) {
		super();
		this.name = name;
		this.email = email;
		this.ps = ps;
		this.sub = sub;
	}
	public guestDTO(int seq, String name, String email, String ps, String sub, Date regidate) {
		super();
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.ps = ps;
		this.sub = sub;
		this.regidate = regidate;
	}
	public guestDTO(int seq, String name, String email, String ps, String sub) {
		super();
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.ps = ps;
		this.sub = sub;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "guestDTO [seq=" + seq + ", name=" + name + ", email=" + email + ", ps=" + ps + ", sub=" + sub
				+ ", regidate=" + regidate + "]";
	}
	
	
}
