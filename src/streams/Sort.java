package streams;

import java.util.Arrays;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(5, 1, 3, 2);
	nums.stream()
	.sorted()
	.forEach(System.out::println);
	}
}
