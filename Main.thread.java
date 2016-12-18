package core.thread;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static ExecutorService service = Executors.newFixedThreadPool(5);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Яку кількість чисел Фібоначі ви хотіли б вивести на екран?");
		int c = sc.nextInt();
		
		new MyThread(c);
		new RunnableThread(100, c);
		
		
		new Thread(()->{
			
		}).start();
		service.shutdown();
	}

}
