package sec04.method02;

public class CalcExam {
                              // 여기 ()는 선언
	public static void main(String[] args) {
                     //여기 ()는 실행
		Calc calc=new Calc();
		calc.powerOn();
		
		int a = calc.plus(5, 7);
		System.out.println("a: "+ a);
		
		// 호출할 때 이름과 전달인자를 꼭 맞춰야 실행된다
//		calc.plus();
		
		  /* 
		   * javadoc 주석 
		   * 두 정수를 입력 받아서 
		   * 나누기한 결과를 x/y 
		   * double로 돌려주는 메소드
		   * 단! y가 0일때는 "0으로 나눌 수 없다"고 출력하고
		   *     0으로 돌려줌 
		   */     
		double b =calc.divide(5, 2);
		
		System.out.println("b :"+ b);
		
			
		
		 
		
		
	}

}
