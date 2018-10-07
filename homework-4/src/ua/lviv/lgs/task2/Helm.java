package ua.lviv.lgs.task2;

public class Helm {
	private int diametr;

	@Override
	public String toString() {
		return "Helm [diametr=" + diametr + "]";
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public int changeHelmDiametr(double x) {
		this.diametr=(int) (x*this.diametr);
		System.out.println("helm is changed to "+ x +"x");
		return this.diametr;
	}
	
}
