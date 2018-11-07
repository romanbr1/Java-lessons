package ua.lviv.lgs.copy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotebookString {
	 String value() default "default";
}
