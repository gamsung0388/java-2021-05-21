package ex07_jdbc;

//dto 명세서
public class RegionsDTO {
	private int region_id;
	private String region_name;
	
	public RegionsDTO() {
		super();
	}
	public RegionsDTO(int regoin_id, String regoin_name) {
		super();
		this.region_id = regoin_id;
		this.region_name = regoin_name;
	}
	public int getRegoin_id() {
		return region_id;
	}
	public void setRegoin_id(int regoin_id) {
		this.region_id = regoin_id;
	}
	public String getRegoin_name() {
		return region_name;
	}
	public void setRegoin_name(String regoin_name) {
		this.region_name = regoin_name;
	}
	@Override
	public String toString() {
		return "REGIONS [regoin_id=" + region_id + ", regoin_name=" + region_name + "]";
	}
	
	
}
