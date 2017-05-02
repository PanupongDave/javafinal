class SumThread implements Runnable{
	int from; int where; int result;

	public SumThread(int from,int where){
		this.from = from;
		this.where = where;
		result=0;
	}

	public void run(){
		for(int i = from; i<=where ;i++){
			result += i;
		}
	}

	public int getResult(){
		return result;
	}
} 

public class TwoThread{
	public static void main(String[] args){
		int result =0;
		SumThread s1 = new SumThread(0,1000);
		SumThread s2 = new SumThread(1001,10000);

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		try{
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
			result = s1.getResult() + s2.getResult();
		}catch(Exception e){}
		System.out.println("Result = " + result);
	}
}