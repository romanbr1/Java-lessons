package task;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] argv) {

		List<Integer> numlist = new ArrayList<Integer>();
// В List<Integer> можна додати елементи тільки типу Integer, за вийнятком якщо string можна 
//перетворити в int
		numlist.add(new Integer(123));

		numlist.add(new Integer("34")); // виконується метод parseInt, як видно з Exception-а нижче

//      numlist.add(new Integer("45q"));  // помилка компіляції
		
//      Exception in thread "main" java.lang.NumberFormatException: For input string: "45q"
//    	at java.lang.NumberFormatException.forInputString(Unknown Source)
//    	at java.lang.Integer.parseInt(Unknown Source)
//    	at java.lang.Integer.<init>(Unknown Source)
//    	at qwbg.Main.main(Main.java:13)

		System.out.println(numlist);
		// ---> [123, 34]
		System.out.println(numlist.getClass());
		System.out.println(numlist.get(2).getClass());
		System.out.println("12".getClass());
	}
}
