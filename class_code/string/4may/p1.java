class Demo{
	public static void main(String[]s){
		String str1="shashibagal";
		System.out.println(str1.length());
		int len=mystrlen(str1);
		System.out.println(len);
	}
	static int mystrlen(String str){
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			count++;
		}
		return count;
	}


}
