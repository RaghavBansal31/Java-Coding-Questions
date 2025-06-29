package CodingQuestionsJava;

import java.util.ArrayList;
import java.util.List;

public class oddNumbers {

	public static boolean checkOdd(List<Integer> value) {
		return value.parallelStream().anyMatch(x -> x % 2 != 0);
	}
	public static void main(String[] args) {
		
		List<Integer> value  = new ArrayList<Integer>();
		value.add(1);
		value.add(2);
		value.add(24);
		value.add(16);
		value.add(78);
		value.add(44);
		value.add(23);
		value.add(120);
		value.add(8);
		
		System.out.println(checkOdd(value));

	}

}
