package chap04;

import java.util.Scanner;

public class BreakExam_05 {

	public static void main(String[] args) {

		int count = 0;
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("주사위: " + num);
			count++;
			if (num == 6) {
				break;
			}

		}
		System.out.println("게임 종료 : 총 :" + count);

		// 총 5명이 순차적으로 주사위를 던져서
		// 각자 6이 나올떄까지. 6이 나오면 다음사람
		for (int i = 1; i <= 5; i++) {
			while (true) {
				int num = (int) (Math.random() * 6) + 1;
				System.out.println(i + "주사위: " + num);

				if (num == 6) {
					break; // while 소속이라서 while 중단
				}

			}
		}

		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번쨰 부터 17번째에 있음.
		int count2 = 0;
		boolean flag = false;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 10; j++) {
				count2++;
				System.out.println(i + "," + j);

				if (count2 >= 17) {
					System.out.println("!!!!!!!!!!!");
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}

		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		// 문제1
		// 은행 atm 만들기
		// 1-1 : 책 184p 처럼 만들기
		// 1-2
		// 예금 : 음수 불가
		// 출금 : 음수 불가 + 잔고초과 불가
		// 메뉴 외 선택 불가

		boolean run = true;
		int 잔고 = 0;
		int 주머니 = 1000000;

//		 Scanner scan = new Scanner(System.in);
//		 int menu = scan.nextInt();
		while (run) {
			System.out.println("------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------");
			Scanner scan = new Scanner(System.in);

			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("선택>" + menu);
				System.out.print("예금액을 입력하세요>");
				int menu1 = scan.nextInt();
				System.out.println("보유 현금은" + (주머니 - menu1) + "원입니다");
				잔고 = 잔고 + menu1;
				주머니 = 주머니 - menu1;
				System.out.println();
				System.out.println("남은 잔고는" + 잔고 + "원입니다");
			} else if (menu == 2) {
				System.out.println("선택>" + menu);
				System.out.print("출금액을 입력하세요>");
				int menu2 = scan.nextInt();
				System.out.println("남은 금액은" + (잔고 - menu2) + "원입니다");
				System.out.println();
			} else if (menu == 3) {
				System.out.println("선택>" + menu);
				System.out.println("잔고는>");

				System.out.println("잔고는" + 잔고 + "원입니다");
			} else if (menu == 4) {
				System.out.println("선택>" + menu);
				System.out.println("프로그램종료>");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}

		}
		
		int menu = -1;
		int 잔고1 = 0;
		do { 
			System.out.println("-------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액조회 | 4. 종료");
			System.out.println("-------------");
			Scanner scan1 = new Scanner(System.in);
			// 메뉴 입력 
			menu = scan1. nextInt();
			
			if (menu==1) {
				System.out.println("입금액: " );
				Scanner scan2 = new Scanner(System.in);
				//메뉴 입력
				int money = scan2.nextInt();
				if (money<0) {
					System.out.println("입금액을 확인해주세요");
				} else {
					잔고1 += money;
				} 
			} else if (menu ==2) {
				System.out.println("출금액 :");
				Scanner scan2 = new Scanner(System.in);
				//메뉴입력
				int money = scan2.nextInt();
				if (money<0) {
					System.out.println("출금액을 확인해주세요");
				} else if (잔고1<money) {
					System.out.println("잔액이 부족합니다");
				} else {
					잔고1 -= money;
				}
			}  else if (menu==3) {
				System.out.println("잔액: " + 잔고1);
			}  else if (menu==4) {
				System.out.println("프로그램 종료");
			}  else {
				System.out.println("다시입력해주세요");
			}
			
			
			
		} while (menu !=4) ;

	}
}
