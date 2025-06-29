package CodingQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {
	
	public static void sort(ArrayList<String> country) {
		System.out.println(country);
		country.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(country);
		country.sort(Comparator.naturalOrder());
		System.out.println(country);
		country.sort(Collections.reverseOrder());
		System.out.println(country);
		
	}
	public static void sort2(int[] result) {
		for(int num:result) {
			System.out.print(num + ",");
		}
		System.out.println();
		Arrays.sort(result);
		for(int num:result) {
			System.out.print(num + ",");
		}
		
		
	}

	public static void main(String[] args) {
		ArrayList<String> country = new ArrayList<String>();
		int[] result = {1,2345,7553,4654,43567,452345,786565,35665,53324,786645,367864,56786,53467,64436,88654,56786453,5678763};
		country.add("India");
		country.add("Russia");
		country.add("Turkey");
		country.add("Delhi");
		country.add("China");
		country.add("Tibet");
		country.add("Japan");
		
		sort(country);
		sort2(result);
		

	}

}
