package ua.lviv.lgs.task1;

public class House {
	public String address;
private double area;
public int numberOfFlours;
public House(String address, double area, int numberOfFlours) {
	super();
	this.address = address;
	this.area = area;
	this.numberOfFlours = numberOfFlours;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public int getNumberOfFlours() {
	return numberOfFlours;
}
public void setNumberOfFlours(int numberOfFlours) {
	this.numberOfFlours = numberOfFlours;
}
public void myMethod(String address, int...args) {
	for (int i : args) {
		System.out.println(address+"  "+args+" - "+i);
	}
}
public void myMethod(String...args) {
	for (String i : args) {
		System.out.println(args+" - "+i);
	}
}

@Override
public String toString() {
	return "House [address=" + address + ", area=" + area + ", numberOfFlours=" + numberOfFlours + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	long temp;
	temp = Double.doubleToLongBits(area);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + numberOfFlours;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	House other = (House) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
		return false;
	if (numberOfFlours != other.numberOfFlours)
		return false;
	return true;
}




}
