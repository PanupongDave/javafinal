class ThreadRunnable implements Runnable{
	public void run(){
		for(int i = 0;i<5;i++)
			System.out.println("Hello Thread" +i );
	}
}

public class HelloRunnable{
	public static void main(String[] args){
		ThreadRunnable s1 = new ThreadRunnable();
		Thread t1 = new Thread(s1);

		t1.start();
	}
}