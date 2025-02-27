class Demo{
	public static void main(String[]s){
		String str1="shashi";
		String str2="Bagal";
		System.out.println(str1);
		System.out.println(str2);
		str1.concat(str2);
		System.out.println(str1);
		System.out.println(str2);
  		System.out.println(System.identityHashCode(str1));
  		System.out.println(System.identityHashCode(str2));
  		System.out.println(System.identityHashCode(str1));
  		System.out.println(System.identityHashCode(str1));
	}
}
		
