package streams;

import java.util.Arrays;
import java.util.List;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers =Arrays.asList(1,2,3,4,8,6);
		long count=numbers.stream()
		.filter(number->number%2==0)
		.count();
		System.out.println(count);
		}

}
