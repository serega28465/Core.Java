package core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static ExecutorService service = Executors.newFixedThreadPool(5);
	
	public static void main(String[] args) {
		new MyThread();
		new RunnableThread(100);
		
		new Thread(()->{
			
		}).start();
		service.shutdown();
	}

}
