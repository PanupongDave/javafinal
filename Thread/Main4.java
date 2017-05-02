class Mythread extends Thread{
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println("hello world!");
		}
	}
}

public class Main4{
	public static void main(String[] args){
		Mythread t1 = new Mythread();
		t1.start();
		try{
			t1.join();
		} catch (InterruptedException e){
			System.out.println("ERROR: Thread was interrupted");
		}
		System.out.println("Thread is done!");
	}
}