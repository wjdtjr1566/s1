package sec02;

public class ChinaExam {

	public static void main(String[] args) {
      
		
		 //객체 생성!!
		China china1 = new China();
		//필드 값 출력
		System.out.println("가게이름 :" + china1.name);
		System.out.println("주소는 :" +china1.address);
		System.out.println("메뉴1번은 : " +china1.menu);
		System.out.println("메뉴2번은 : " +china1.menu2);
	
		
		System.out.println("-----------------");
		// 필드값 바꾸고 출력
		China china2 = new China();
		
		china2.name = "수정반점";
		china2.address ="아산";
		china2.menu= "볶음밥";
		china2.menu2="울면";
		System.out.println("가게이름 :" +china2.name);
		System.out.println("주소는 :" +china2.address);
		System.out.println("메뉴1번은 : " +china2.menu);
		System.out.println("메뉴2번은 : " +china2.menu2);
		
		
			
		
	   
	}

}
	
