package CodingQuestionsJava;

public class Swap {
	
	public static void swap(int a, int b) {
		b = b + a;
		a = b - a;
		b = b - a;
		
		System.out.println("After Swapping" + "a: " + a + "b: " + b);
		
	
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping: " + "a: " + a + "b: " + b);
		swap(a,b);

	}

}
