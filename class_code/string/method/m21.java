class Demo{
	public static void main (String []s){
	        String str1="shashi";
		int len =mystrlen(str1);
		System.out.println(len);
	     	
	}
	static int mystrlen(String str){
		char ch[]=str.toCharArray();
		int count =0;
		for(int i=0;i<ch.length;i++){
			count++;
		}
		return count;
	}
}
