package methodRef;

import java.util.Arrays;
import java.util.List;

public class StaticMethRef {
	//by using static method ref
	public static void printName(String name) {
        System.out.println("Name: " + name);
    }
	
	
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sam", "Ravi");

        // Using lambda
        names.forEach(name-> StaticMethRef.printName(name));
        //using static methRef
        names.forEach(StaticMethRef::printName);
    }
}
