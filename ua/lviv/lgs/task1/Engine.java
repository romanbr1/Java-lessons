package ua.lviv.lgs.task1;

public class Engine {
private int numberOfCylinders;

public int getNumberOfCylinders() {
	return numberOfCylinders;
}

public Engine(int numberOfCylinders) {
	this.numberOfCylinders = numberOfCylinders;
}

@Override
public String toString() {
	return "numberOfCylinders=" + numberOfCylinders + "";
}

}
