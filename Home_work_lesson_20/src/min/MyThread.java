package min;

import java.util.Scanner;

public class MyThread extends Thread {

	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		System.out.println("Enter the number of Fibonacci numbers");
		int n = sc.nextInt();

		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		System.out.print("Thread MyThread: ");
		for (int i = 0; i < n; i++) {
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
