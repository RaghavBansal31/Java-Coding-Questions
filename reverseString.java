package CodingQuestionsJava;

public class reverseString {
	
	public void reverse(String value) {
		String result = "";
		char ch;
		for(int i = value.length()-1; i>=0;i--) {
			ch = value.charAt(i);
			result =  result + ch;
			
		}
		System.out.print(result);
	}

	public static void main(String[] args) {
		String value  = "I am a Gabru";
		reverseString obj =  new reverseString();
		obj.reverse(value);

	}

}
