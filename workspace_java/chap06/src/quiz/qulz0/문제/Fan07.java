package quiz.qulz0.문제;
		//문제7 
		// 선풍기Fan
		// + 전원 켜는 기능 //+는 메소드
		// + 전원 끄는 기능
		// + 약풍
		// + 강풍
		// + 단, 전원이 켜진 상태에서만 바람이 나옵니다.
		// FanExam 약풍 실행
public class Fan07 { 
	boolean a =false;
	void powerOn() {
		System.out.println("전원을 켭니다");
		a=true;
		   
	}
	void wind() {
		if(a==true) {
			
		System.out.println("약풍");
		}
	}
	void strongWind() {
		if(a==true) {
			
		System.out.println("강풍");
		}
	}
	void powerOff() {
		a=false;
		System.out.println("전원을 끕니다");
	}
	
}
