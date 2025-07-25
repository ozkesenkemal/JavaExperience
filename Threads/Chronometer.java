
public class Chronometer implements Runnable {
	private Thread thread;
	private String threadName;

	public Chronometer(String threadName) {
		this.threadName = threadName;
		System.out.println(threadName + " is being created.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + this.threadName);
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(this.threadName + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.threadName + " break");
			e.printStackTrace();
		} finally {
			System.out.println(this.threadName + ": bitti");
		}
	}
	
	public void start() {
		System.out.println("Thread object is being created");
		
		if(thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}
