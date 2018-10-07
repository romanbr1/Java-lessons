package ua.lviv.lgs.task3;

public class application {

	public static void main(String[] args) {
		Animal a = new Animal("Собака",25,5);
		System.out.println("Назва тварини = "+a.getName()+", Швидкість тварини = "+a.getSpeed()+", Вік тварини = "+a.getAge()+" років");
		a.setAnimalInfo("Кіт", 20, 4);
		System.out.println("Назва тварини = "+a.getName()+", Швидкість тварини = "+a.getSpeed()+", Вік тварини= "+a.getAge()+" років");
		
	}

}
