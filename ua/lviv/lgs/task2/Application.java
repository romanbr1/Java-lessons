package ua.lviv.lgs.task2;

public class Application {

	public static void main(String[] args) throws MyException, IllegalArgumentException, ArithmeticException {
		Methods a = new Methods();

		try {
			System.out.println(a.plus(-6, -3));

		} catch (MyException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
		try {
			System.out.println(a.minus(0, 9));

		} catch (MyException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.minus(6, 0));

		} catch (MyException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.minus(0, 0));

		} catch (MyException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println(a.devide(6, 9));

		} catch (MyException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}
