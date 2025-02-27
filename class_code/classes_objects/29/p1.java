class Demo{
	int x=10;
	Demo(){
		System.out.println("in constructor");
	}
	Demo(int x){
		System.out.println("in constructor 2");
	}
	public static void main (String []s){
		Demo obj= new Demo();
	}
}

