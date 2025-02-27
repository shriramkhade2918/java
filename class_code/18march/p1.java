// automorphic number :ex -- 5=25 ,6=36;

class Demo{
	public static void main (String[]s){
		int n=5;
		int temp=n;
		int sqr=n*n;
		int count=0;
		int sum=0;
		int m=1;

		while(n!=0){
			count++;
			n=n/10;
		}
		for(int i=1;i<=count;i++){
			m = m*10;
		}
		sum=sqr%m;
		if(temp==sum){
			System.out.println("automorphic number");
		}
		else{
			System.out.println("not automorphic number");
		}
	}
}

