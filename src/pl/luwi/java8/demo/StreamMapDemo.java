package pl.luwi.java8.demo;

import java.util.stream.Stream;

import pl.luwi.java8.demo.model.User;
import pl.luwi.java8.demo.model.User.Role;

public class StreamMapDemo {
 
	public static void main(String[] args) {
		Stream<User> users = Stream.of(
				new User("Andy", Role.Admin),
				new User("Bob", Role.Editor),
				new User("Chris", Role.Viewer));
		
		Stream<User.Role> roles = users.map(u -> u.getRole());
		
		roles.forEach(r -> System.out.println(r));
	}
}
