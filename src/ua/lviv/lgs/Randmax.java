
public class Randmax implements Randomablemax{

	@Override
	public int randmax(int r) {
			int random_number = (int) (Math.random() * r); 
			 return random_number;
	}

}
