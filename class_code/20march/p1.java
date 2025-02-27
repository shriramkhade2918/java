// input number n is not prime:
 

class Demo{
	public static void main(String[]s){
		int n=6;
		int fact=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				fact++;
			}
			if(fact>2){
				break;
			}
		}
		System.out.println(fact);
		if(fact==2){
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime number");
		}
	}
}
