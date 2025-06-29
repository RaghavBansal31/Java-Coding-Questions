package CodingQuestionsJava;

public class factorial {
	
	public static int factorialOf(int value) {
		
		if(value > 0) {
			return value * factorialOf(value - 1);
		}
		return 1;
		
		
	}

	public static void main(String[] args) {
	
		int value = 5;
		System.out.println(factorialOf(value));

	}

}
