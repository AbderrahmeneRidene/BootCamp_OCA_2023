package day6.LesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		
		// version java 8
		/*
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
		*/
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd MMMM YYYY - hh:mm:ss a");
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt.format(fm));
		
		/*
		// of
		LocalDate ld= LocalDate.of(1980,10,10);
		System.out.println(ld);
		
		LocalTime lt= LocalTime.of(15, 54);
		System.out.println(lt);
		
		LocalDateTime ldt= LocalDateTime.of(ld,lt);
		System.out.println(ldt);
		*/
		//2) manipulation
		/*
		LocalDate ld= LocalDate.of(1980,10,10);
		System.out.println(ld);
		// voir la liste des fonction
		/*
		System.out.println(ld.plusYears(2));
		ld = ld.plusYears(2);
		System.out.println(ld);
		*/
		/*
		Period period = Period.of(2, 3, 10);
		ld = ld.plus(period);
		System.out.println(ld);
		*/
		
		//3) Formatting
		
		
		
		//LocalDate ldt = LocalDate.of(1980,10,10);
		//DateTimeFormatter fu = DateTimeFormatter.ofPattern("dd--MM--yyyy");
		System.out.println(ldt.format(fm));
		/*
		DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fu = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ld.format(fu));
		System.out.println(ld.format(fm));
		System.out.println(ld.format(fl));
		System.out.println(ld.format(fs));
		*/
	}

}
