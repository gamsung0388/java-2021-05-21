package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Junit_Test {
	guestDAO gdao = new guestDAOImpl();
	
	
	@Test
	void testInsert() {
		guestDTO gdto = new guestDTO("아이유","ryan9320@gmail.com","0000","사연");
		int cnt =gdao.insert(gdto);
		System.out.println(cnt +"건 추가");
	}

	@Test
	void testUpdate() {
		guestDTO gdto = new guestDTO(1,"이지은","t9320@naver.com","0000","사연");
		int cnt =gdao.update(gdto);
		System.out.println(cnt +"건 추가");
	}

	@Test
	void testDelete() {
		
		int seq = 2;
		System.out.println(seq+"삭제");
		int cnt = gdao.delete(seq);
	}

	@Test
	void testSelectOne() {
		guestDTO gdto = gdao.selectOne(3);
		System.out.println(gdto);
	}

	@Test
	void testSelectList() {
		List<guestDTO> list = gdao.selectList();
		for (guestDTO gdto : list) {
			System.out.println(gdto.getSeq()+ "번 이름:"+gdto.getName()+ " 이메일:"+gdto.getEmail()+
				" 비밀번호:"+gdto.getPs()+" 내용:"+gdto.getSub()+" 날짜:"+gdto.getRegidate());

		}
	}

}
