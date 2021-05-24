package ex11_guest;

import java.util.List;

public interface guestDAO {
	//추가
	int insert(guestDTO gdto); 
	//수정
	int update(guestDTO gdto);
	//삭제
	int delete(int seq);
	//한건조회
	guestDTO selectOne(int seq);
	//전체조회
	List<guestDTO> selectList();

}
