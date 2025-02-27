class player{
	int jerNo=0;
	String name= null;
	player(){
		System.out.println("in constructor");
	}
	void info(){
		System.out.println(jerNo+" = "+name);
	}
}
class client {
	public static void main(String[]s){
		player obj1=new player();
		obj1.info();

		player obj2=new player();
		obj2.info();

		player obj3=new player();
		obj3.info();
	}
}


