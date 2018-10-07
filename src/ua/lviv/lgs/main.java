
public class main {

	public static void main(String[] args) {
		SU27 su27 = new SU27(1200, 1800, 4525,300, "Gray");
		
		System.out.println(su27.toString());
		su27.startEngine();
		
		su27.takeOff();
		
		su27.moveUp();
		su27.moveForward();
		su27.moveBack();
		su27.moveDown();
		
		su27.stels();
		su27.nuclearStrike();
		
		su27.turbo();
		
		su27.moveBack();
		su27.landingPlane();
		
	}

}
