class Demo extends Thread{
	public void run(){
		System.out.println(" in Demo run");
		
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo extends Thread{
	public void run(){
		System.out.println("in threadDemo ");
		
		System.out.println(Thread.currentThread().getName());

	}
}
class MyThread {
	public static void main (String []s){
		System.out.println(Thread.currentThread().getName());

		Demo obj1=new Demo();
		obj1.start();

		ThreadDemo obj2= new ThreadDemo();
		obj2.start();

		System.out.println("in main");
	}
	
}
