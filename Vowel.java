package CodingQuestionsJava;

public class Vowel {
	
	public static void checkVowel(String value){
		  if(value.matches(".*[aeiou].*")) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		  }
		
	}
	public static void main(String[] args) {
		String value = "ythrk";
		checkVowel(value);

	}

}
