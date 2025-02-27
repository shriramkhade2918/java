class whileDemo{
	public static void main (String[]s){
		int var=1;
		int n=135;
		while(n!=0){
			int num=n%10;
			var=var*num;
			n=n/10;
		}
		System.out.println(var);
	}
}
