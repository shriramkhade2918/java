class Demo implements Runnable{
	public void run(){
		System.out.println(" shri");
	}
}
class my {
	public static void main (String []s){
		Demo obj =new Demo();
		Thread tr= new Thread(obj);
		tr.start();
		System.out.println("main");
	}
}
