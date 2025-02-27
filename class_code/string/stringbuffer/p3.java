class Demo{
	public static void main(String[] s){
		StringBuffer str=new StringBuffer("shashi");
   		System.out.println(str.capacity());
		System.out.println(System.identityHashCode(str));
		str.append("_shriramdnyaneshwarkhade_");
		System.out.println(str.capacity());
		System.out.println(System.identityHashCode(str));
	}
}
