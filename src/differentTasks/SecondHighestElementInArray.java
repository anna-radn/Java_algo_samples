package differentTasks;

import java.util.Arrays;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
	
		int arr[]= {15,56,23,78,0,94};
		int size=arr.length;
		findSecondLargestNum(arr, size);
		
	}
	
	public static void findSecondLargestNum(int arr[], int size) {
		//array must have at least 2 numbers
		if(size<2) {
			System.out.println("Invalid size");
		}
		//sor array first
		Arrays.sort(arr);
		//then start from second from end of sorted array
		for(int i=size-2;i>=0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.printf("Second largest"+" number in array is %d\n ", arr[i]);
				return;
			}else {
				System.out.printf("There is no second"+" largest number\n");
			}
		}
		
		
		
	}
	
}
