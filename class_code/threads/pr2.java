import java.util.*;
class ThreadDemo extends Thread{
	ThreadDemo(ThreadGroup tr,String str){
	
		super(tr,str);
	
	}
	
	
	
	
	public void run(){
		try{
		Thread.sleep(10000);
		}
		catch(InterruptedException ie){

		}
	
	 	System.out.println(Thread.currentThread());
	}

}
class MyThread {
	public static void main(String[]s) throws InterruptedException  {
		ThreadGroup tr=new ThreadGroup("shri");

			for (int i=0;i<4;i++){
			ThreadDemo obj=new ThreadDemo(tr,"kunal");
			Thread.sleep(10000);
			ThreadDemo obj1=new ThreadDemo(tr,"rahul");
			Thread.sleep(10000);
			ThreadDemo obj2=new ThreadDemo(tr,"keshu");
			//ThreadDemo obj=new ThreadDemo(tr,"kunal");
			obj.start();
			obj1.start();
			obj2.start();
			Thread.sleep(10000);
			}

	}
}




