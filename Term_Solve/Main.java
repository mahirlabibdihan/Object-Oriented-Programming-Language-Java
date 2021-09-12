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

		
	}
}

