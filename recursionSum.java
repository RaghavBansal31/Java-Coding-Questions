package CodingQuestionsJava;

public class recursionSum {
	public static int  sumofTen(int value) {
		if(value > 0) {
			return value + sumofTen(value - 1);
		}
		return 0;
		
	}

	public static void main(String[] args) {
		
		int value = 3;
		System.out.println(sumofTen(value));
		

	}

}
