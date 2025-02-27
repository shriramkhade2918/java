class Home {
	int familymember=10;
	static String  homename="shri ganesh";
	private String hlocation="dahiwadi";
	void disp(){
		System.out.println(familymember);
		System.out.println(homename);
		System.out.println(hlocation);
	}
}
class familymember{
	public static void main (String []s){
		Home hm=new Home();
		hm.disp();
	}
}
