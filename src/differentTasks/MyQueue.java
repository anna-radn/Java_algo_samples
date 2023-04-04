package differentTasks;

import java.util.Stack;

public class MyQueue {

	//a queue of 1,2,3, must be sorted as stack so that 3 is on bottom,then 2, then 1 on top
	//for that we first push el-s to Stack s1->1 to bottom, then 2
	
	
	static Stack<Integer> s1 = new Stack<Integer>(); 
    static Stack<Integer> s2 = new Stack<Integer>(); 
  
    static void enQueue(int x) 
    { 
        //push numbers from s1 to s2 
        while (!s1.isEmpty())
        { 
            s2.push(s1.pop());
        } 
  
        // Push item into s1 
        s1.push(x); 
  
        // Push everything back to s1 
        while (!s2.isEmpty()) 
        { 
            s1.push(s2.pop()); 
        } 
    }  
    // Dequeue number from the queue 
    static int deQueue() 
    { 
        // if first stack is empty 
        if (s1.isEmpty()) 
        { 
            System.out.println("Q is Empty"); 
        } 
  
        // Return top number of s1 
        int x = s1.peek(); 
        s1.pop(); 
        return x; 
    }
}
