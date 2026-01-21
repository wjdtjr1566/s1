package quiz.qulz0.문제;

import java.util.ArrayList;

public class EmpExam {

	public static void main(String[] args) {
//		Emp[] arrList =new Emp[2];  // 이거 다 같은코드
//		arrList[0] = new Emp();
//		arrList[1] = new Emp();
//		emp는 new emp를 담을 수 있음
//		Emp a =new Emp();
//		Emp b =new Emp();
//		Emp[] arrList2 = { new Emp(); ,new Emp()};

		Emp p1 = new Emp(7369, "KING", "사장", 9000, 7300);
		Emp p2 = new Emp(7782, "ALLE", "과장", 7000, 7369);
		Emp p3 = new Emp(7839, "JONE", "대리", 5000, 7782);
		Emp p4 = new Emp(7876, "SCOT", "사원", 3000, 7839);
		Emp p5 = new Emp(7934, "FORD", "사원", 3000, 7876);
		Emp[] pn = { p1, p2, p3, p4, p5 };
		ArrayList<Emp> aa = new ArrayList();
		aa.add(p1);
		aa.add(p2);
		aa.add(p3);
		aa.add(p4);
		aa.add(p5);
//		for(int i=0; i<aa.size(); i++) {
//			System.out.println(aa.get(i));
//		}
//		System.out.print("사번: "+ aa.get(0).name);

		System.out.println("--------문제6---------");
		for (int i = 0; i < pn.length; i++) {
			pn[i].info();
		}
		System.out.println("--------문제6-1---------");
		for (int i = 0; i < pn.length; i++) {
			if (pn[i].sal >= 5000)
				pn[i].info();
		}
		System.out.println("--------문제6-2---------");
		for (int i = 0; i < pn.length; i++) {

		}
	}

}
