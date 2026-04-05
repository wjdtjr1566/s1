package 퀴즈들;

public class Login {
	String id;
	String pw;

	Login(String id, String pw) { // 생성자 선언 
		this.id=id;
		this.pw=pw;
	}

	boolean loginCheck(String id1, String pw1) {
		if (id.equals(id1)  && pw.equals(pw1)) {
			return true;
		} else {
			return false;
		}
	}

	void login(String id, String pw) {
		if (loginCheck(id,pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	

}
