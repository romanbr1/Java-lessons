package ua.lviv.lgs;

public class Circle {
double radius;
double diametr;

public Circle() {
	this.radius = 5;	
	this.diametr = 10;
}


public double getArea(double d) {
	this.diametr=d;
	this.radius = this.diametr/2;
	double area=3.14*radius*radius;
	System.out.println("Circle area with diametr "+this.diametr+" = "+area);
	return area;
}
public double getLenght(double r) {
	this.radius=r;
	double lenght=3.14*2*radius;
	System.out.println("Circle lenght with radius "+this.radius+" = "+lenght);
	return lenght;
}

}
