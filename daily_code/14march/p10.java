class Demo{
	public static void main(String[]s){
		int x=2332;
		int a=2332;
		int var=0;
		while(x!=0){
			var=var*10;
			var=var+x%10;
			x=x/10;
		}
		if(a==var){
			System.out.println("given number is palindromer number");
		}
		else{
			System.out.println("given number is not palindromer number");
		}
	}
}

