class Demo{
	int x=10;
	Demo(){
		this(10);
		System.out.println("1st");
	}
	Demo(int x){
		System.out.println("2nd");
	}
public static void main(String[]s){
	Demo boj=new Demo();
}
}

