package ua.lviv.lgs.task23;
import java.util.Random; 
public class coin {
	   public static boolean getRandomBoolean() {
		   Random rand = new Random(); 
//		   return rand.nextBoolean();
		   		   if (rand.nextBoolean())  {
	    	   System.out.println("orel");
	    	   return true;
	       } else {
	    	   System.out.println("reshka");
	    	   return false;}
	      }

}
