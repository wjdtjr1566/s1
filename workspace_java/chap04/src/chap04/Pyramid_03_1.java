package chap04;

import java.util.Scanner;

public class Pyramid_03_1 {

	public static void main(String[] args) {

		/*
		 * 예시 ___+___ __+++__ _+++++_ +++++++
		 */
		// 1단계
		// +++++
		System.out.println("1단계");
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
		}
		System.out.println();
		System.out.println();
		// 2단계
		// +_+_+_+_+_
		System.out.println("2단계");
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
			System.out.print("_");
		}

		System.out.println();
		System.out.println();

		System.out.println("3단계");
		// 3단계
		// +++++
		// +++++
		// +++++
		for (int a = 1; a <= 3; a++) {
			for (int a1 = 1; a1 <= 5; a1++) {
				System.out.print("+");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 4단계
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555

		System.out.println("4단계");
		for (int a4 = 1; a4 <= 5; a4++) { // 1~5까지 1씩 증가하면서 세로로 적어
			for (int b4 = 1; b4 <= 5; b4++) { // 1~5까지 1씩증가하면서 가로로 적어
				System.out.print(a4);
			}
			System.out.println();
		}
		System.out.println("4단계 끝");
		System.out.println();

		System.out.println("5단계");
		// 5단계
		// 1
		// 22
		// 333
		// 4444
		// 55555
		// 첫번쨰줄 1번
		// 두번쨰줄 2번 ... 5번쨰줄 5번
		for (int a5 = 1; a5 <= 5; a5++) {
			for (int b5 = 1; b5 <= a5; b5++) {
				System.out.print(a5);
			}
			System.out.println();
		}
		System.out.println();

		// 6단계
		// +
		// ++
		// +++
		// ++++
		// +++++
		System.out.println("6단계");
		for (int a6 = 1; a6 <= 5; a6++) {
			for (int b6 = 1; b6 <= a6; b6++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();

		// 7단계
		// 11111
		// 2222
		// 333
		// 44
		// 5
		System.out.println("7단계");
		for (int a7 = 1; a7 <= 5; a7++) {
			for (int b7 = 5; a7 <= b7; b7--) {
				System.out.print(a7);
			}
			System.out.println();
		}
		// 8단계
		// +____
		// ++___
		// +++__
		// ++++_
		// +++++
		System.out.println("8단계");
		for (int a6 = 1; a6 <= 5; a6++) {
			for (int b6 = 1; b6 <= a6; b6++) {
				System.out.print("+");
			}
			for (int b6 = 4; a6 <= b6; b6--) {
				System.out.print("_");
			}

			System.out.println();
		}
		System.out.println();

		// 9단계
		// ____+
		// ___++
		// __+++
		// _++++
		// +++++
		System.out.println("9단계");
		for (int a6 = 1; a6 <= 5; a6++) {
			for (int b6 = 4; b6 >= a6; b6--) {
				System.out.print("_");
			}
			for (int b6 = 1; a6 >= b6; b6++) {
				System.out.print("+");
			}

			System.out.println();
		}
		System.out.println();
		// 10단계
		// ____+
		// ___+++
		// __+++++
		// _+++++++
		// +++++++++
		System.out.println("10단계");
		for (int a6 = 1; a6 <= 5; a6++) {
			for (int b6 = 4; b6 >= a6; b6--) {
				System.out.print("_");
			}
			for (int b6 = 1; a6 >= b6; b6++) {
				System.out.print("+");
			}
			for (int b6 = 2; a6 >= b6; b6++) {
				System.out.print("+");
			}

			System.out.println();
		}

		// 11단계
		// ____+____
		// ___+++___
		// __+++++__
		// _+++++++_
		// +++++++++

		System.out.println("11단계");

		for (int a6 = 1; a6 <= 5; a6++) {
			for (int b6 = 4; b6 >= a6; b6--) {
				System.out.print("_");
			}
			for (int b6 = 1; a6 >= b6; b6++) {
				System.out.print("+");
			}
			for (int b6 = 2; a6 >= b6; b6++) {
				System.out.print("+");
			}
			for (int b6 = 4; b6 >= a6; b6--) {
				System.out.print("_");
			}

			System.out.println();
		}

		// 12단계
		// 입력 받은 줄 수 대로 출력
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();  //줄의 수
		for (int a6 = 1; a6 <=x ; a6++) { // x 값 만큼 줄 출력.
			for (int b6 = 1; b6 <= x-a6; b6++) { // 
				System.out.print("_");
			}
			for (int b6 = 1; b6 <= a6; b6++) {
				System.out.print("+");
			}
			for (int b6 = 1; b6 <= a6-1; b6++) {
				System.out.print("+");
			}
			for (int b6 = 1; b6 <= x-a6; b6++) {
				System.out.print("_");
			}

			System.out.println();
		}

}
}
