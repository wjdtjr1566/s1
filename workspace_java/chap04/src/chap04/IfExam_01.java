package chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {

		int score = 90;

		boolean over90 = score >= 90;
		{
			System.out.println("항상 실행되는 실행 블럭");
		}

		// 만약에
		if (over90) {
			System.out.println("90 이상입니다");
		}

		if (score < 90) {
			System.out.println("90 미만입니다");
		}

		// 정반대일 경우 !를 활용하는 것도 좋다
		if (!(score >= 90)) {
			System.out.println("90 미만입니다");
		}

		if (score >= 90) {
			System.out.println("90 이상입니다");
		} else { // 그렇지 않으면
			System.out.println("90 미만 입니다");
		}
		// else가 있으면 무조건 하나는 실행되는게 보장된다

		if (score >= 90) {
			System.out.println("90이상");
		}
		// *이전과 관계없이 무조건 다시 판단
		if ((score < 100) && (score >= 80)) {
			System.out.println("80~100");
		}

		System.out.println("-------------------");
		if (score >= 90) {
			System.out.println("90이상");

		} else if (score < 100 && score >= 80) {
		} else if (score < 90 && score >= 80) {
		} else if (score >= 80) {
			// 위의 if 는 else if절이 거짓일때만 동작한다
			System.out.println("90미만 80이상");
		} else if (score >= 70) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}

		// 97점이면
		// 90이상
		// 95이상
		// 92점이면
		// 90이상만
		if (score >= 95) {
			System.out.println("90이상");
			System.out.println("95이상");
		} else if (score >= 90) {
			System.out.println("90이상");
		}
		if (score >= 90) {
			System.out.println("90이상");
		}

		// 홀짝
		int x = 3;

		if (x % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");

		}
		// 랜덤
		double random1 = Math.random();
		System.out.println("random1 :" + random1);

		// Math.random()
		// 0 <= Math.random() < 1
		// 0 ~ 0.999999999999999999999

		// 이해하고 만들어가기
		// 1 . 홀짝
		// 두개의 케이스로 만들어 보자
		// 0<= Math.random() * 10 < 10
		// 0~ 9.9999999999999999
		// int로 형변환
		// 0~ 9
		// if ( (Math.random() * 10)% 2 == 0)

		// 0과 1을 구하는 (홀짝)
		// 정교한 방식
		// 0*2 <= Math.random() * 2 < 1*2
		// 0~ 1.999999999999
		// int로 형변환 해서 정수만 남기기
		double rand2 = Math.random(); // 0~ 0.999
		double temp1 = rand2 * 2; // 0 ~ 1.999
		int result = (int) temp1;
		System.out.println("랜덤 홀짝");
		if (result == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// 1~6 까지 구하기 (주사위)
		// 0*6 <= Math.random() * 6 < 1*6
		// 0~ 5.999999999
		// int 로 바꾸고 +1 하면 1~6
//		
//        rand2 = Math.random();
		double temp2 = rand2 * 6; // 0~ 5.999999999
		int result0 = (int) temp2; // 0~ 5
		result = result0 + 1; // 1~6
		System.out.println("주사위 결과 :" + result);

//		 5~ 10 구하기 

		rand2 = Math.random();
		double temp3 = rand2 * 6; // 0~ 5.999999999
		int result2 = (int) temp3; // 0~ 5
		result = result2 + 5; // 5~10
		System.out.println("주사위 결과2 :" + result);

		// 변수로 범위를 잡아서 보편화
		int min = 5;
		int max = 10;
		rand2 = Math.random();
		temp2 = (int) (rand2 * (max - min + 1)) + min;

		// 쉬운 방식 : 큰 수를 나머지로 구하기
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int) temp2;
		result = (result0 % 6) + 1;

		// 로또 번호
		// 1~45까지 6개의 숫자를 랜덤으로 뽑아서 제출 하시오
		// 단 ,중복없이
		int min1 = 1;
		int max2 = 45;
		rand2 = (int) (rand2 * (max - min + 1)) + min;

		System.out.println((int) rand2);

		// Scanner 사용법
//        Scanner scan = new Scanner(System.in);
//         ctrl+ shift + o 누르기 
//         글씨 받기 
//        String input = scan.nextLine()
		// 숫자받기
		// int num =scan.nextInt();
		// 임의의 수를 입력받아
		// 문제1
		// "양수" ,0, "음수" 판단하여 출력
		System.out.println("문제1");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		if (num1 > 0) {
			System.out.println("양수");
		}
		if (num1 == 0) {
			System.out.println("0");
		}
		if (num1 < 0) {
			System.out.println("음수");
		}

		System.out.println("-----------문제1끝-----------");
		// 문제2
		// 홀수인지 짝수인지 판단하여 출력

		System.out.println("문제2");

		Scanner scan2 = new Scanner(System.in);
		int num2 = scan.nextInt();
		if (num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		System.out.println("-----------문제2끝-----------");
		// 문제3
		// 임의의 두 수 x, y 를 받아서
		// 둘 중에 큰 값 출력
		System.out.println("문제3");
		Scanner scan3 = new Scanner(System.in);
		int x1 = scan3.nextInt();
		int y1 = scan3.nextInt();

		if (x1 > y1) {
			System.out.println(x1);
		} else if (y1 > x1) {
			System.out.println(y1);
		} else {
			System.out.println("두개의 값은 같습니다");
		}
		System.out.println("-----------문제3끝-----------");

		// 문제4
		// 임의의 money를 입력 받아서
		// 7000원 이상이면 " 택시타자" 출력
		// 3000~ 7000 사이면 "버스타자" 출력
		// 3000미만이면"걸어가자" 출력
		System.out.println("문제4");
		Scanner scan4 = new Scanner(System.in);
		int num4 = scan.nextInt();
		if (num4 >= 7000) {
			System.out.println("택시타자");
		} else if (num4 >= 3000 && num4 < 7000) {
			System.out.println("버스타자");
		} else {
			System.out.println("걸어가자");
		}
		System.out.println("-----------문제4 끝------------");

		// 문제5
		// '가위', '바위' ,'보' 입력받아서
		// 5-1 컴퓨터는 항상 '바위'만 낸다
		// 5-2 컴퓨터도 random으로
		// '이겼다' , '비겼다' , '졌다' 출력
		System.out.println("문제5");
		Scanner scan5 = new Scanner(System.in);
		String s1 = scan5.nextLine(); // 컴퓨터는 항상 바위만 
		if ("가위".equals(s1)) {
			System.out.println("졌다");
		} else if ("보".equals(s1)) {
			System.out.println("이겼다");
		} else if ("바위".equals(s1)) {
			System.out.println("비겼다");
		} else {
			System.out.println("다시 입력해주세요");
		}

		System.out.println("----문제5-1끝-------");

		System.out.println("문제5-2");
		Scanner scan5_ = new Scanner(System.in); // 스캐너를 선언
		String s1_ = scan5_.nextLine(); // 스캐너에 넣은 글씨 변환
		int s2 = (int) (Math.random() * 3); // 랜덤으로 0-2가 나오게
		// String com1 = "가위"; // 잘못씀
		String com1; // 컴퓨터가 낼 무언가를 선언

		// 컴퓨터가 낼 값을 랜덤으로 뽑고, 조건에 따라서 string 으로 덮어쓰기
		if (s2 == 0) { // s2==0 일떄 s2==1 일떄 s2==2 일떄 낼 값을 덮어썼다.
			com1 = "가위";
			System.out.println("가위");
		} else if (s2 == 1) {
			com1 = "바위";
			System.out.println("바위");
		} else {
			com1 = "보";
			System.out.println("보");
		}
		////////

		///////////////// 
		if (com1.equals(s1)) {
			System.out.println("비겼다");
		} else if (("보".equals(com1)) && ("가위".equals(s1))) // 컴퓨터가 보자기일떄
		{
			System.out.println("이겼다");
		} else if (("바위".equals(com1)) && ("가위".equals(s1))) {
			System.out.println("졌다");
		} else if (("보".equals(com1)) && ("바위".equals(s1))) {
			System.out.println("졌다");
		} else if (("가위".equals(com1)) && ("바위".equals(s1))) {
			System.out.println("이겼다");
		} else if (("가위".equals(com1)) && ("보".equals(s1))) {
			System.out.println("졌다");
		} else if (("바위".equals(com1)) && ("보".equals(s1))) {
			System.out.println("이겼다");
		} else {
			System.out.println("다시입력해주세요");
		}

		// 문제6
		// 임의의 세 수 x,y,z를 받아서
		// z가 x~y 사이에 있는지 (포함) 판단

		Scanner scan6 = new Scanner(System.in);
		int x2_ = scan6.nextInt();
		int y2 = scan6.nextInt();
		int z2 = scan6.nextInt();
		if (z2 >= x2_ && z2 <= y2) {
			System.out.println("포함");
		} else {
			System.out.println("포함하지 않는다");
		}

		// 문제7
		// 月을 입력 받아서
		// 계절 출력
		// 13, -1 등 입력하면 "정확히 입력해주세요" 출력
		System.out.println("문제7");
		Scanner scan7 = new Scanner(System.in);
		int num7 = scan.nextInt();

		if (num7 >= 3 && num7 <= 5) {
			System.out.println("봄입니다");

		} else if (num7 >= 6 && num7 <= 8) {
			System.out.println("여름입니다");

		} else if (num7 >= 9 && num7 <= 11) {
			System.out.println("가을입니다");

		} else if (num7 == 12 || num7 == 2 || num7 == 1) {

			System.out.println("겨울입니다");

		} else {
			System.out.println("정확히 입력해주세요");
		}

		// 문제8
		// 임의의 수를 입력받아서 다음과 같이 출력
		// 예 : 125
		// 입력한 수는 100보다 크고 , 양수이고 , 홀수입니다.
		System.out.println("문제8");
		Scanner scan8 = new Scanner(System.in);
		int num8 = scan.nextInt();
		if (num8 > 100) {
			System.out.println("100보다크고");
		}  else if (num8 == 100) {
			System.out.println("100이고");
		}
		  else {
			System.out.println("100보다 작거나같다");
		}
		if (num8 >= 0) {
			System.out.println("양수이고");
		} else {
			System.out.println("음수이고");
		}

		if (num8 % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수");
		}

		// 문제9
		// 온도를 입력받아서
		// 예 = -3
		// 영하 3도입니다
		// 예 : 5
		// 영상 5도 입니다
		Scanner scan9 = new Scanner(System.in);
		int num9 = scan9.nextInt();

		if (num9 >= 0) {
			System.out.println("영상 " + num9 + "도입니다");
		} else {
			System.out.println("영하 " + num9 + "도입니다");
		}

		// 어려운 문제
		// 문제10
		// 시, 분을 입력 받아서 35분 후의 시 ,분을 출력
		// 3, 51을 입력받으면
		// 4시 26분이 출력 되게

		Scanner scan10 = new Scanner(System.in);
		int 시 = scan10.nextInt();
		int 분 = scan10.nextInt();
		if ((시 >= 0 && 시 < 24) && (분 >= 0 && 분 <= 24)) {
			System.out.println((시) + "시" + (분 + 35) + "분");
		} else if ((시 >= 0 && 시 < 23) && (분 >= 25 && 분 <= 59)) // 24시 ㅁㅁ분 방지
		{
			System.out.println((시 + 1) + "시" + (분 + 35 - 60) + "분");
		} else if ((시 == 23) && (분 >= 25 && 분 <= 59)) {
			System.out.println((시 + 1 - 24) + "시" + (분 + 35 - 60) + "분");
		} else {
			System.out.println("다시 입력해주세요");
		}
		//강사님 문제10번 풀이 // 
//         int h =3 ;
//         int m =50;
//         int after = 30;
//         if ( m+ after >=60) {
//        	 System.out.println((h+1)+ "시" + (m+after-60) + "분" );
//           } else {
//        		 System.out.println((h)+ "시"+ (m+after)+" 분");
//        	 }
//         }
		// 문제11
		// 두자리 숫자를 입력받아서
		// 10의 자리와 1의자리가 같은지 판단
		// 예 : 77 => 같음 , 94 => 다름
		int x2 = scan2.nextInt();

		int x3 = x2 % 10; // 십의자리
		int x4 = x2 / 10; // 일의 자리

		if (x3 == x4) {
			System.out.println("같음");
		} else if (x3 != x4) {
			System.out.println("다름");
		}

		// 문제 12
		// 1~99까지 369 게임
		// 임의의 수를 받아서 369 숫자를 포함하면 "박수" 출력
		// 없으면 그 숫자 그대로 출력
		// 예 : 33 -> 박수 31 -> 박수 , 12 =>12
//        강사님 풀이 
//		num = 31;
//		num_10 = num/10;
//		num_1 = num% 10;
//		if ((num_10 !=0 && num_10 % 3 ==0) 
//			|| (num_1 !=0 && num_1 %3 ==0)) {
//			System.out.println("박수");
//		} else {
//			System.out.println(num);
//		}
		
		// 문제 13
		// 사각형의 한쪽 모서리 : x1 :10 ,y1: 20
		// 반대편 모서리 : x2: 90 y2: 100
		// 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
         
		// 모두 && 일 떄 
		// false를 찾으면 뒤에 연산을 하지않는다.
		
		// 모두 || 일 떄 
		// true를 찾으면 뒤에 연산을 하지 않음 .
	}

}
