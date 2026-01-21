package quiz.qulz0.문제;

public class CafeExam04 {
	public static void main(String[] args) {
	
    Cafe04 c1= new Cafe04("컴포즈",10000); // 전달인자가 2개라서 꼭 맞춰줘야함  
    Cafe04 c2= new Cafe04("빽다방",10000);
    System.out.println("상호: " +c1.name+
    		" 자본금 :"+c1.money +
    		" 메뉴1 :" +c1.menu1 +
    		" 메뉴2 :" +c1.menu2 );
    		
    		
}

}