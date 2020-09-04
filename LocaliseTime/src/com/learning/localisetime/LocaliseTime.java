package com.learning.localisetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaliseTime {

	public static void main(String[] args) {
		Locale ruLocale = new Locale("ru", "RU");
		Locale deLocale = new Locale("de", "DE");
		Locale frLocale = new Locale("fr", "FR");
		Locale cnLocale=new Locale("zh", "CN");

		// DateFormat is an abstract class hence object cannot be created
		// so in order to get it initialized we are invoking getTimeInstance method
		// to deal with time formatting
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, frLocale);

		System.out.println("current date in local format: " + new Date());
		System.out.println("current date in other format: " + dateFormat.format(new Date()));

	}

}
