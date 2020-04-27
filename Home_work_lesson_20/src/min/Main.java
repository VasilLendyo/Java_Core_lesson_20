package min;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();

		RunnableThread runnableThread = new RunnableThread();

		ExecutorService executorService = Executors.newFixedThreadPool(20);
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world");
			}
		});
		executorService.shutdown();
	}
}
