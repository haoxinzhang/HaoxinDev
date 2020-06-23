package Java8Test.Test;

public class JavaThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread Name=" + threadName);
			System.out.println( threadName + " is working");
			
			try {
				Thread.sleep(4000);
			}catch( InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		for( int i=0; i<2; i++ ) {
			Thread thread = new Thread(runnable, "The Thread");
			thread.start();
		}
	}

}
