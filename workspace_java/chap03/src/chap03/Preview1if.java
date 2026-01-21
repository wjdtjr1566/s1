package chap03;

public class Preview1if {

	public static void main(String[] args) {

	/*
	 * 	1. if문
	 *  2. if-else 문
	 *  3. if-else if -else 문
	 *  4. swich 문
	 *  5. 키워드로 끝내는 핵심 포인트
	 */
		 int score = 93;
		 
		 if(score>= 90) {
			 System.out.println("점수가 90보다 큽니다.");
			 System.out.println("등급은 A입니다");
			
		 }
		    //중괄호가 없으면 if문은 실행문 하나만 인지함 되도록 중괄호 사용해야함
		 {  if(score<90)
			  System.out.println("점수가 90보다 작습니다"); //93이므로 실행되지않는다
		      System.out.println("등급은 B입니다"); 
		 }
		 
		  int score1 =85;
		  
		  if(score1>=90) { 
			  System.out.println("점수가 90보다 큽니다.");
		      System.out.println("등급은 A입니다");
		  } 
		  else { 
			  System.out.println("점수가 90보다 작습니다"); 
		      System.out.println("등급은 B입니다"); 
		  }
	
		  int num = (int) (Math.random()*45) + 1;
		 
		  
		
	
		
		
		
		
	}
	
	

}


