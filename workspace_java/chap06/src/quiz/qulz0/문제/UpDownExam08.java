package quiz.qulz0.문제;

import java.util.Scanner;

//문제8
//Up/Down 게임
//1~10까지 어떤 정답이 있을 때(random)
//사용자의 입력에 따라(Scanner)
//정답보다 큰 숫자면 Down
//정답보다 작은 숫자면 Up
//정답과 같으면 "정답"

//문제8-1
//총 몇번만에 정답을 맞췄는가
public class UpDownExam08 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 10) + 1;

		System.out.println("숫자를 입력하세요");
         int count =0;
		while (true) {
			Scanner scan = new Scanner(System.in);
			int player = scan.nextInt();
			
			if (player == answer) {
				System.out.println("정답");
				count++;
				break;
			} else if (player > answer) {
				System.out.println("DOWN");
				count++;
			} else {
				System.out.println("UP");
				count++; 
			}

		}
            System.out.println( count+"번 실행되었습니다");
	}
}
