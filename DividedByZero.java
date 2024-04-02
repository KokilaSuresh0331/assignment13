package assignment13;

public class DividedByZero {
	public static void main(String[] args) {
	int a=10;
	int b=0;
	//System.out.println(a/b);
	try {
	System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println("Dived By Zero Error");
	}
}

}
