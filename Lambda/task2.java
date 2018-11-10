package hw22;

public class task2 {

	public static void main(String[] args) {
	
		MyCoin orelOrReshka= () -> { 
			if (Math.random()*10>5)
			System.out.println("Orel");
			else
			System.out.println("Reshka");
			};
		
		orelOrReshka.test();

	}

}

interface MyCoin{
	void test();
}