package sec03._abstract;

public class AnimalExam {

	public static void main(String[] args) {

		
//		 new Animal();
		Animal a = new Dog();
		a.sound();
		Dog dog = (Dog)a;
		
		System.out.println(dog.kind); // 참조타입 기본값 null
//		test(); 쓸려면 animalexam을 new 하던지 
// 		아니면 void test() 앞에 static을 붙이던지 
	}
	
	void test() {
		
	}

}
