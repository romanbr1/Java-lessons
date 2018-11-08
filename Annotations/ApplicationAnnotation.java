package ua.lviv.lgs.copy;

import java.io.IOException;

public class ApplicationAnnotation {
	public static void main(String[] args) throws IOException {
		System.out.println();
	
		Notebook.getAnnoatedFiledsAndValuesToFile(Notebook.class);
	}

}
