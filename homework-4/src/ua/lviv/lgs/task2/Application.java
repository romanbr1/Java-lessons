package ua.lviv.lgs.task2;

public class Application {

	public static void main(String[] args) {
		Wheel wheel=  new Wheel();
		Helm helm = new Helm();
		Body body = new Body();
		
		wheel.setSize(16);
		System.out.println(wheel.getSize());
		wheel.changeSize(2);
		System.out.println(wheel.getSize());
		
		helm.setDiametr(10);
		System.out.println(helm.getDiametr());
		helm.changeHelmDiametr(1.1);
		System.out.println(helm.getDiametr());
		
		body.setLenght(500);
		body.setWidth(180);
		System.out.println(body);
		body.changeDimensions(182, 490);
		
		Vehicle v = new Vehicle("Ford","red","sedan",wheel,helm,body);
		System.out.println(v);
		
		v.setName("Opel");
		System.out.println(v);
		
		
		System.out.println(v.getName());
		v.setName("Mazda");
		System.out.println(v.getName());
		
		System.out.println(v.getColor());
		v.setColor("gold");
		System.out.println(v.getColor());

		System.out.println(v.getType());
		v.setType("hatchback");
		System.out.println(v.getType());
		
		System.out.println(v.getBody());
		v.setBody(184, 505);
		System.out.println(v.getBody());

		
	}

}
