package pl.luwi.java8.demo;

import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {

	public static void main(String[] args) {
        List<String> progLangs = Arrays.asList("c#", "java", "python", "scala");
        
        // old way
        for (String lang : progLangs) {
            if (lang.contains("a")) {
                System.out.println(lang);
            }
        }
        
        System.out.println();
        
        // new way
        progLangs.stream()
                .filter(lang -> lang.contains("a"))
                .forEach(lang -> System.out.println(lang));
	}
	
}
