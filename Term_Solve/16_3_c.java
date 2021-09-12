import java.util.*;
class ParallellMin implements Runnable {
	private int []numbers;
	private int start, end, min;
	public Thread t;
	public ParallellMin(int []numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
		this.min = Integer.MAX_VALUE;
		this.t = new Thread(this);
		t.start();
	}

	public int getMin() {
		return min;
	}
	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			if(numbers[i]<min) min = numbers[i];
		}
	}
}

class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int []numbers = new int[500];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt();
		}
		ParallellMin[] threads = new ParallellMin[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new ParallellMin(numbers, i * 100, (i + 1) * 100);
		}

		try {
			for (int i = 0; i < 5; i++) {
				threads[i].t.join();
			}
		} catch (InterruptedException e) {
			 System.out.println("Main thread Interrupted");
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, threads[i].getMin());
		}

		System.out.println(min);

		// Arrays.stream(numbers).min().getAsInt()
	}
}


import java.util.Random;

class minimum{
    private int min;
    public minimum(){
        min=Integer.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    public synchronized void setMin(int min) {
        if(this.min>min)
            this.min = min;
    }

    public void FindMin(int[] a){
        for (int i:a) {
            setMin(i);
        }
    }
}

class Parallelthread implements Runnable {
    minimum minimum;
    Thread t;
    private int[] a;

    public Parallelthread(minimum minimum, int[] a) {
        this.minimum=minimum;
        this.a=a;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        minimum.FindMin(a);
    }
}

public class Test{
    public static void main(String[] args) {
        minimum minimum=new minimum();
        Parallelthread[] T= new Parallelthread[5];
        Random random= new Random();
        int[] numbers= new int[500];
        for (int i=0; i< numbers.length ; i++){
            numbers[i]=1000-i;
        }
        int k=0;
        for (int i=0 ;i<5;i++){
            int[] arr = new int[100];
            for (int j=0; j<100; j++ , k++){
                arr[j]=numbers[k];
            }
            T[i]= new Parallelthread(minimum, arr);
        }
        for (int i=0 ;i<5;i++){
            try {
                T[i].t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(minimum.getMin());
    }
}