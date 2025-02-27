
import java.util.concurrent.*;
import java.util.*;


class producer implements Runnable{
	BlockingQueue bQueue;
	producer(BlockingQueue bQueue){
		this.bQueue=bQueue;

	}
	public void run(){

    	for (int i=1;i<=3;i++){
		try{
			bQueue.put(i);
		}
		catch(InterruptedException ie){

		}
		System.out.println("Produce"+i);
	}

	try{
	    Thread.sleep(3000);
	  }catch(InterruptedException ie){

	  }
	}
}
class consumer implements Runnable{
	BlockingQueue bQueue;
	consumer(BlockingQueue bQueue){
		this.bQueue=bQueue;


	}
	public void run(){
		for(int i=1;i<=3;i++){
			try{
				bQueue.take();
			}catch(InterruptedException ie){

			}
			System.out.println("consume"+i);


	}
	try{
		Thread.sleep(5000);
	}
	catch(InterruptedException ie){
	}
	}
}
class ProducerConsumer{
	public static void main(String[]s){
		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		producer produce=new producer(bQueue);
		consumer consume=new consumer(bQueue);

		Thread pThread=new Thread(produce);
		Thread cThread=new Thread(consume);

		pThread.start();
		cThread.start();
	}
}




