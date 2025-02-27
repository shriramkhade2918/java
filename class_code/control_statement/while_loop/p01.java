class whileDemo{
	public static void main(String []s){
		int x=12345;
		int sum=0;
		while(x!=0){
			int num=x%10;
			sum=sum*10+num;
			x=x/10;
		}
		System.out.println(sum);
	}
}
