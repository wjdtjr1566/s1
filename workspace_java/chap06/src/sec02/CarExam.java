package sec02;

public class CarExam {
	static int a= 10;
	

	public static void main(String[] args) {
        
		// Car클래스를 생성해서 변수에 담기
      Car myCar =new Car();	
      
      System.out.println(myCar.company);
      myCar.company="롤스로이스";
      System.out.println(myCar.company);
	   
      System.out.println(myCar.speed);
      myCar.speed = 170;
      System.out.println(myCar.speed);
      
      Car myCar2 = new Car();
      System.out.println(myCar2.company); 
      
      System.out.println("a: " + a);
      
      // 깜짝 퀴즈 
      // China 클래스 만들기 
      // 필드
      //	name // 가게 이름
      //	address // 주소
      //	menus // 2개 이상의 메뉴를 가지는 메뉴 목록 
      // ChinaExam 
      //	중국집 2개을 생성해서
      // 	1. 필드 값 출력 
      // 	2. 필드값 바꾸고 출력
      
	}

}
