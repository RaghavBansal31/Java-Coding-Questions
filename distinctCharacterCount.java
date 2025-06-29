package CodingQuestionsJava;

import java.util.HashMap;
import java.util.Map;

public class distinctCharacterCount {
	public static void characterCount(String value) {
		
		char[] chars = value.toCharArray();
		
		Map<Character,Integer> charCount = new HashMap<>();
		
		for(char ch: chars) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) +  1);
			}else {
				charCount.put(ch, 1);
			}
			
		}
		
		System.out.println(charCount);
	}

	public static void main(String[] args) {
		String value = "abaababababababsnsdnfnfndsfgngerngggernrrerngynhhnyhfefz";
		characterCount(value);

	}

}
