package ua.lviv.lgs.copy;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
public class ConvertDate {

	public static void main(String[] args) throws ParseException {
	Date date = new Date();
	System.out.println(date);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	LocalDate ld = LocalDate.now();
	System.out.println(ld);
	
	LocalDateTime cdt = LocalDateTime.now();
	System.out.println(cdt);
	
	LocalTime lt = LocalTime.now();
	System.out.println(lt);

	
	
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	System.out.println(convertToLocalDateViaInstant(date));
	
	System.out.println(convertToLocalDateTimeViaInstant(date));
	
	System.out.println(convertToLocalTimeViaInstant(date));
	
	
	}
	
	public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	public static LocalTime convertToLocalTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalTime();
	}
	public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}
}
