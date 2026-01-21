package quiz.qulz0.문제;

import java.util.ArrayList;

public class EmpTable {
	
	// 1. ArrayList
	ArrayList list = new ArrayList();
	// 2. 배열
	
	
	// 추가 메소드 
	// Emp를 전달 받아서 저장한다
	void join(Emp emp) {
		this.list.add(emp);
	}
}
