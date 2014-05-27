package pl.luwi.java8.time.demo;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekDisplayNameDemo {
	public static void main(String[] args) {
		for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
			System.out.printf("%s - %s %n",
					dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH),
					dayOfWeek.getDisplayName(TextStyle.FULL, Locale.GERMAN));
		}
	}
}
