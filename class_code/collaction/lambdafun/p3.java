interface shri{
	void run(int ad);
}
class Demo{
	public static void main(String[]s){
		shri sh=(int cs)->{
			System.out.println("1 parameter");

		};
/*
		shri sh1=()->{
			System.out.println("no parameter");

		};
		shri sh2=()->{
			System.out.println("two parameter");
		};
		*/
		sh.run(10);
		//sh1.run();
		//sh2.run(20,13);

	}
}


