package assignment13;

public class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

class CustomProgram {
	public static void main(String[] args) {
		try {

			int age = -5;
			if (age < 0) {
				throw new CustomException("Age cannot be negative!");
			}
			System.out.println("Age: " + age);
		} catch (CustomException e) {
			System.out.println("Custom exception caught: " + e.getMessage());
		}
	}
}