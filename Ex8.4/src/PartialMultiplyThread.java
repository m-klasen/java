
public class PartialMultiplyThread extends Thread{

	public static void main(String[] args) {
		
		try{
			BigMatrix multiply = new BigMatrix(3,3);
			
			MatrixMultiplier thread1 = new MatrixMultiplier(multiply);
			
			Thread th1 = new Thread(thread1);
			
			th1.start();
			
			th1.join();
		}
		
		class MatrixMultiplier implements Runnable {

			public void run() {
				
			}
			
		}
	}

}
