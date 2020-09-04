package com.learning.localisecurrency;


import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaliseCurrency {

	public static void main(String[] args) {
		Locale ruLocale = new Locale("ru", "RU");
		Locale deLocale = new Locale("de", "DE");
		Locale frLocale = new Locale("fr", "FR");
		Locale cnLocale=new Locale("zh", "CN");

		// NumberFormat is an abstract class hence object cannot be created
		// so in order to get it initialized we are invoking getNumberInstance method
		NumberFormat numberFormat = NumberFormat.getNumberInstance(deLocale);

		System.out.println("currency in other format: " + numberFormat.format(1000000));

	}

}
