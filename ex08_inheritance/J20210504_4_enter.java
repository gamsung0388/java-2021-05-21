package ex08_inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//물건클래스(부모클래스)
class Thing{
	
}
//노트클래스
class Note extends Thing{
	@Override
	public String toString() {
		return "노트" ;
	}
}
//펜클래스
class Pen extends Thing{
	@Override
	public String toString() {
		return "펜" ;
	}
}
//입고클래스
class Enter{
	//재고 저장 맵
	Map<String, Integer> map = new HashMap<>();
	//입고메소드
	void enterlist(Thing t,int qty) {
		System.out.println(t.toString() + "(이/가) " + qty + "개 입고되었습니다");
		Integer stockQty = map.get(t.toString());//기본 재고 조회
		if (stockQty == null) stockQty = 0; //재고가 없을 겨우 초기화
		map.put(t.toString(), stockQty+ qty);
		
	}
	//재고 출력 메소드
	void stockprint(Thing t){
		System.out.println(t.toString()+"(은/는) "+map.get(t.toString())+ "개의 입고된 품목이 있습니다.");
	}
}



public class J20210504_4_enter {

	public static void main(String[] args) {
		//객체생성
		Enter e = new Enter();
		Thing n = new Note();
		Thing p = new Pen();
		//메소드 실행
		System.out.println();
		e.enterlist(n, 50);
		e.enterlist(n, 100);
		e.enterlist(p, 50);
		e.enterlist(p, 70);
		e.stockprint(n);
		e.stockprint(p);
		

	}

}
