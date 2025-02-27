class MyThread extends Thread{
	public void run(){
		System.out.println("in run");
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main (String[]s)throws InterruptedException{
		MyThread obj= new MyThread();
		obj.start();
		obj.join();

		System.out.println(Thread.currentThread());
	}
}
		
