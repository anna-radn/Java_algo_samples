package differentTasks;

public class SwapVariables {

	public static void main(String[] args) {
		
		swapStringsWithThirdVariable();
		swapStringsWithoutTherdVariable();
		swapNumbersWithThirdVariable();
		swapNumbersWithoutThirdVariable();
		
	}
	public static void swapStringsWithThirdVariable() {
		String s1 = "Hello";
		String s2 = "World";
		String n;
		System.out.println("Before swapping: s1 is"+s1+" and s2 is: "+s2);
		
		n = s1;
		s1 = s2;
		s2 = n;

		System.out.println("After swapping: s1 is "+s1+" and s1 is: "+s2);
	}
	public static void swapStringsWithoutTherdVariable() {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Before swapping s1 is: "+s1+ "and s2 is: "+s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After swapping: s1 is "+s1+" and s2 is: "+s2);
	}
	public static void swapNumbersWithThirdVariable() {
		int num1 = 10;
		int num2 = 20;
		int temp;
		System.out.println("Before swapping: num1 is "+num1+" and num2 is"+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping: num1 is "+ num1+"and num2 is"+num2);
	}
	public static void swapNumbersWithoutThirdVariable() {
		int a = 10;
		int b = 5;

		a = a + b;  // a now becomes 15
		b = a - b;  // b now becomes 10
		a = a - b;  // a now becomes 5

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	
}
