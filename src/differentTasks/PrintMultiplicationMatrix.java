package differentTasks;

public class PrintMultiplicationMatrix {

	public static void main(String[] args) {
		
		check();
	}
	public static void check() {
		
		
		int matrix=4;
		
		for(int j=1; j<=matrix; j++) {
			for(int i=1;i<=matrix; i++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}
	
}
