package hw22;

public class task4 {
	public static void main(String[] args) {

		MyFunc0 b0 = Box::new;
		Box capacity0 = b0.param();
		System.out.println(capacity0.getValue());

		MyFunc1 b1 = Box::new;
		Box capacity = b1.param(2);
		System.out.println(capacity.getValue());

		MyFunc2 b2 = Box::new;
		Box capacity2 = b2.param(5, 4);
		System.out.println(capacity2.getValue());

	}

}

interface MyFunc0 {
	Box param();
}

interface MyFunc1 {
	Box param(int x);
}

interface MyFunc2 {
	Box param(int x, int y);
}

class Box {
	private int x;
	private int y;
	private int z;

	Box() {
		x = 1;
		y = 2;
		z = 3;
	}

	Box(int x) {
		this();
		this.x = x;
	}

	Box(int y, int z) {
		this(5);
		this.y = y;
		this.z = z;
	}

	int getValue() {
		return x * y * z;
	}

}