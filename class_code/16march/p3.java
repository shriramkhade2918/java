// take  n as input print whether n is amstrome number 0r not:

class Demo{
	public static void main(String[]s){
		int n=153;
		int temp=n;
		int x=0;
		int sum=0;
		for(;n!=0;n=n/10){
			x=n%10;
			sum=sum+x*x*x;
		}
		if(sum==temp){
			System.out.println("amstrome number");
		}
		else {
			System.out.println("not amstrome number");
		}

	}
}

