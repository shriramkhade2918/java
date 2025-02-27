class Demo{
	void gun(){
		System.out.println("in Demo");
	}
}
class myThread extends Demo implements Runnable{
	public void run(){
		System.out.println("run");
		gun();
	}
}
class ThreadDemo{
	public static void main (String[]s) throws InterruptedException{
		myThread obj =new myThread();
		Thread tr=new Thread(obj);
		tr.start();
		Thread.sleep(200);
		 System.out.println("in main");
	}
}


