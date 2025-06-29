package CodingQuestionsJava;

public class pallindrome {
	public static void pallindrome(String value) {
		 String result = "";
		 for(int i = value.length()-1;i>=0;i--) {
			result = result + value.charAt(i);
		 }
		 System.out.println(value);
		 System.out.println(result);
		 
		 if(value.equals(result)) {
			 System.out.println("It is a Pallindrome");
		 }else {
			 System.out.println("It is not a Pallindrome");
		 }
	}

	public static void main(String[] args) {
		String value  = "civicrt";
		pallindrome(value);

	}

}
