class core2web{
	int noOfCources=8;
	String courceName="java";

	void disp(){
		System.out.println(noOfCources);
		System.out.println(courceName);

	}
}
class student{
	public static void main(String []s){
		core2web obj=new core2web();
		obj.disp();
	}
}
