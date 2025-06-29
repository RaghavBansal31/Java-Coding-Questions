package CodingQuestionsJava;

public class BinarySearch {
	public static int binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] < x) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return - 1;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,21,22,23,24,25,27};
		int result = binarySearch(arr, 27);
		if (result == -1) {
			System.out.println("Value not Found");
		}else {
			System.out.println(result);
		}

	}

}
