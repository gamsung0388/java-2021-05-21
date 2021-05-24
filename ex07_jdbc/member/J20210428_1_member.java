package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;


public class J20210428_1_member {

	public static void main(String[] args) {
		//member 데이터 추가
		
		Scanner sc = new Scanner(System.in);
		MemberDAO mdao = new MemberDAO();//객체생성
		String login_userid="";
		boolean logincheck = false;//로그인여부
		while (true) {
			System.out.println("--------------------");
			System.out.println("회원시스템 ["+login_userid+"]");
			System.out.println("--------------------");
			System.out.println("0.로그인");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원조회");
			System.out.println("5.회원전체조회");
			System.out.println("9.종료");
			System.out.println("--------------------");
			System.out.println("번호를 입력하세요");
			int no =sc.nextInt();
		
			//view뷰
			if (no==5) {//여러건조회
				
				if(!logincheck) {
					System.out.println("로그인후 사용가능");
					continue;
				}
				System.out.println("--------------------");
				System.out.println("여러건조회");
				System.out.println("--------------------");
				List<MemberDTO> mlist = mdao.selectlist();
				for (MemberDTO mdto : mlist) {
					System.out.println("아이디: "+mdto.getUserid()+" 비밀번호:"+mdto.getPasswd()+" 출생연도: "+mdto.getBirthyear()+" 갱신연도 "+mdto.getRegdate());
				}
				
			}else if(no==4) {//한건조회
				if(!logincheck) {
					System.out.println("로그인후 사용가능");
					continue;
				}
				System.out.println("--------------------");
				System.out.println("여러건조회");
				System.out.println("--------------------");
				List<MemberDTO> mlist = mdao.selectlist();
				for (MemberDTO mdto : mlist) {
					System.out.print(" 아이디: "+ mdto.getUserid());
				}
				System.out.println("");
				System.out.print("어떤 회원을 조회하시겠습니까?");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println("아이디: "+mdto.getUserid()+" 비밀번호:"+mdto.getPasswd()+" 출생연도: "+mdto.getBirthyear()+" 갱신연도 "+mdto.getRegdate());
				
			}else if(no==3) {//삭제
				//로그인된 아이디 정보만 삭제가능
				
				if(!logincheck) {
					System.out.println("로그인후 사용가능");
					continue;
				}
				System.out.println("--------------------");
				System.out.println("회원탈퇴");
				System.out.println("--------------------");
				List<MemberDTO> mlist = mdao.selectlist();
				for (MemberDTO mdto : mlist) {
					System.out.print(" 아이디: "+ mdto.getUserid());
				}
				System.out.println("");
				System.out.print("어떤 회원을 삭제하시겠습니까?");
				String userid = sc.next();
				
				if(!login_userid.equals(userid)){
					System.out.println("삭제 권한 없음");
					continue;
				}
				
				
				int cnt = mdao.delete(userid);
				if(cnt>0) {
					System.out.println("삭제되었습니다");
				}else {
					System.out.println("삭제안됨");
				}
				
			}else if(no==2) {//수정
				//로그인 된 아이디 정보만 수정가능
				//기존정보 조회후 수정정보와 같이 전달
				
				
				if(!logincheck) {
					System.out.println("로그인후 사용가능");
					continue;
				}
				System.out.println("--------------------");
				System.out.println("회원수정");
				System.out.println("--------------------");
				List<MemberDTO> mlist = mdao.selectlist();
				for (MemberDTO mdto : mlist) {
					System.out.print(" 아이디: "+ mdto.getUserid());
				}
				
				System.out.println("");
				System.out.print("어떤 회원을 수정하시겠습니까?:");
				String userid = sc.next();
				
				//기존정보 조회후 수정정보와 같이 전달
				MemberDTO mdto = mdao.selectOne(userid);
				String passwd;
				int birthyear;
				
				System.out.print("비밀번호:");
				passwd = sc.next();
				sc.nextLine();
				System.out.print("출생연도:");
				String birthyearS = sc.nextLine();
				 birthyear = 0;//태어난 해를 입력안하면 0으로 기본값
				if(!birthyearS.equals("")) //입력했다면
					birthyear = Integer.parseInt(birthyearS); //문자를 숫자로 변환
					mdto = new MemberDTO(userid,passwd,birthyear);
				int cnt = mdao.update(mdto);
				if(cnt>0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정실패");
				}
				
			}else if(no==1) {//추가
				System.out.println("--------------------");
				System.out.println("회원가입");
				System.out.println("--------------------");
				
				String userid;
				while(true) {
					System.out.println("아이디를 입력해주세요");
					userid = sc.next();
					//아이디 중복 체크
					MemberDTO mdto = mdao.selectOne(userid);
					if(mdto !=null)//데이터가 있다면 
						System.out.println("중복된 아이디입니다.");
					else break;
				}
				
				
				
				System.out.println("비밀번호를 입력해주세요");
				String passwd = sc.next();
				sc.nextLine();
				System.out.println("연도를 입력해주세요");
				String birthyearS = sc.nextLine();
				int birthyear = 0;//태어난 해를 입력안하면 0으로 기본값
				if(!birthyearS.equals("")) //입력했다면
					birthyear = Integer.parseInt(birthyearS);//문자를 숫자로 변환
				
				
				MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
				int cnt = mdao.insert(mdto);
				if(cnt>0) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if (no==0) {
				System.out.println("--------------------");
				System.out.println("로그인");
				System.out.println("--------------------");
				int ercnt = 0;
				while (true) {
					System.out.println("로그인을 시작합니다.");
					System.out.println("우선 아이디를 입력해주세요:");
					String userid =sc.next();
					System.out.println("이제 비밀번호를 입력해주세요:");
					String passwd =sc.next();
					
					MemberDTO mdto = mdao.selectOne(userid);
				
					System.out.println(mdto);
					
					if(mdto==null) {//아이디 일치
						System.out.println("---------------------------");
						System.out.println("아이디가 일치하지 않습니다");
						System.out.println("---------------------------");
						ercnt++;
					}else if(mdto.getPasswd().equals(passwd)){
						System.out.println("---------------------------");
						System.out.println("로그인이 완료되었습니다.");
						System.out.println("---------------------------");
						logincheck = true;
						break;
					}else {
					System.out.println("패스워드가 일치하지 않습니다");
						ercnt++;
					}
					
					if(ercnt == 3 ) {
						System.out.println("회원가입이나 아이디와 패스워드를 확인해주세요");
						break;
					}

				}
			
			}else if(no==9) {
				System.out.println("종료");
				break;
				
			}else {
				System.out.println("잘못된 단어");
				
			}
		
		
		}
		
	}

}







