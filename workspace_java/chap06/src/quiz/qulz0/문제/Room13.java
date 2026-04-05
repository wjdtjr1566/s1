package quiz.qulz0.문제;

// 문제13
// 펜션 예약 관리
// 펜션에는 여러개의 방이 있습니다
// 방에는 
//    최대인원, 반려동물 여부, 바베큐장 여부
// rule: 
// 방은 하루에 한번만 예약 가능 // ?? 
// 1일~10일까지만 예약 받는다
// 지정 날짜로 예약

 // 필드에 최대인원, 반려동물여부 , 바베큐장 여부 만들기 
 // 생성자로 int boolean boolean 주기  
 // 여러개의 방이 있다 -> 배열?  
 // 날짜가 1~10일 사이 인가? ->  
 // 해당 날짜가 이미 예약 됐는가? 예약 됨 / 안 됨  
 // 인원 조건 여부?   
 // 반려동물 여부?   
 // 바베큐장 여부? 


public class Room13 {
	int maxp;
	boolean pet;
	boolean bbq;
	
       boolean[] reserve = new boolean [10]; // 날짜 예약 상태 
	
	Room13(int maxp, boolean pet, boolean bbq) {
		this.maxp = maxp;
		this.pet = pet;
		this.bbq = bbq;
		
		

	}
	
	
//	void process (int day) {   // 날짜 검사 
//		if (day<1 || day>10) {
//			System.out.println("날짜가 1~10일이 아닙니다");
//		} else {
//			System.out.println( day+" 는 예약가능한 날입니다");
//		}
//	}
//	void maxp (int maxp) {
//		if (maxp>10) {
//			System.out.println("최대 인원은 10명까지만 가능합니다");
//		} else {
//			System.out.println( maxp+"명 입니다");
//		}
//	}
	// 반려동물 가능 불가능 
	// 방 바베큐 가능 여부 
	// 날짜 예약 여부 
	// 날짜 예약 가능 여부 -
	
	boolean day (int day) {        //날짜 1~10일 검사 
		if (day>=1 && day<=10) {
			return true;
		} else {
			return false;
		}
	}
	    // 예약 가능 여부 판단 
	
	
	
	
	
}