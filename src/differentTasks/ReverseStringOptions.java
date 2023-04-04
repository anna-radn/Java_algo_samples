package differentTasks;

public class ReverseStringOptions {

	public static void main(String[] args) {
		
		loopReverse("Berry");
		stringBuilderReverse("Flower");
		
	}
	public static void loopReverse(String word) {
		
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {			
			reverse=reverse+word.charAt(i);
		}	System.out.println(reverse);
	}
	public static void stringBuilderReverse(String word) {

		StringBuilder reverse = new StringBuilder(word).reverse();
		String result = reverse.toString();
		System.out.println(result);
	}
	
}
