package com.makarand.locales;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

@SuppressWarnings("unused")
public class TestLocales {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		// System.out.println(locale);

		Locale locale2 = new Locale("EN");
		// System.out.println(locale2);

		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");

		printProperties(us);
		System.out.println();
		printProperties(france);

	}

	public static void printProperties(Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("open"));
		
		/*Set<String> keys = bundle.keySet();
		keys.stream().map(k ->bundle.getString(k))
		.forEach(System.out::println);*/
	}
}
