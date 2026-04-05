package sec02;

public class ExceptionExam {

	public static void main(String[] args) {

		try {
			System.out.println(1);
			int a = Integer.parseInt("a");
			System.out.println(1.5);
			System.out.println(args[100]); // 예외발생시 catch블럭으로 슈웃~
			System.out.println(2);
//		} catch (Exception e) {
//			System.out.println(3); // try에서 에러가 발생하지 않았으면 실행 X
//			e.printStackTrace(); // 에러 발생 내용 표시(?)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(31);
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(32);
			e.printStackTrace();

			System.out.println(e);
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("무조건 실행");
		}

		System.out.println(4);

	}

	void test() {
		try {
			// 신나게 코딩

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
