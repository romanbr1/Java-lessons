package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 5);
		r1.getArea();
		r1.getPerimetr();
		
		Rectangle r2=new Rectangle();
		r2.getArea();
		r2.getPerimetr();
		
		Rectangle r3=new Rectangle();
		r3.setLenght(3);
		r3.getArea();
		
		
		Circle c1 = new Circle();
		c1.getArea(10);
		c1.getLenght(12);
	}

}
