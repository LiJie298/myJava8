package pl.luwi.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pl.luwi.java8.demo.model.User;
import pl.luwi.java8.demo.model.User.Role;

public class StreamMapDemo {
 
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("Andy", Role.Admin),
				new User("Bob", Role.Editor),
				new User("Chris", Role.Viewer));
		
		// for loop style
		
		List<Role> roles1 = new ArrayList<>();
		for (User u : users) {
		    roles1.add(u.getRole());
		}
		
		System.out.println(roles1);
		
		// stream style
		
		List<Role> roles2 = users.stream()
		        .map(u -> u.getRole())
		        .collect(Collectors.toList());
		
		System.out.println(roles2);
	}
}
