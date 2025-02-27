class Demo{
	public static void main (String[]s){
		String str1="shriram";
		String str2=new String("shriram");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	        
		String str3="shriram";
		String str4=new String("shriram");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}
}
