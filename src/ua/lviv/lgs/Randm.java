
public class Randm implements Randomable{	

@Override
	public int rand() {
		int random_number = (int) (Math.random() * 199); 
		 return random_number;
}

}
