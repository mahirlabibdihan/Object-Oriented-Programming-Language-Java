// Write complete Java code to compute the summation of 1 to 10000000 by dividing
// the work equally among 10 different threads.
import java.lang.Thread;


class SumThread implements Runnable {
    public Thread t;
    private long sum;
    private int start;
    private int end;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
        this.t = new Thread(this);
        this.t.start();
    }

    public long get() {
        return sum;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}

public class MultipleThreadSum {
    public static void main(String[] args) {
        final int NUMBER_COUNT = 10000000;
        final int THREAD_COUNT = 10;
        final int COUNT_STEP = 10000000 / 10;

        SumThread[] sumThreads = new SumThread[10];

        // Creating threads and storing them in array
        for (int i = 0; i < THREAD_COUNT; i++) {
            sumThreads[i] = new SumThread(i * COUNT_STEP + 1, (i + 1) * COUNT_STEP);
        }

        // Joining all the threads with  main thread
        // wait for other threads to end
        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                sumThreads[i].t.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread Interrupted");
            }
        }


        long sum = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            sum += sumThreads[i].get();
        }

        System.out.println(sum);
    }
}

