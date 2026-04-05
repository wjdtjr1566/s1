package chap08;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	// 모든 필드는 public static final(상수)dlqslek
	// 그래서 생략 가능
	int MIN_VOLUME = 0;

	public abstract void turnOn();

	// 모든 메소드는 public abstract (추상)메소드 입니다.
	// 그래서 생략 가능
	void turnOff();

	void SetVolume(int vol);

//	void mic(String text) { // 새로운 메소드 추가하면 나머지가 망가짐
//		System.out.println();
//	};

	default void mic(String text) { // default를 추가하면 쓰고 싶은 사람만 오버 라이딩하면 추가할 수 있음
		System.out.println();
	};

}
