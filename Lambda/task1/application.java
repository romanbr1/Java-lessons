package hw22.task1;

public class application {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();
	
		Pet pet = message -> System.out.println(message);
	
		pet.print(dog.voice());
		pet.print(cow.voice());
		pet.print(cat.voice());

	}

}

interface Pet {
void print(String msg);
}
