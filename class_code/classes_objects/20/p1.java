class Demo{
	static int x=10;
	static int y=20;
	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class client{
	public static void main(String[]s){
		Demo obj1= new Demo();
		obj1.disp();

		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}
}
