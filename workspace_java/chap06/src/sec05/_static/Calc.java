package sec05._static;

import java.util.Scanner;

public class Calc {

	String color;

	// static //
	// 어차피 변수이긴 하다
	// 정적맴버 , 공용변수 , 클래스 변수
	static double pi = 3.14;

	static int price;

	
	
	{
		System.out.println("필드에 있는 실행 블럭");
	}
	
	static {
		System.out.println("필드에 있는 static 실행 블럭");
	}
	


//   price = 100;

	Calc() {
		System.out.println("Calc 생성자 실행");
	}
	
	static void test() {
		System.out.println("잘 된다");
		
	}

}
