import java.lang.Thread;
import java.util.Random;

class MinimumFinder{
    private int min;
    private int[] numbers;
    public MinimumFinder(int[] numbers){
        this.numbers = numbers;
        min=Integer.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    public synchronized void setMin(int min) {
        if(this.min>min)
            this.min = min;
    }

    public void findMin(int start,int end){
        for (int i=start;i<end;i++) {
            setMin(numbers[i]);
        }
    }
}

class Parallelthread implements Runnable {
    private MinimumFinder minFinder;
    public Thread t;
    private int start,end;

    public Parallelthread(MinimumFinder minFinder,int start,int end) {
        this.minFinder=minFinder;
        this.start = start;
        this.end = end;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        minFinder.findMin(start,end);
    }
}

public class SynchronizedMultipleThreadMinimum{
    public static void main(String[] args) {
        
        Parallelthread[] T= new Parallelthread[5];
        Random random= new Random();
        int[] numbers= new int[500];

        MinimumFinder minFinder=new MinimumFinder(numbers);
        for (int i=0; i< numbers.length ; i++){
            numbers[i]=random.nextInt();
        }
        
        for (int i=0 ;i<5;i++){
            T[i] = new Parallelthread(minFinder,i*100,(i+1)*100);
        }
        
        for (int i=0 ;i<5;i++){
            try {
                T[i].t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(minFinder.getMin());
    }
}