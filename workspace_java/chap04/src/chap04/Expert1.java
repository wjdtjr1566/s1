package chap04;

public class Expert1 {

	public static void main(String[] args) {
       
		// 1부터 5까지 출력 
		for (int i =1; i<=5 ; i++) {
			System.out.println(i);
		}
		// 5부터 1까지 출력
		System.out.println();
		for (int i =5; i>=1 ; i--) {
			System.out.println(i);
		}
		
		// 1부터 16까지 
		// 3의 배수 출력하고
		// 총 몇개인지 출력
		 System.out.println();
		 int count = 0;
		for (int i=1; i<=16 ; i++) { //1부터 16까지 
			if (i%3==0) {           // 3의 배수면 출력해라
				System.out.println(i);
				count++; //갯수를 세기
			}
			
			 
		 }
		 System.out.println("개수는"+ count); // for문이 반복을 다하면 개수가 보이게
	}

}
