
class player{
	int jerNo=0;
	String name= null;
	player(int x,String pname){
		
		
		System.out.println(System.identityHashCode(name));
		jerNo=x;
		name=pname;
		System.out.println("in constructor");
	}
	void info(){
		System.out.println(jerNo+" = "+name);
		System.out.println(System.identityHashCode(name));
		System.out.println("-----------------------------");
	}
}
class client {
	public static void main(String[]s){
		player obj1=new player(18,"virat");
		obj1.info();

		player obj2=new player(7,"MSD");
		obj2.info();

		player obj3=new player(45,"rohit");
		obj3.info();
	}
}
