import java.lang.String;
import java.lang.Thread;
import java.lang.Runnable;


// Runnable is a Functional Interface
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

// We can create threads in two ways
// 1. By extending the Thread class
//    (Need to override the public void run() method)
// 2. By implementing Runnable Interface
//	  (Need to implement the public void run() method)

/*
	Runnable	-> 1. Implementing ( public void run();)
		|
		|
	 Thread		-> 2. Extending ( @Override public void run();)
*/


class ExtendsThread extends Thread {
	ExtendsThread() {
		super("Extends Thread"); // Setting Thread's name
		start();
	}

	// This is the entry point for the thread.
	@Override
	public void run() {
		System.out.println("A thread is created by extending Thread class. So that we can Override the run() method in Thread class.");
	}
}

class ImplementsRunnable1 implements Runnable {
	Thread t;
	ImplementsRunnable1() {
		t = new Thread(this);
		t.start();
	}

	// This is the entry point for the thread.
	public void run() {
		System.out.println("A class is created implementing Runnable's method run(). And passing this class to Thread.");
	}
}

class ImplementsRunnable2 implements Runnable {
	// This is the entry point for the thread.
	public void run() {
		System.out.println("A class is created implementing Runnable's method run().");
	}
}
class CreateThread {
	public void f1() {
		System.out.println("Non static run method for Runnable");
	}

	public static void f2() {
		System.out.println("Static run method for Runnable");
	}

	public static void main() {
		// 1: Extending Thread Class
		new ExtendsThread();

		// 2: Implementing Runnable
		// 2.1: 
		new ImplementsRunnable1();

		// 2.2: 
		Runnable r1 = new ImplementsRunnable2();
		Thread t3 = new Thread(r1);
		t3.start();	

		// 3.1: By creating anonymous class
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Implemented run method of anonymous class.");
			}
		});
		t4.start();

		// 3.2: Using Lambda
		Thread t5 = new Thread(()-> {
			System.out.println("Implemented run method of anonymous class with lambda expression.");
		});
		t5.start();

		// 3.3: Non-Static method
		CreateThread ct1 = new CreateThread();
		Thread t6_1 = new Thread(()-> ct1.f1());
		Thread t6_2 = new Thread(ct1::f1);



		// 3.4: Static Methpd
		Thread t7_1 = new Thread(()-> CreateThread.f2());
		Thread t7_2 = new Thread(CreateThread::f2);

	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		// Main Thread
		Thread t = Thread.currentThread();	// Getting the current thread, in this case which is the main thread
		System.out.println(t);
		t.setName("Main");	 // Changing thread name
		System.out.println(t);



		// Create thread in different ways
		CreateThread.main();

        Thread t1 = new Thread(()-> {
			System.out.println("Thread created to join");
			for(int i=0;i<10;i++){
				System.out.println(i);
			}
		});
		t1.start();
        // Join threads with main thread
		try {
            // wait for other threads to end
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        try {
            Thread.sleep(100); // Put current thread to sleep
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println(t1.isAlive());   // Checking thread is finished or not	

        System.out.println("Exiting Main thread");
	}
}