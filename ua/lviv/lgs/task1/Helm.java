package ua.lviv.lgs.task1;

public class Helm {
private int diametr;
private String material;

public int getDiametr() {
	return diametr;
}
public String getMaterial() {
	return material;
}
@Override
public String toString() {
	return "diametr=" + diametr + ", material=" + material + "";
}
public Helm(int diametr, String material) {
	super();
	this.diametr = diametr;
	this.material = material;
}

}
