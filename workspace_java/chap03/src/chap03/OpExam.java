package chap03;

public class OpExam {

	public static void main(String[] args) {
      
		int x = 10;
		
		x++;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1;
//	
		
		// 나한테 +1 해서 다시 나한테 저장할 때
		// 줄여 쓰는 형태
	    x += 1; // x=x+1과 같은 코드 
	    x++;    // x=x+1과 같은 코드
	            // 단, + 1만 가능
	    x = 10;
	    ++x;
	    System.out.println("++x : "+x);
	    
	    x = 10;
	    x--; 
	    --x;
	    System.out.println("x :"+ x);
	    
	    x = 10; 
	    int z = ++x;
	    System.out.println("z(++x): "+z);
	    System.out.println("x(++x): "+x);
	    
	    x = 10;
	    z = x++;
	    System.out.println("z(x++): "+z);
	    System.out.println("x(x++): "+x);
	    
	    x = 10;
	    System.out.println(("x++: "+ x++) + "x: " + x);
	    
	    x = 10; 
	    // 10+ 12 
	    z = x++ + ++x;
	   //예측 : 21 
	    System.out.println("z: "+ z);
	    
	    x = 1 ;
	    z = x++ - --x * x++ - x--;
	    // z와 x의 출력값 
	    // 예측 z : 1 - 1 * 1 - 2  = -2  예측 x =1 
	    System.out.println("z: "+ z);
	    System.out.println("x: "+ x);
	    
	    // 나누기 할 때 0으로 나누지 않도록 조심! 
	    int b = 10;
//	    int c = b / 0;  
	    double d =7.3;
	    double e = d / 0;
	    System.out.println("d/0 : "+ e); // Infinity
	    
	    //나머지
	    int f = 10 % 3;
	    System.out.println(f);
	    // 특징: 0부터 ~ 나머지 하는 숫자보다 하나 작은 것만 나온다
	    
	    /*
		    *  숫자 149
		    *  -----------
		    *  출력 결과
		    *  "백의 자리 : 1"
		    *  "십의 자리 : 4"
		    *  "일의 자리 : 9"	    
		    */
	    // 나머지 사용해서 문제 다시 풀어보기 
//	     int c = 149;
//	     int c1 = (c%100)/10;
//	     int c2 = c%10;
//	     System.out.println("백의 자리 "+  c/100);
//	     System.out.println("십의 자리 "+  (c1 ));
//	     System.out.println("일의 자리 "+  (c2 ));
//	    
	    System.out.println(0.1);
	    System.out.println(0.1f);
	    System.out.println(0.1 == 0.1f);
	    // 소수점은 근사치로 저장된다
	    // 그나마 같은 타입으로 변환해서 비교하면 수월하다
	    
	    String s1 = "s1";
	    String s2 = "s1";
	    System.out.println(s1.equals(s2) );
	    //글씨는 무조건 equals()로 비교한다 
	    System.out.println("qwqw" .equals(s1));
	    
	    int c1 = 22;
	    int c2 = 4;
	    System.out.println("몫 :" + (c1/c2));
	    System.out.println("나머지 :"+ c1%c2);
	    
	    //문제1 
	    // 난 돈이 10000원 있음
	    // 1. 4500원 짜리 쌍화차를 최대 몇 잔 살 수 있는가
        // 2. 그리고 남는 돈은?	    	
	     int c3 = 10000;
	     int 쌍화차 = 4500;
	     System.out.println("쌍화차를 최대 " + (c3/쌍화차) +" 잔 살 수 있다");
	     System.out.println("남은돈은 :" + (c3%쌍화차) + "원 입니다");
	    
	    //문제2 
	    // 올영에서 꿀홍차가 8000원인데 
	    //15% 세일! 그렇다면 가격은? 
	     int c4 = 8000;
	     double sale = 0.15;
	     System.out.println("할인가격은 :" + (c4 -(c4*sale))+ "원 입니다");
	     
	     //문제3-0 
	     // 1234를 1200으로 만들기
	      int c5 =1234;
//	      System.out.println((c5/100)*100 );
	     
	    //문제3 
	    double v1 = 1000;
	    double v2 = 794;
	    // v1/v2를 소수점 3째 자리 까지만 출력하시오
	    // 오칙연산만 plz 
	  
	    double v3 = (v1/v2) *1000;
	    System.out.println(v3);
	    int v4 = (int)v3; // 1259
	    System.out.println(v4);
//	    double v5 = v4/1000;  double에 int를 담을수 없어서 
	    double v5 = (double)v4/1000;
//	    double v6 = v4/ 1000.0;
	    System.out.println(v5);
//	    System.out.println(v6);
	    
	    //문제4 
	    // 17000원이 있을 때 
	    // 5천원 몇장
	    // 천원 몇장
	    int 돈 = 17000;
	    int 남은돈 =17000%5000;
	    int one = 1000;
	    System.out.println("오천원 갯수:"+ 돈/5000);
	    System.out.println("천원 갯수:" +남은돈/one);
	    
	    
	    
	    int s = 85;
	    String grade = (s > 90) ? "A" : "B"; // 참이면 A 거짓이면 B 출력 
	    System.out.println("grade: " + grade);
	    
	    
	    
	    
	     
	    	
	    
	
	}

}
