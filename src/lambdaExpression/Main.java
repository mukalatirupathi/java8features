package lambdaExpression;

public class Main {

	public static void main(String[] args) {
		//Car car =new Main();
		
		Car myCar = ()->System.out.println("this is bmw");
		myCar.drive();
	}

}
