class Demo{
	public static void main(String[]s){
		int n=40585;
		int temp =n;
		int sum=0;
		for(int j=n ;j!=0;j=j/10){
			int rem=j%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
				}
			sum=sum+fact;
		}
		if(temp==sum){
			System.out.println("strong number");
		}
		else{
			System.out.println("not strong number");
		}
	}
}
