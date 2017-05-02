class MyThreadA extends Thread{
	public void run(){
		for(;;){
			System.out.println("hello world1");
		}
	}
}

class MythreadB extends Thread{
	public void run(){
		for(;;){
			System.out.println("hello world2");
		}
	}
}

public class Main1{
	public static void main(String[] args){
		MyThreadA t1 = new MyThreadA();
		MythreadB t2 = new MythreadB();
		t1.start();
		t2.start();

	}
}