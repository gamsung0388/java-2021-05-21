package ex11_guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J20210506_main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------------");
			System.out.println("1. 방명록 쓰기");
			System.out.println("2. 방명록 수정");
			System.out.println("3. 방명록 삭제");
			System.out.println("4. 방명록 조회");
			System.out.println("9. 종료");
			System.out.println("----------------");
			System.out.print("골라주세요: ");
			int nb = sc.nextInt();
			guestDAO gdao = new guestDAOImpl();

			//방명록쓰기
			if (nb == 1) {
				System.out.println("이름을 입력해주세요");
				String name = sc.next();
				System.out.println("이메일을 입력해주세요");
				String email = sc.next();
				System.out.println("비밀번호를입력해주세요");
				String ps = sc.next();
				System.out.println("방명록을 입력해주세요");
				sc.nextLine();
				String sub = sc.nextLine();
				guestDTO gdto = new guestDTO(name,email,ps,sub);
				int cnt =gdao.insert(gdto);
				System.out.println(cnt +"건 추가");
			}
			
			//방명록 수정
			else if(nb == 2){
				System.out.println("순번을 입력해주세요");
				int seq = sc.nextInt();
				System.out.println("이름을 입력해주세요");
				String name = sc.next();
				System.out.println("이메일을 입력해주세요");
				String email = sc.next();
				System.out.println("비밀번호를입력해주세요");
				String ps = sc.next();
				System.out.println("방명록을 입력해주세요");
				sc.nextLine();
				String sub = sc.nextLine();
				guestDTO gdto = new guestDTO(seq,name,email,ps,sub);
				int cnt =gdao.update(gdto);
				System.out.println(cnt +"건 수정");
			}
			//방명록 삭제
			else if(nb == 3) {
				System.out.println("어떤 것을 삭제하시겠습니까?");
				int seq = sc.nextInt();
				int cnt = gdao.delete(seq);
			}
			
			else if(nb == 4) {
				System.out.println("1.한건조회");
				System.out.println("2.전체조회");
				System.out.println("골라주세요: ");
				nb = sc.nextInt();
				//방명록 한건 조회
				if(nb == 1) {
					List<guestDTO> list = new ArrayList<>();
					System.out.println("어떤 방명록을 조회하시겠습니까");
					int seq = sc. nextInt();
					guestDTO gdto =gdao.selectOne(seq);
					System.out.println(gdto.getSeq()+ "번 이름:"+gdto.getName()+ " 이메일:"+gdto.getEmail()+
							" 비밀번호:"+gdto.getPs()+" 내용:"+gdto.getSub()+" 날짜:"+gdto.getRegidate());
					
				}
				//방명록 전체 조회
				else if(nb == 2) {
					
					List<guestDTO> list = gdao.selectList();
					for (guestDTO gdto : list) {
						System.out.println(gdto.getSeq()+ "번 이름:"+gdto.getName()+ " 이메일:"+gdto.getEmail()+
							" 비밀번호:"+gdto.getPs()+" 내용:"+gdto.getSub()+" 날짜:"+gdto.getRegidate());
						
					}
				}
			}
			else if(nb == 9) {
				DBConn.dbClose();
				System.out.println("프로그램 종료");
				System.exit(0);;
			}
		
		
		
		}
	}
}
