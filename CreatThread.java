import java.lang.String;
import java.lang.Thread;
import java.lang.Runnable;

/*
class Thread extends Object implements Runnable{
	public Thread(){
	
	}
	Thread(String name){
	
	}
	public Thread(Runnable target){
	
	}
	Thread(Runnable target, String name){
	
	}
	
	void start(){
	
	}
	
	void join(){
		// Waits for this thread to die.
	}
	void setName(String name){
	
	}
	@Override
	String toString(){
	
	}
	@Override
	public void run() {
		// If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns
	}	
}
*/
public class CreateThread {
	// We can create threads in two ways
	// 1. By extending the Thread class
	//    (Need to override the public void run() method)
	// 2. By implementing Runnable Interface
	//	  (Need to implement the public void run() method)

	public class ExtendsThread extends Thread {
		ExtendsThread() {
			super("Extends Thread"); // Setting Thread's name
			start();
		}

		// This is the entry point for the thread.
		@Override
		public void run() {
			System.out.println("Starting child thread.");

			System.out.println("Exiting child thread.");
		}
	}

	public class ImplementsRunnable1 implements Runnable {
		Thread t;
		ImplementsRunnable1() {
			t=new Thread(this);
			t.start();
		}

		// This is the entry point for the thread.
		public void run() {
			System.out.println("Starting child thread.");

			System.out.println("Exiting child thread.");
		}
	}

	public class ImplementsRunnable2 implements Runnable {
		// This is the entry point for the thread.
		public void run() {
			System.out.println("Starting child thread.");

			System.out.println("Exiting child thread.");
		}
	}

	public void f1(){
		System.out.println("Starting child thread.");

		System.out.println("Exiting child thread.");
	}

	public void f2(){
		System.out.println("Starting child thread.");

		System.out.println("Exiting child thread.");
	}

	public void main(){
				// 1
		new ExtendsThread();

		// 2.1
		new ImplementsRunnable1();

		// 2.2
		Runnable r = new ImplementsRunnable2();
		Thread t3 = new Thread(r);
		t3.start();

		// 2.3
		Thread t4 = new Thread(new Runnable() {
			public void run(){
				System.out.println("Starting child thread.");

				System.out.println("Exiting child thread.");
			}           
        });
        t4.start();

        // 3.1
        CreateThread ct = new CreateThread();
        new Thread(ct::f1, "T1").start();

        // 3.2
        new Thread(CreateThread::f2, "T2").start();
	}
}