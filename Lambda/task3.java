package hw22;

public class task3 {

	public static void main(String[] args) {
		Print p = messege -> System.out.println(messege);

		p.print("max float = "+Float.MAX_VALUE);
		p.print("min float = "+Float.MIN_VALUE);
		p.print("max double = "+Double.MAX_VALUE);
		p.print("min double = "+Double.MIN_VALUE);

	}

}
interface Print {
	void print(String msg);
}