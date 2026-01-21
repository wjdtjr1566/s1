package chap05;

import java.util.Scanner;

public class ArrayExam_02 {

	public static void main(String[] args) {
		
		/*
		 * 배열 array
		 * 
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 타입만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다
		 *      index는 0번부터 시작
		 */
		
		// 선언 방법
		int[] a1;	// java 스타일
		int [] a2;
		int a3[];	// c 스타일
		
		// 배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;
		
		/*
		 * 첫번째 [] : int[]
		 * 		int만으로 구성된 배열 변수 타입이다
		 * 두번째 [] : new int[30]
		 * 		배열의 크기. 즉, 한번에 만들 변수의 개수
		 * 세번째 [] : score[0]
		 * 		만들어진 변수 중에서 몇번째인가?
		 * 		index는 0부터 시작한다
		 */
		
		// 배열을 선언하는 첫번째 방법
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
//		score[3] = null;
		
		System.out.println("score[0]: "+ score[0]);
		
		// ArrayIndexOutOfBoundsException: Index 50 out of bounds for length 30
		// 길이가 30이라서 0~29까지 가능한데 50은 범위를 벗어났다
//		score[50] = 2;
		
		String[] str = new String[3];
		System.out.println("str[0]: "+ str[0]);
		System.out.println("score[5]: "+ score[5]);
		
//		int a;
//		System.out.println(a);
		
		// 배열 생성 후 기본값
		// 0, false, null로 초기화 됨
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] {90, 85, 70};
		System.out.println("i1[1]: "+ i1[1]);
		
		// 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[]{90, 85, 70};
		
		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용가능
		// new int[]를 생략할 수 있다
		int[] i3 = {90, 85, 70};
//		i3 = {90, 85, 70};
		
		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];
		
//		for(int i=0; i<=2)
		for(int i=0; i<3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총 합: "+ sum);
		System.out.println("평균: "+ (sum/3.0));
		
		sum = 0;
		System.out.println("배열의 길이: "+ i3.length);
		for(int i=0; i<i3.length; i++) {
			sum = sum + i3[i];
		}
		
		
		// 순차적 연습
		// 5개 변수를 한번에 만들기
		// 즉, 5개 크기의 int 배열 만들기
		int[] a5 = new int[50];
		// 첫번째 변수에 1 넣기
		a5[0] = 1;
		// 두번째 변수에 2 넣기
		a5[1] = 2;
		
		int b0 = 2;
		int b1 = 5;
//		a5 = 3;
		a5[0] = 1;
		
		
		
		// 문제1
		// 첫번째 반복문에서
		//		10개의 변수에 각 1~10 값 담기
		int[] a10 = new int[10];
//		a10[0] = 1;
//		a10[1] = 2;
		
//		int j = 0;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;
		
		for(int i=0; i<10; i++) { // i는 0~9
			a10[i] = i+1;
		}
		
		// 두번째 반복문에서
		//		모든 값을 순서대로 출력
		for(int i=0; i<a10.length; i++) {
			System.out.println(a10[i]);
		}
		
//		a10.length = 4; // 변경 불가
		
		// 혹시 몰라서 출력
		System.out.println("args :"+ args);
		if(args != null) {
			// args의 개수 출력
			System.out.println("args 개수 : "+ args.length);
			// args의 모든 내용 출력
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
		// 문제2
		// 7, 12, 8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 7, 12, 8으로 저장되게 복사
		// 단 b = a 안됨
		
		// 문제3
		// 7, 12, 8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게
		
		// 문제4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1. 배열에서 홀수의 개수 구하기
		// 4-2. 4보다 큰 수의 개수 구하기
		
		// --- 응용(멘탈챙겨) ---
		// 문제5
		/*
		 * 마라톤에 5명의 선수가 참여했음
		 * 선수들은 1번부터 5번까지 등번호가 있음
		 * 대회가 끝났을 때 완주하지 못한 선수를 찾으시오
		 * 완주 목록 {2, 4, 5, 1} 
		 */
		
		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기
		
		System.out.println("--------배열 문제2----------");
		// 문제 7 
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 두번째 큰 수 찾기 
		// 가장 큰수보다 바로 아래에 있는수.. 
		System.out.println("--------문제7----------");
		int [] q7 ={3, 4, 7, 5, 1, 4, 6};
		// num1은 가장 큰수 
		int num1=q7[0];
		 for (int i=0; i<q7.length; i++) {
			 if (q7[i]>num1) {
				 num1=q7[i];
			 }
			 
		 }
		 System.out.println(num1);
		  // 두번쨰로 큰수를 찾아보자 //가장 큰수는 아니지만 그 뒤에 제일 큰거
		 int num2= q7[0];
		 for (int i=0; i<q7.length; i++) {
			 if (q7[i]>num2 && q7[i]<num1) {
				 num2=q7[i];
			 }		
		 }
		 System.out.println(num2);
		 // 세번쨰로 큰수를 찾아보자
		 int num3 =q7[0];
		 for (int i=0; i<q7.length; i++) {
			 if (q7[i]>num3 && q7[i]<num2 &&q7[i]<num1) {
				 num3=q7[i];
			 }
		 }
		 System.out.println(num3);
			 
			System.out.println("--------문제7 끝----------");
		// 문제8 
		// 오른쪽으로 한칸 씩 밀기  
		//왼쪽은 0으로 채우기
		// 예 : 
		// 1라운드 :  {3, 4, 7, 5, 1, 4, 6}
		// 2라운드 :  {0, 3, 4, 7, 5, 1, 4, }
		// 3라운드 :  {0, 0, 3, 4, 7, 5, 1, }
		// 방향은 항상 오른쪽 기준으로 옮겨져야함 
		// ~ q8 length만큼 돌아야함
		// 제일 오른쪽부터 사라지고 그 자리를 0으로 채워야함 
		// i-1  만큼 옆으로 옮겨야한다 ?? 언제 옮겨야하는가. 
		 System.out.println("-------------문제8--------------");
		 int []q8 = {3, 4, 7, 5, 1, 4, 6};
		 for (int i=0; i<q8.length; i++) { // q8 length만큼 라운드 반복 
			 for (int j=q8.length-1; j>0; j--) { // 끝에서부터 q8[6]부터 j가 0보다 클떄까지  j를 하나씩 뺴면서 반복
				  q8[j]=q8[j-1];   // 오른쪽으로 밀기                              
				 
			 }
			 q8[0]=0; // 안쪽 for문이 다 돌면 q8[0]은 0이 되어야함 
			 for (int j=0; j<q8.length; j++) {
				 System.out.print(q8[j]);
			 }
			 System.out.println();
		 }    
		 System.out.println("-------------문제8 끝--------------");
		 
		 
	
		 System.out.println("-------------문제9--------------");
		// 바꾸고싶은곳 드래그해서 ctrl+f로 그부분만 바꿀수도 있음 
		// 문제9 
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 보내기
		// 1라운드 :  {3, 4, 7, 5, 1, 4, 6}
		// 2라운드 :  {6, 3, 4, 7, 5, 1, 4}
		// 3라운드 :  {4, 6, 3, 4, 7, 5, 1}
		 int []q9 = {3, 4, 7, 5, 1, 4, 6};
		 for (int i=0; i<q9.length; i++) { // q8 length만큼 라운드 반복 
			    int a = q9[q9.length-1]; // 마지막값을 저장 
			 for (int j=q9.length-1; j>0; j--) { // 끝에서부터 q9[6]부터 j가 0보다 클떄까지  j를 하나씩 뺴면서 반복
				  q9[j]=q9[j-1];   // 오른쪽으로 밀기                              
				 
			 }
			 q9[0]=a; // 안쪽 for문이 다 돌면 q9[0]이 저장한 마지막값을 가져오도록 
			 for (int j=0; j<q9.length; j++) {
				 System.out.print(q9[j]);
			 }
			 System.out.println();
		 }    
		 System.out.println("-------------문제9 끝--------------");
		 
		 System.out.println("-------------문제10--------------");
		//문제10 
		// 임시 비밀번호 8자리 
		//10-1 : 숫자만
		//10-2 : 소문자만 
		//10-3 : 숫자 2개이상 , 대/소문자 각 1개 이상
		 System.out.println("--------문제10-1------------");
		 int[]q10 = new int [8]; // 8자리의 배열 생성
		 for (int i=0; i<q10.length; i++) { // q10을 반복문을 돌림 
			 int numr =(int)(Math.random()*10) ; //임시비밀번호 0~9 까지 들어가게 설정 
			 q10[i]=numr; // i값을 1~9 까지 랜덤으로 나오게 설정 
		  
		   System.out.print(numr);
		 	 
		 } 
		 System.out.println();
		 System.out.println("----------문제10-2----------");
		 char []q10_2 =new char [8]; // 문자를 담을 수 있는 8자리의 배열 생성
		 for (int i=0; i<q10_2.length; i++) {
			 char abc =(char)((int)(Math.random()*26)+97); // 1~25까지 근데 소문자는 97~122
			  // 문자를 담을 수 있는  char에 랜덤을 썻는데 +97해서 아스키코드 소문자가 나오게 만듦
			 System.out.print(abc);
		 }
		 System.out.println();
		 System.out.println("-----------문제10-3----------");
		//10-3 : 숫자 2개이상 , 대/소문자 각 1개 이상
		 //일단 8자리의 배열을 생성하고, 랜덤값으로 숫자,대문자, 소문자를 담을 수 있게 변수를 각각 설정
		 // 그리고 거기서 숫자는 2개이상, 대/소문자는 각 1개 이상 이라는 조건을 담아 출력. 
		 char []q10_3 = new char [8]; 
		
			q10_3[0] =(char)((int)(Math.random()*26)+65); //0번자리는 대문자
			               // (int)를 썻지만 필요없음
			q10_3[1] =(char)((int)(Math.random()*26)+97); //1번 자리는 항상 소문자만
						   // (int)를 썻지만 필요없음
		  for (int i=2; i<q10_3.length; i++) { //2~마지막자리까지는 숫자
			  q10_3[i]= (char)((int)(Math.random()*10)+48);	//아스키코드가 48번~57번이 숫자0~9  
		  } 
		  
		  for (int i=0; i<q10_3.length; i++) { //출력문 할떄 필요해서
			  System.out.print(q10_3[i]);
		  }
		   System.out.println();
			
		 
			 
//		 for (int i=0; i<q10_3.length; i++) {
//			 char 대문자 =(char)((int)(Math.random()*26)+65);
//			 System.out.print(대문자);
//		 }  
//		 System.out.println();
//		 for (int i=0; i<q10_3.length; i++) {
//			 char 소문자 =(char)((int)(Math.random()*26)+97);
//			 System.out.print(소문자);
//		 }
//		 System.out.println();
//		 for (int i=0; i<q10_3.length; i++) {
//			 int num =(int) (Math.random()*10);
//			 System.out.print(num);
//		 }
//		  System.out.println();
		 
		System.out.println();
		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템 
		// 자리 번호는 1~10번까지 번호의 자리가 있습니다
		// 메뉴 : "1. 예약 2. 모든 좌석 현황 3. 잔여 좌석 0. 종료 
		// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다."
		// 조건2 : 예약이 되어있다면 "이미 예약되었습니다."
//		Scanner scan = new Scanner(System.in);
//		menu = scan.nextInt();
		
		   int[]quz11 =new int [10];
		   System.out.println("1.예약 ,2. 모든 좌석 현황 ,3. 잔여 좌석, 0. 종료");
		    
		   
		   
		   
		// 문제12
		// 로또 번호 6개 배열에 저장 
		// 단 , 중복없이! 
		   System.out.println();
		   System.out.println("-------문제12-------");
		  int[] lot = new int[6]; // 로또 번호 6개 저장

		  for (int i = 0; i < lot.length; i++) { //0부터 lot의 길이만큼 돌기

		      int lotnum = (int)(Math.random() * 45 + 1); //45개의 숫자
		      boolean flag = false; // 중복인거 찾을거야.

		     
		      for (int j = 0; j < i; j++) { //뽑은 숫자와 비교
		          if (lot[j] == lotnum) { // 전과 같으면..
		              flag = true; //찾았다.. 중복..
		              break;  //반복문 종료
		          } 
		      }

		      // 중복이면 다시 뽑기
		      if (flag) {  // 중복이라면.
		          i=i-1; // ++ 한거를 다시 돌려서 원상복구 시키고
		          continue; // 다음 반복으로 바로 가.
		      }

		      // 중복 아니면 저장
		      lot[i] = lotnum;
		  }

		  // 출력
		  for (int i = 0; i < lot.length; i++) {
		      System.out.println(lot[i]);
		  }

	    // 문제13
        // 주차장에 
        // 0: 주차되어있음
        // 1: 비어있음
        /*
         * {
         *         {0, 0, 0, 0},    // 1층
         *         {0, 0, 0, 1},    // 2층
         *         {1, 0, 1, 0},
         *         {1, 0, 1, 1},
         *         {1, 1, 1, 1},
         * }
         */
        // 13-1 : 2층에 주차된 차량 수 출력
        // 13-2 : 전체 남은 자리 수 출력
		  System.out.println("----문제13-1 ------");
	int[][] quz13 ={
                 {0, 0, 0, 1},    // 1층 
                 {0, 0, 0, 1},    // 2층
                 {1, 0, 1, 0},
                 {1, 0, 1, 1},
                 {1, 1, 1, 1},
         };
	int count=0;
		for (int j=0; j<quz13[1].length; j++) { // 각각의 자리들 
			 if (quz13[1][j] ==0) { //2층 주차된 차량 찾기
				 count++;
		}
		}
		System.out.println("2층에 주차대수는: " +count); //반복문 끝나고 출력
	 System.out.println("----문제13-2---");
		int count2=0;
		for (int i=0; i<quz13.length; i++) {
			for (int j=0; j<quz13[i].length; j++) {
				if (quz13[i][j] ==1 ) { 
					count2++;
				}
			}
		}
		System.out.println("전체 남은 자리수: " +count2);
	
		
		
	  
	}
	
	
}
















