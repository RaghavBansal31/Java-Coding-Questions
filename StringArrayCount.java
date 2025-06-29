package CodingQuestionsJava;

public class StringArrayCount {
	
	public static void stringcount(String[] value) {
		int length = 0;
		for(String num : value) {
			length  = length + num.length();
		}
		System.out.print(length);
		
	}

	public static void main(String[] args) {
		String[] value = {"ghfjdk","456423","5342dfgt","534ff5r2dtg"};
		stringcount(value);

	}

}
