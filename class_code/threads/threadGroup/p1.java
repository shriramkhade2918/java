class MyThread extends Thread{
	MyThread (String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}

}
class ThreadGroupDemo{
	public static void main(String []s){
		MyThread obj=new MyThread("xyz");
		obj.start();
	}
}
