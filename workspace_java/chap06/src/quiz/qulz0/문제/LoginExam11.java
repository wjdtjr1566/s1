package quiz.qulz0.문제;

public class LoginExam11 {

	public static void main(String[] args) { // 회원 목록 5개
      Login11 g1= new Login11("wjd","a111");
      Login11 g2= new Login11("tjr","a222");
      Login11 g3= new Login11("rkd","a333");
      Login11 g4= new Login11("sks","a444");
      Login11 g5= new Login11("dd2","a555");
      
      Login11 [] members = {g1,g2,g3,g4,g5}; 
      Login11 login= new Login11(members);
      
      boolean result = login.login("wjd","a111");
      
      if (result) {
    	  System.out.println("메인 페이지");
      } else {
    	  
    	  System.out.println("다시 로그인하세요");
		}      
      
	}

}
