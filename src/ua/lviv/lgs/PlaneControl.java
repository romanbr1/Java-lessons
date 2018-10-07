
public class PlaneControl{
Randomable randm = new Randm();

	public void moveUp(){
		System.out.println("Літак летить на "+randm.rand()+" вверх");	
	}
	
	void moveDown(){
		System.out.println("Літак летить на "+randm.rand()+" вниз");	
	}

	void moveForward(){
		System.out.println("Літак летить на "+randm.rand()+" вперед");	
	}

	void moveBack(){
		System.out.println("Літак летить на "+randm.rand()+" назад");	
	}
}
