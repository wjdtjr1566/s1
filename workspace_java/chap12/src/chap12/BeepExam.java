package chap12;

public class BeepExam {

	public static void main(String[] args) {

		 
		
		Runnable task =  new Task();
		Thread t1 = new Thread(task);
		t1.start();
		
		System.out.println("main"); 
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		Thread t2 = new Thread(task);
		// 익명객체 사용하는 방법 
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Task2   " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
			
		});
		t2.start();
		// thread 
		// 여러 일꾼 고용하는 느낌 비동기일 수 있음 
		// 같은 공유 객체를 바라 보고 있을 때, A가 B의 상태를 변경 시키는 경우가
		// 생길 수도 있음. synchronized 키워드쓰면 기다리게 만들수는 있다.. 
		
	}

}
