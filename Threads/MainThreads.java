
public class MainThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chronometer chronometer1 = new Chronometer("thread1");
		Chronometer chronometer2 = new Chronometer("thread2");
		Chronometer chronometer3 = new Chronometer("thread3");

		chronometer1.start();
		chronometer2.start();
		chronometer3.start();
	}
}
