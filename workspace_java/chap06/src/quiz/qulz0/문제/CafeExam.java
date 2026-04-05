package quiz.qulz0.문제;

import java.util.Scanner;

public class CafeExam {

	public static void main(String[] args) {
		int menu = -1;
		while (menu != 0) {
			System.out.println("메뉴를 고르시오");
			System.out.println("1: 아메키라노, 2. 바닐라라떼, 0: 종료");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("아메리카노 ,3000원 입니다");
			} else if (menu == 2) {
				System.out.println("바닐라라떼, 4000원 입니다");
			} else if (menu==0){
				System.out.println("종료");
			} else {
					System.out.println("다시 입력하세요");
				}
			}
		}
	
}


