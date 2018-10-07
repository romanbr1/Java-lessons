package ua.lviv.lgs.task1;

public class Robot {

	private String name;
	private String works;

	Robot(String name, String works) {
		this.name=name;
		this.works=works;
	}
	Robot(String works) {
		this.works=works;
	}


	public void work() {
		System.out.println("Я "+ name+"- я "+works);
	}

}
