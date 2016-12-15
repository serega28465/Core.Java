package core.lesson;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;



public class Main {
	
	private static ExecutorService service = Executor.newFixedThreadPool();

	public static void main(String[] args) {
		 new Producer(500);
		 new Producer(500);
		 new Producer(500);
		 new Producer(500);
		 new Consumer();
		System.out.println("Done");
		new Thread(())->{
			
		}).start();
		service.shutdown();
	}

}
