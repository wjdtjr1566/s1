package sec04.method02;

public class Calc {
       
	//메소드 선언
	void powerOn() {
		int a;
		a=10;
		
		System.out.println("전원을 켭니다");
	}
    
	//잠깐 return 배우고 왔음!
	
	int plus(int x, int y) {
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		int result =x+y;
//		return "sadadada"; 
		return result;
	}  
	
	  /* 
	   * javadoc 주석 
	   * 두 정수를 입력 받아서 
	   * 나누기한 결과를 x/y 
	   * double로 돌려주는 메소드
	   * 단! y가 0일때는 "0으로 나눌 수 없다"고 출력하고
	   *     0으로 돌려줌 
	   *  
	   *  메소드명 : divide 
	   *  전달인자 : int x, int y
	   *  리턴타입: double 
	   *  
	   *  @param int x, int y
	   *  @return double 
	   *  @author wjdtjr1566@naver.com
	   */
	double divide(int x, int y) {
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		if (y==0) { 
			System.out.println("0으로 나눌수 없다");
		  return 0;
		}   else {
			return (double) x /y;      // 위에거가 있던지 밑에거가 있던지
		}
//		double result = (double) x/y;
//		return result;
		
	
		
	}
}
