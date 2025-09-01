package methodRef;

import java.util.Arrays;
import java.util.List;

public class NonStaticMethRef {
	//by using  non static method ref
	public void printName(String name) {
        System.out.println("Name: " + name);
    }
	
	
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sam", "Ravi");
        
        NonStaticMethRef nonStaticMethRef = new NonStaticMethRef();

        // Using lambda
        names.forEach(name -> nonStaticMethRef.printName(name));
        //using static methRef
        names.forEach(nonStaticMethRef::printName);
    }
}
