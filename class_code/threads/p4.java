class demo extends Thread{
	public void run(){
		System.out.println("shri");
		//System.out.println("shri");
	}
}
class MyThread extends Thread{
	public void run (){
		System.out.println("ram");
		demo obj=new demo();
		obj.start();

	}
}
class ThraedDemo{
	public static void main (String[]s){
		System.out.println("in main");
		MyThread obj=new MyThread ();
		obj.start();
	}
}
