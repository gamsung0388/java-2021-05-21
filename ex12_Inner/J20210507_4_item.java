package ex12_Inner;

interface Item{
	void nameprint(String itemname);//컴파일시에 실행
}



public class J20210507_4_item {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//item인터페이스를 상속받는 객체 생성
		Item item = new Item() {
			
			@Override
			public void nameprint(String itemname) { //런타임 시에 실행
				System.out.println(itemname);
			}
		};
		item.nameprint("알약");
	}

}
