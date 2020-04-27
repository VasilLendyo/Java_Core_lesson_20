package min;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	private Thread thread;

	public RunnableThread() {
		super();
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers");
		int n = sc.nextInt();

		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		System.out.print("Thread Runnable: ");
		for (int i = f.length - 1; i > 0; i--) {
			System.out.print(f[i] + " ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
