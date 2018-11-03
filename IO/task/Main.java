package ua.lviv.lgs.task;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Main {
	public static void main(String[] args) throws Exception, IOException {
		ArrayList<Employee> el = new ArrayList<Employee>();
		File file = new File("Employee.txt");
		
		File file3 = new File("ArrayListEmployee.txt");
		Employee emp = new Employee(01, "Petro", 1000);
		Methods.serializeObject(emp, file);
		System.out.println(Methods.deserealizeObject(file));

		
		System.out.println("2------------------------");
		File file2 = new File("Employee2.txt");
		Employee2 emp2 = new Employee2(01, "petya", 999);
		System.out.println(emp2);
		
		Methods.serializeObject(emp2, file2);
		System.out.println(Methods.deserealizeObject(file2));
		
		
		
		System.out.println("3------------------------");
		for (int i = 0; i < 10; i++) {
			el.add(new Employee(i, "Employee" + i, getRandomValueFromRange(0, 1000)));

		}
		Methods.serializeObject(el, file3);
		System.out.println(Methods.deserealizeObject(file3));
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}
}
