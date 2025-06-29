package CodingQuestionsJava;

public class SecondLargest {
	
	public static void secondLargest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num > highest) {
				secondHighest = highest;
				highest = num;
				
			}else if(num > secondHighest) {
				secondHighest = num;
			}
		}
		
		System.out.println("The Second Highest number is: " + secondHighest);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {10,23,45,42,465,43,234,532,345,42,45,435,67,53,230,34};
		secondLargest(arr);
		

	}

}
