package CodingQuestionsJava;

public class prime {

	public static void checkPrime(int value) {
		if(value == 2 || value % 2 != 0) {
			System.out.println("It is Prime");
		}else {
			System.out.println("It is not Prime");
		}
	}
	public static void main(String[] args) {
		int value = 4;
		checkPrime(value);

	}

}
