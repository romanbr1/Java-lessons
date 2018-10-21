package ua.lviv.lgs.task;

public class Person {
private int weight;
private int height;
private String watch;
public Person(int weight, int height, String watch) {
	super();
	this.weight = weight;
	this.height = height;
	this.watch = watch;
}
@Override
public String toString() {
	return "Person weight=" + weight + ", height=" + height + ", watch=" + watch;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getWatch() {
	return watch;
}
public void setWatch(String watch) {
	this.watch = watch;
}
public int compare(Deputy o) {
	// TODO Auto-generated method stub
	return 0;
}

}
