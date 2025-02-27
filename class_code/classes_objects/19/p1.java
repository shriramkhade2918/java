class Demo{
	int x=10;
	private int y=20;
	//System.out.println(System.identityHashCode(y));
	static int z=30;
	static int a=35;
	void disp(){
	//	System.out.println(x);
	System.out.println(System.identityHashCode(x));
	//	System.out.println(y);
	System.out.println(System.identityHashCode(y));
	//	System.out.println(z);
	System.out.println(System.identityHashCode(z));
	//	System.out.println(a);
	System.out.println(System.identityHashCode(a));
	}
}
class client{
	public static void main (String[]s){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj1.disp();
		System.out.println("------------------------");
		obj2.disp();
		System.out.println("------------------------");
		obj1.x=100;
		obj2.z=300;
		obj1.disp();
		System.out.println("------------------------");
		obj2.disp();
	}
}
