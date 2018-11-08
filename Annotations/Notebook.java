package ua.lviv.lgs.copy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class Notebook {

	@NotebookString("Noname")
	private String brand;
	@NotebookString("New")
	private String type;
	@NotebookString("XX-00-00")
	private String model;
	@NotebookString("0")
	private int ram;

	public Notebook(String brand, String type, String model, int ram) {
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.ram = ram;
	}
	public Notebook() {
	
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Notebook [brand=" + brand + ", type=" + type + ", model=" + model + ", ram=" + ram + "]";
	}



	public static void getAnnoatedFiledsAndValuesToFile(Class<?> customClass) throws IOException {
		File file = new File("File.txt");
		Field[] fields = customClass.getDeclaredFields();
		String s;
		FileWriter sw = new FileWriter(file, true);

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(NotebookString.class) instanceof NotebookString) {
				System.out.print(field.getName() + " ----->  ");
				System.out.println(" (a) " + field.getAnnotation(NotebookString.class).value());
				s= field.getName() + " ----->";
				s += " (a) " + field.getAnnotation(NotebookString.class).value() + "\n";
				sw.write((String)s);
			}
			
		}sw.close();
	}
}
