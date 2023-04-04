package differentTasks;

public class MyQueueCall {

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();

		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		
		System.out.println(obj.deQueue());
		System.out.println(obj.deQueue());
		System.out.println(obj.deQueue());	
	}	
}
