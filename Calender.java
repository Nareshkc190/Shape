package jpt1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
	
	public static void main(String[] args) {
		Calender calender = new Calender();
		GregorianCalendar gCalender = new GregorianCalendar();
		System.out.println(calender);
		
		gCalender.set(Calendar.YEAR, 2018);
		gCalender.set(Calendar.MONTH, 8);
		gCalender.set(Calendar.HOUR, 21);
		gCalender.set(Calendar.MINUTE, 60);
		System.out.println(gCalender.getTime());

		
	}

}
