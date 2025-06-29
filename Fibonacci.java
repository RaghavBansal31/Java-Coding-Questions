package CodingQuestionsJava;

public class Fibonacci {
	
	public static void fibonacci(int one, int two) {
		int[] numbers = new int[20];
		numbers[0] = 1;
		numbers[1] = 2;
		int a = 0;
		int b = 1;
		for(int i = 2;i<numbers.length;i++) {
			numbers[i] = numbers[a++] + numbers[b++];
		}
		
		for(int i = 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		int one = 1;
		int two = 2;
		fibonacci(one,two);

	}

}
