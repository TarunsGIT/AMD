package in.co.amd;

public class MyThread extends Thread implements Runnable {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread " + i);

			if (i == 2) {

				try {

					Thread.sleep(500000, 250000);
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();

		t1.start();

	}

}
