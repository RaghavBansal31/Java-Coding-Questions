package CodingQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PracticeGabru {
	
	public static void factor(int rows) {
		for(int i=1;i<=rows;i++) {
			
			
			for(int j = rows; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
	    factor(5);
	    
	}

}
