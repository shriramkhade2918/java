class Demo{
	public static void main(String[]s){
		int x=12345;
		int i=0;
		while(x!=0){
			int num=x%10;
			i=i+num;
			x=x/10;
		}
	}
}
