class p3{
	p3(){
		System.out.println("in p3 constructor");
	}
}
class Demo extends p3{
	Demo(){
		System.out.println("in Demo constructor");
	}
}
class client extends Demo{
	client(){
		System.out.println("in  client  constructor");
	}
}
class user{
	public static void main(String[]s){
		client bj=new client();
		System.out.println("in user main");
	}
}

