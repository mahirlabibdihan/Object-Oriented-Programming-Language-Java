import java.lang.String;
import java.lang.Thread;



public class createThread{
	// We can create threads in two ways
	// 1. By extending the Thread class 
	//    (Need to override the public void run() method)
	// 2. By implementing Runnable Interface
	//	  (Need to implement the public void run() method)
	
	public class ExtendsThread extends 
}
public class ThreadDemo{
	public static void main(String[] args){
		// Main Thread
		Thread t=Thread.currentThread();	// Getting the current thread, in this case which is the main thread
		System.out.println(t);
		t.setName("Main");	 // Changing thread name
		System.out.println(t);
	}
}