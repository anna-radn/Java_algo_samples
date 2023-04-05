package differentTasks;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		generateNumber(35);
		
	}
	public static void generateNumber(int boundaryNumber) {
		Random rnd=new Random();
		Set<Integer> set=new LinkedHashSet<Integer>();
		while (set.size() < boundaryNumber) {
            int num = rnd.nextInt();
            set.add(num);
        }for (int num : set) {
            System.out.println(num);
        }		
	}	
}
