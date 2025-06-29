package CodingQuestionsJava;


import java.util.HashSet;
import java.util.Set;

public class duplicates {
	
	public static void checkDuplicates(int[] array) {
		Set<Integer> set = new HashSet<Integer>();
		boolean duplicate = false;
		int count = 0;
		
		for(int num:array) {
			if(!set.add(num)) {
				count = count + 1;
				
				duplicate = true;
				
				
			}else {
				duplicate = false;
				
			}
			
		}
		System.out.println("The duplicate num is: " + count);
		if(duplicate) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

	public static void main(String[] args) {
		
		int[] array = {10,23,45,667,8655,34,31,33,45,45,45,4543,6};
		checkDuplicates(array);
		
		
		

	}

}
