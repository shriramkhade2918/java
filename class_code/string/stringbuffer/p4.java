class Demo{
	public static void main (String []s){
		StringBuffer be = new StringBuffer(100);
		be.append("Shriram dnyaneshwar khade");
		System.out.println(be);
		System.out.println(be.capacity());
		be.append("Shriram dnyaneshwar khade.kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		System.out.println(be);
		System.out.println(be.capacity());
	}
}
