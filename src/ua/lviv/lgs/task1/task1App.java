package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class task1App {
	private static Integer[] array;
	public static void main(String[] args) {
		
		
		int size=50;
		array =new Integer[size];
		for (int i=0;i<size; i++) {
			array[i]=getRandomValueFromRange(1, 999);
		}
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(array));

		System.out.println("After sorting desc");
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		System.out.println("After sorting asc");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		

	
	
	}
	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}
}
