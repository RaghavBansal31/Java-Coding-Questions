package CodingQuestionsJava;

import java.util.HashMap;
import java.util.HashSet;

public class practice {
	
	public static void characters(String arr) {
		
		char [] chars = arr.toCharArray();
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c: chars) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			}else {
				charCount.put(c, 1);
			}
		}
		
		System.out.print(charCount);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr = "248585939hffnnfjrjfbnfhfffffff39488hrhfhv8858u3hffu4f83ur8383rffbv4uh85fhvn3493i9rhf84hg58h3dndwjfnuhu4";
		characters(arr);
		

	}

}
