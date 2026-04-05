package quiz.qulz0.문제;

import java.util.ArrayList;

public class Naver {

	// 필드 - 회원목록
	ArrayList<Member> members = new ArrayList<Member>();

	// 기능:회원 가입 받기
	// 필드에 저장한다
	//
	// 메소드명: join
	// 전달인자: Member
	// 리턴타입: 없음
	void join(Member member) {
		this.members.add(member);
	}

	// 로그인
	// 기능 : 회원 목록 전체에서
	// 아이디 , 비번을 &&로 비교해서 둘다 같은걸 찾고
	// 찾으면 결과에 따라 출력 다르게
	// 메소드명 : login
	// 전달인자 : id, password
	// 리턴타입 : 없음
	void login(String id, String pw) {
		
		boolean flag = false;
		for (int i = 0; i < this.members.size(); i++) {
			Member m = this.members.get(i);
			
			if (m.id.equals(id) && m.password.equals(pw)) {
				flag =true; 
				break;
			}
		}
		if (flag ) {
			System.out.println("메인페이지");
		} else {
			System.out.println("다시 로그인해주세요");
		}
	}
}
