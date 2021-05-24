package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;

//단위테스트
class JunitTest {
	MemberDAO mdao = new MemberDAO();
	@Test
	void testSelectlist() {
		List<MemberDTO> mlist = mdao.selectlist();
		System.out.println(mlist);
		assertNotEquals(0, mlist.size());
	}

	@Test
	void testSelectOne() {
		String userid = "java";
		MemberDTO mdto=mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto); //mdto가 null이 아닐때 성공
	}

	@Test
	void testInsert() {
		String userid = "java";
		String passwd = "1111";
		int birthyear = 2008;
		MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
		int cnt = mdao.insert(mdto);
		//cnt가 0이 아니면 성공
		//assertNotEquals(0,cnt);
		//cnt가 1이면 성공
		assertEquals(1, cnt);
	}

	@Test
	void testUpdate() {
		String userid = "java";
		String passwd = "1222";
		int birthyear = 2017;
		MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "java";
		int cnt = mdao.delete(userid);
		assertEquals(1, cnt);
	}
	
	//날짜 문자열 포맷 
		@Test
		void test() {
			String str = "2021-04-28 15:09:26";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				System.out.println(sdf.format(sdf.parse(str)));
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
}
