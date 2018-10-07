package ua.lviv.lgs.task2;

public class Vehicle {
	private String name;
	private String color;
	private String type;
	private Wheel wheel;
	private Helm helm;
	private Body body;
	
	public Vehicle(String name,String color,String type, Wheel wheel,Helm helm,Body body) {
	super();
	this.name=name;
	this.color=color;
	this.type=type;
	this.wheel=wheel;
	this.helm=helm;
	this.body=body;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(int width,int lenght) {
		body.setWidth(width);
		body.setLenght(lenght);
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + ", type=" + type + ", wheel=" + wheel + ", helm=" + helm
				+ ", body=" + body + "]";
	}
	
	
}
