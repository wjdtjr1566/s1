package quiz.qulz0.문제;

public class Tv10 {
	boolean a = false;
	int vol;
	int chel;

	void powerOn() {
		System.out.println("전원을 켭니다");
		a = true;
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
		a = false;
	}

	void volup() {

		if (vol < 10 && a == true) {
			vol++;
			System.out.println(vol);
		} else if (vol == 10) {
			System.out.println("최대 볼륨입니다");
		}

	}

	void voldown() {
		if (vol <= 10 && a == true) {

			vol--;
			System.out.println(vol);
		} else if (vol == 0) {
			System.out.println("볼륨이 0이에요");
		}
	}

	void chel() {
		if (a == true) {

			System.out.println(chel + "번 채널입니다");
		}
	}

	void current() {
		if (a == true) {
			System.out.println("현재상태:전원이 켜져있고" + "볼륨은" + vol + "채널은" + chel);
		} else {
			System.out.println("전원이 꺼져있어요");
		}
	}
}
