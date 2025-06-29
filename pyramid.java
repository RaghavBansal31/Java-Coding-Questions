package CodingQuestionsJava;

public class pyramid {
	public static void pyramidShow(int value) {
		
		for(int i = 0; i < value; i++) {
			for(int j = 0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		pyramidShow(5);
		

	}

}
