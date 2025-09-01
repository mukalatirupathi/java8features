package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram", "ravi", "Sam", "Raju");
		names.stream()
		.filter(name->name.startsWith("R"))
		.forEach(System.out::println);
		

	}

}
