class Demo{
	public static void main(String[]s){
		String str1= "shriram";
		String str2="khade";
		System.out.println(str1+str2);

		String str3=str1+str2;
		String str4="shriramkhade";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
