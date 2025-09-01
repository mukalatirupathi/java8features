package streams;

import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring", "stream");
		words.stream()
		.map(word->word.toUpperCase())
		.forEach(System.out::println);
	}

}
