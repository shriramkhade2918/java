class Demo{
	int x=10;
	Demo(){
		this (50);
		System.out.println("1st");
		System.out.println(System.identityHashCode(this.x));
	}
	Demo(int x){
		System.out.println("2nd");
		System.out.println(this.x);
		System.out.println("x="+x);
	}
	public static void main (String []s){
		Demo ob=new Demo();
	}
	
}

		
