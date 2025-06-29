package CodingQuestionsJava;

public class removeSpace {
	
	public static void removeSpace(String value) {
		char[] charArray = value.toCharArray();
		StringBuilder result = new StringBuilder();
		for(char ch : charArray) {
			if(ch != ' ') {
				result.append(ch);
				
			}
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		String value = " I am a Gabru";
		removeSpace(value);

	}

}
