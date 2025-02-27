class Demo{
	public static void main(String[]s){
		int x=70;
		int var=0;
		while(x!=0){
			int rem=x%10;
			if(rem==0){
				System.out.print(rem);
			}
			var=var*10+rem;;
			x=x/10;
		}
		System.out.println(var);
	}
}
