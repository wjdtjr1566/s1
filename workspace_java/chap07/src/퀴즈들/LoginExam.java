package 퀴즈들;

public class LoginExam {

	public static void main(String[] args) {
		NaverLogin naver = new NaverLogin("aasd","ass");
		naver.login("aasd", "ass");
		naver.login("assd","ass");
		
		DaumLogin daum = new DaumLogin("123","1234");
		daum.login("123","1234");
		daum.login("122","122");
		
	
	}

}
