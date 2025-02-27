class Demo{

	private Demo(){
		System.out.println("in Demo constructor");
	}
	void fun(){
		System.out.println("in fun");
	}
	static void run(){
		Demo obj=new Demo();
		obj.fun();

}
}
class Main{
	public static void main(String[]s){
		Demo.run();
	}
}

