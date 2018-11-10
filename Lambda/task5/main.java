package hw22.task5;


public class main {

	public static void main(String[] args) {		
		Amphibia frog = new Frog();
		
		Say say = message -> System.out.println(message);
		
		say.print(frog.eat());
		say.print(frog.sleep());
		say.print(frog.swim());
		say.print(frog.walk());
	}

}
interface Say {
void print(String msg);
}