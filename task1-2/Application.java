package ua.lviv.lgs.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import javax.xml.ws.Holder;


public class Application {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, NoSuchFieldException {
		Class house = House.class;

		// get name of class	
		String simpleName = house.getSimpleName();
		System.out.println("Simple name  =  " + simpleName);
		
		// get Modifier
		int modifier = house.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("Class modifier = " + modifierText + " int = " + modifier);

		// package info
		Package classPackage = house.getPackage();
		System.out.println("Package of current class = " + classPackage);

		// get superclasses
		Class superClass = house.getSuperclass();
		System.out.println("Super class = " + superClass);


		// getConstructor
		Constructor<House>[] HouseConstractor = house.getConstructors();

		for (int i = 0; i < HouseConstractor.length; i++) {
			Constructor<House> constructor = HouseConstractor[i];
			System.out.println("Constractor = " + constructor);
		}

		System.out.println("Constructors size = " + HouseConstractor.length);

		// get param types of constructor
		System.out.println();
		Constructor<House> constructor = HouseConstractor[0];

		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}

		// get Consctuctor by parameters
		System.out.println();
		
		Constructor<House> singleConstructor = house.getConstructor(String.class, double.class, int.class);
		System.out.println("single consctror = " + singleConstructor);
		House newInstanceHouse = singleConstructor.newInstance("Shevchenka 23",1223.56, 4);
		System.out.println("reflection House = " + newInstanceHouse);

		// get Fields
		Field[] fields = house.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println();
		fields = house.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		
		
		//field set
		Field addressField = house.getField("address");
		addressField.set(newInstanceHouse, "S Banderu 22");
		System.out.println("House new age"+ newInstanceHouse);
		
		Field privateAreaField = fields[1];
		privateAreaField.setAccessible(true);
		System.out.println("private Value = "+ privateAreaField.get(newInstanceHouse));
		privateAreaField.set(newInstanceHouse, 1200);
		System.out.println("House new private field"+ newInstanceHouse);
		
		//Methods
		Method [] methods = house.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(i+"   "+method);
		}
		
		methods[4].invoke(newInstanceHouse, 12);
		System.out.println();
		System.out.println(newInstanceHouse);
		
		
	
	}
	

	
}

