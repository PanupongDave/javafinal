import java.util.LinkedList;

class SynchQueue<DataType>{
	public LinkedList<DataType> l;

	SynchQueue(){
		l = new LinkedList<DataType>();
	}

	public synchronized void Add(DataType elem){
		l.addLast(elem);
	}

	public synchronized DataType Remove(){
		if(l.size() > 0){
			return l.removeFirst();
		}
		else{
			return null;
		}
	}

}

class Producer extends Thread{
	SynchQueue<Integer> q;
	int curr;

	Producer(SynchQueue<Integer> q){
		this.q = q;
		curr = 1;
	}

	public void run(){
		for (;;){
			Integer i = new Integer(curr);
			q.Add(i);
			curr++;
		}
	}
}

class Consumer extends Thread{
	SynchQueue<Integer> q;

	Consumer(SynchQueue<Integer> q){
		this.q = q;
	}

	public void run(){
		for(;;){
			Integer i = q.Remove();
			if(i != null){
				System.out.print(i+ " ");
			}
		}
	}
}

public class SynchMainGeneric{
	public static void main(String[] args){
		SynchQueue<Integer> q = new SynchQueue<Integer>();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.start();
		c.start();
	}
}