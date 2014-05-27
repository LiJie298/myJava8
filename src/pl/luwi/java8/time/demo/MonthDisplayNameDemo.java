package pl.luwi.java8.time.demo;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDisplayNameDemo {
	public static void main(String[] args) {
		for (Month month : Month.values()) {
			System.out.printf("%s - %s %n",
					month.getDisplayName(TextStyle.FULL, Locale.ENGLISH),
					month.getDisplayName(TextStyle.FULL, Locale.GERMAN));
		}
	}
}
