class myThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		for (int i=0;i<10;i++){
			System.out.println("in run");
		}
	}
}
class ThreadDemo{
	public static void main (String []s){
		System.out.println(Thread.currentThread());

		myThread obj=new myThread();
		obj.start();


		Thread.currentThread().setName("shriram");
		System.out.println(Thread.currentThread());
	}
}

