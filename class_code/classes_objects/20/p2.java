class Demo{
	int x=10;
	static int y=20;
	static int z=50;
	void fun1(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	static void fun2(){

//		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class client{
	public static void main(String[]s){
		Demo obj1=new Demo();
		obj1.fun1();
		obj1.fun2();
	}
}

