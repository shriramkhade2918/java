interface core2web{
	void run();
}


class y2023{
	public static void main(String[]s){
	core2web c2w=()->{
		System.out.println("in run");
	};
	c2w.run();
	}
}
