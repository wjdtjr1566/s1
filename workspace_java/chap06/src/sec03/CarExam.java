package sec03;

public class CarExam {

	public static void main(String[] args) {

//		new Car(); 에러 생성자가 전달인자를 가지고있어서 전달인자 적어야함
// 		Car c2 =new Car("쉐보레"); 
		
		Car c3 = null;
		try {
			// 생성자가 실행되어야 실제 생성이 된다 
			c3 = new Car();
		} catch(Exception e) {
			System.out.println("new Car()에서 예외 발생");
		}
		System.out.println("c3: "+ c3);
 		
		
	}

}
