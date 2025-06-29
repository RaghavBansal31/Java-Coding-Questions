package CodingQuestionsJava;

public class PermuteString {
	
	public static String swap(String value, int i, int j) {
		char []ch = value.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return value.valueOf(ch);
		
	}
	
	public static void permute(String value, int l, int r) {
		if(l == r) {
			System.out.println(value);
		}else {
			for(int i = l; i<=r;i++) {
				value = swap(value, l,i);
				permute(value,l+1,r);
				value = swap(value,l,i);
				
			}
		}
		
	}

	public static void main(String[] args) {
		String value = "ABC";
		permute(value,0,value.length()-1);

	}

}
