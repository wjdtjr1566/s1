package quiz.qulz0.문제;

//1. 생산하려는 커피의 종류를 선택할 수 있게
//2. 커피의 종류에 따라 상세 종류를 선택할 수 있게
//3. 필요한 경우 더 상세한 내용을선택할 수 있게 /필요없을시 생략 가능
//4. 각각 선택할 메뉴 표시에 가격이 정해져 있다면 가격도 같이 표시
//5. 선택한 내용을 확인할 수 있게 출력
//6. 언제나 처음 단계로 돌아갈 수 있는 기능
//7. 언제나 종료할 수 있는 기능 
public class Cafe {
	String name;
	String menu;
	int price;
	int shot;

	Cafe(String name, String menu, int price, int shot) { // 카페 이름 메뉴 가격
		this.name = name;
		this.menu = menu;
		this.price = price;
		this.shot = shot;

	}
	
  

}
