package com.learning.localisedate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingDate {

	public static void main(String[] args) {

		Locale ruLocale = new Locale("ru", "RU");
		Locale deLocale = new Locale("de", "DE");
		Locale frLocale = new Locale("fr", "FR");
		Locale cnLocale=new Locale("zh", "CN");

		// DateFormat is an abstract class hence object cannot be created
		// so in order to get it initialized we are invoking getDateInstance method
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, ruLocale);

		System.out.println("current date in local format: " + new Date());
		System.out.println("current date in other format: " + dateFormat.format(new Date()));

	}

}
