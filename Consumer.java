package core.lesson;



public class Consumer extends Thread{
	
	
	
	public Consumer(){
		this.setDaemon(true);
		this.start();
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumer" + Singleton.getInstance().getTask());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	
	
}
