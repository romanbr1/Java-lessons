package hw22.task1;

public class application {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();
	
		Pet dogsay = () -> System.out.println(dog.voice());
		dogsay.print();
		Pet catsay = () -> System.out.println(cat.voice());
		catsay.print();
		Pet cawsay = () -> System.out.println(cow.voice());
		cawsay.print();
	}

}
