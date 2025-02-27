import java.util.concurrent.*;
import java.util.*;
class BlockingQueueDemo{
	public static void main(String[]s)throws InterruptedException{

		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);
		
		System.out.println(bQueue);
		bQueue.put(40);
		 
	System.out.println(bQueue);
	ArrayList al=new ArrayList();
	System.out.println("ArrayList:"+al);
	bQueue.drainTo(al);
	System.out.println("ArrayList:"+al);
	System.out.println(bQueue);
	}
}	
		
		

		

