package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {

		// for문의 기본 형식
//		for (; ;) {
//			
//		}
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
//			for  (int i=1; i<=100; i=i+2 ) { 
			sum = sum + i;
//			sum+= i;       

		}
		System.out.println("1~100까지의 합:" + sum);

		// 깜짝퀴즈
		// 1~10까지 출력

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		// 1+1+1+1+1
		// 1씩 더하는걸 5번 하고싶다.
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);

		// 시작 값
		// 종료 조건
		int sum2 = 0;
		for (int j = 1; j <= 5; j++) {
			sum2 = sum2 + 1;
		}
		System.out.println(sum2);

		// 1~5 까지의 합을 구하기
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;

		sum = 0;
		int k = 1;
		sum = sum + k; // k==1
		k++;
		sum = sum + k; // k==2
		k++;
		sum = sum + k; // k==3

		for (k = 1; k <= 5; k++) {
			sum = sum + k;
		} 
		
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기 Ctrl+c ,v 했을 때 바뀌지 않는 것 찾기
		 * 
		 * 2. 반복되지 않는 것의 2-1. 규칙 (패턴) 찾기 2-2. 변수로 바꿔서 더 이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 값 파악 4. 종료 조건 파악
		 */

		// 깜짝 퀴즈
		// 구구단 2단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
//		 2*1 =2
//		 2*2 =4
//		 2*3 =6
//		 2*4 =8

		int c = 1;

		for (c = 1; c <= 9; c++) {
			System.out.println("2x" + c + "=" + c * 2);

		}

		// 10부터 1까지 출력

		for (int d = 10; d >= 1; d--) {
			System.out.println(d);
		}
		// 10부터 2까지 짝수만 출력

		for (int d = 10; d >= 1; d--) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
		}

		for (int d = 10; d >= 1; d -= 2) {
			System.out.println(d);
		}

		// --- 꼭 풀 수 있어야 함 ---
		// 문제1
		// 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
		// 예) 1:홀수
		// 2:짝수

		System.out.println("문제1");
		for (int xx = 1; xx <= 5; xx++) {
			if (xx % 2 == 0) {
				System.out.println(xx + "짝수");
			} else {
				System.out.println(xx + "홀수");
			}
		}
		System.out.println("------------문제1 끝---------");

		// 문제2
		// 1~100까지 홀수의 합과 개수
		System.out.println("문제2");
		int sum3 = 0;
		int 홀수개수 = 0;
		for (int aa = 1; aa <= 100; aa = aa + 2) {
			sum3 = sum3 + aa;
			홀수개수 = 홀수개수 + 1;
		}
		System.out.println("1~100까지의 홀수의합" + sum3 + "홀수의 개수" + 홀수개수);
//			System.out.println("홀수의 개수" + );
		// 개수 (????)

		System.out.println("----------문제2끝----------");

		// 문제3
		// 1 ~ 입력 받은 수 까지 더하기

//		Scanner scan = new Scanner(System.in);
//		int aaa = scan.nextInt();
//		int sum4 = 0;
//		for (int aa = 1; aa <= aaa; aa = aa + 1) {
//			sum4 = sum4 + aa;
//		}
//		System.out.println(sum4);

		// --- 조금 난이도 있는 ---
		// 문제4
		// 1~10까지 3개씩 옆으로 찍
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 10

		for (int ee = 1; ee <= 10; ee++) {
			System.out.print(ee + " ");
			if (ee % 3 == 00) {
				System.out.println(); // 엔터
			}
		}

		// --- 2중 for문 ---
		// 문제1
		// 구구단 모든 단 출력

		// 2단
//			int dan = 2 ;
//			for (c = 1; c <= 9; c++) {
//				System.out.println("2x" + c + "=" + c * 2);
//
//			}
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.println(dan + "단---");
//
//			for (c = 1; c <= 9; c++) {
//				System.out.printin(dan + "x" + c + "=" + (dan * c));
//			}
//		}

		// 문제2
		// 구구단 단마다 옆 출력
		// 2x1=2 2x2=4 ....
		System.out.println("문제2 시작");
		for (int dan = 2; dan <= 9; dan++) { // dan=2 부터 9까지 1씩 더해서 보여주기
			System.out.println();

			for (c = 1; c <= 9; c++) { // c =1 부터 9까지 1씩 더하면서 보여주기
				System.out.print(dan + " x " + c + " = " + (dan * c) + "\t");
			}
		}

		System.out.println();

		System.out.println("문제3");

		// 문제3
		// 구구단 3단씩 옆으로 출력
		// 2x1 =2 3x1=3 4x1=4
		//
		// 일단 234
//		        567
//		        89  
		for (int dan = 2; dan <= 9; dan = dan + 3) {
			for (c = 1; c <= 9; c++) {

				for (int a = dan; a <= dan + 2 && a <= 9; a++) {
					System.out.print(a + " x " + c + " = " + (a * c) + "\t");
				}
				System.out.println(); // 한 줄 끝
			}
			System.out.println(); // 단 묶음 2 3 4 하고 한줄 띄어쓰기
		}

		// 문제4
		// 주사위 2개를 굴려서
		// 나올 수 있는 모든 조합을 출력.
		// [1,1] ~ [6.6]
		System.out.println("문제4 시작");

		for (int di = 1; di <= 6; di++) {
			for (int dic = 1; dic <= 6; dic++) {
				System.out.println("주사위눈" + "[" + di + ", " + dic + "]");
			}
		}
		System.out.println("---------문제4 끝 --------");

		// 문제5
		// 주사위 2개를 굴려서
		// 합 별로 출력
		// 합2 : [1,1]
		// 합3 : [1,2] [2,1]
		System.out.println("문제5");
		int 합 = 0;
		int dic2 = 0;
		int dice2 = 0;
		for (합 = 2; 합 <= 12; 합++) { // 주사위의 합 2부터 12까지
			System.out.print("합" + 합);
			for (dic2 = 1; dic2 <= 6; dic2++) { // 주사위 하나 1~6까지 나오게

				dice2 = 합 - dic2; // 합이 2일때 , 3일때 등 하나가 나오면 다른하나는 고정되게 설정
				if (dice2 >= 1 && dice2 <= 6) {
					System.out.print("[" + dice2 + "," + dic2 + "]");
				}

			}
			System.out.println();
		}
		System.out.println("-----------문제5 끝-------------");

//				if (di2 + dic2 == 2) {	
//					System.out.print("합이 2");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 3) {	
//					System.out.print("합이 3");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 4) {	
//					System.out.print("합이 4");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 5) {
//					System.out.print("합이 5");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 6) {
//					System.out.print("합이 6");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 7) {	
//					System.out.print("합이 7");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 8) {	
//					System.out.print("합이 8");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 9) {
//					System.out.print("합이 9");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 10) {	
//					System.out.print("합이 10");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 11) {	
//					System.out.print("합이 11");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				if (di2 + dic2 == 12) {	
//					System.out.print("합이 12");
//					System.out.println("[" + di2 + "," + dic2 + "]");
//				} 
//				

//		int a = 3 ;
//		a = a + 4;
//		a += 4;
//		String s = "[1,1]";
//		s += "[2,3]";
//		
//		System.out.println(s);
//		
//		System.out.println(a);
		// 문제6
		// 주사위 2개를 굴려서 나올 조합에서
		// 중복 없이 출력
		// 예 [1,2] [2,1] 중복이라서 [1,2]
		//
		System.out.println("문제6 시작");
		합 = 0;
		dic2 = 0; // 위에서 쓴 변수 초기화
		dice2 = 0;
		for (합 = 2; 합 <= 12; 합++) {
			System.out.print("합" + 합);
			for (dic2 = 1; dic2 <= 6; dic2++) {

				dice2 = 합 - dic2;
				if (dice2 >= 1 && dice2 <= 6 && dice2 >= dic2) {
					System.out.print("[" + dice2 + "," + dic2 + "]");
				}

			}
			System.out.println();
		}
		System.out.println("-----------문제6 끝---------");
		int die1 = 0; // 첫번쨰 주사위
		int die2 = 0; // 두번쨰 주사위
		for (die1 = 1; die1 <= 6; die1++) {
			for (die2 = die1; die2 <= 6; die2++) { // 두 번쨰 값은 첫 번쨰보다 작아질수없다
				if (die2 == 6) {
					System.out.println("[" + die1 + "," + die2 + "]");
				} else {
					System.out.print("[" + die1 + "," + die2 + "]" + "\t");
				}
			}
		}
		
		
		
		
	}
}
