package ua.lviv.lgs.task1;



public class Application {

	public static void main(String[] args) {
		
		Robot r = new Robot("Robot","просто працюю");
		r.work();
		CoffeRobot cf = new CoffeRobot("CoffeRobot ","варю каву");
		cf.work();
		RobotDancer rd = new RobotDancer("RobotDancer ","просто танцюю");
		rd.work();
		RobotCoocker rc = new RobotCoocker("RobotCoocker ","просто готую");
		rc.work();
		Robot array [] = {r,cf,rd,rc};
		System.out.println("---print array---");
		for (int i=0; i<array.length;i++) {
			array[i].work();
		}
	}

}
