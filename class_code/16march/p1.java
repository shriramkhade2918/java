// take nas iput. print whether its prime or not:

class Demo{
	public static void main(String []s){
		int n=6;
		int num=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				num++;
			}
		}
		if(num==2){
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}

	}
}

