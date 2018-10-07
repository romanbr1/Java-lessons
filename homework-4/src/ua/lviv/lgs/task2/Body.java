package ua.lviv.lgs.task2;

public class Body {
	private int width;
	private int lenght;
	@Override
	public String toString() {
		return "Body [width=" + width + ", lenght=" + lenght + "]";
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void changeDimensions(int width, int lenght) {
	this.lenght=lenght;
	this.width=width;
	}
}
