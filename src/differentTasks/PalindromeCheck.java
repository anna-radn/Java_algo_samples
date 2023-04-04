package differentTasks;

public class PalindromeCheck {

	public static void main(String[] args) {
	
		numberPalindromeCheck(323);
		stringPalindromeCheck("Cave");
	}
	public static void numberPalindromeCheck(int num) {
		
		int t=num;
		int r=0;
		int sum=0;
		
		while(num>0) {
			r=num%10; //get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}	
		if(t==sum) {
			System.out.println("palindrome");
		}	
		else {
			System.out.println("not palindrome");
		}		
	}
	public static void stringPalindromeCheck(String word) {
		
		String reverse="";

		for(int i=word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
		}	
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
