package ua.lviv.lgs;

public class Rectangle {
	private int lenght;
	private int width;
	
	public Rectangle (int l, int w){
		this.lenght=l;
		this.width=w;
	}
	public Rectangle (){
		this.lenght=5;
		this.width=10;
	}

	public int getArea(){
		int area = lenght*width;
		System.out.println("Rectangle area = "+ area);
		return (area);
	}
	public int getPerimetr(){
		int perimetr = 2*(lenght+width);
		System.out.println("Rectangle perimetr = "+ perimetr);
		return (perimetr);
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
		

}
