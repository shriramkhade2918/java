public class core2web{
	int var1=10;
	public static void main(String[]s){
		core2web c2w=new core2web();
		System.out.println(++c2w.var1);
	}
}
class main{
	public static void main(String[]s){
		System.out.println("in main");
		core2web c2w=new core2web();
		System.out.println(++c2w.var1);
	}
}

