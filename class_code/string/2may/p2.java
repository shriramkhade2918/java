class Demo{
	public static void main(String[]s){
		String str1="kanha";
		String str2=str1;
		String str3=new String(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

