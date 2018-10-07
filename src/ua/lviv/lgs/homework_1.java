package ua.lviv.lgs;

public class homework_1 {
public static void main(String[] args) {
	
	boolean a = true;
	char 	b = 'c';
	byte 	c = -12;
	short 	d = 32569;
	int		e = 1000000;
	long	f = 1000000000;
	float   g = 1.56f;
	double 	h = 12456987.258;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	System.out.println("-------------- task2----------------------------");

//	System.out.println("boolean = "+ Boolean.MAX_VALUE);
//	System.out.println("boolean = "+ Boolean.MIN_VALUE); 
// Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE
	System.out.println("max char = "+(int)Character.MAX_VALUE);
	System.out.println("min char = "+(int)Character.MIN_VALUE);
	System.out.println("max byte = "+Byte.MAX_VALUE);
	System.out.println("min byte = "+Byte.MIN_VALUE);
	System.out.println("max short = "+Short.MAX_VALUE);
	System.out.println("min short = "+Short.MIN_VALUE);
	System.out.println("max int = "+Integer.MAX_VALUE);
	System.out.println("min int = "+Integer.MIN_VALUE);
	System.out.println("max long = "+Long.MAX_VALUE);
	System.out.println("min long = "+Long.MIN_VALUE);
	System.out.println("max float = "+Float.MAX_VALUE);
	System.out.println("min float = "+Float.MIN_VALUE);
	System.out.println("max double = "+Double.MAX_VALUE);
	System.out.println("min double = "+Double.MIN_VALUE);


	System.out.println("-------------- task2----------------------------");
	int arr1[] = {12, 212, 56, 57, 58, 42, 256, 0, -45, 99};
	int min=0, max=0;
	for (int i = 0; i < arr1.length; i++) {
	
		if (min>arr1[i]) {
			min=arr1[i];
			}
		if (max<arr1[i]) {
			max=arr1[i];
			}
		
	
	}
	System.out.println("MIN= "+ min+"   MAX= "+max);	

}
}
//first java project on github...
