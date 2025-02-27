//take n as input and print factorial of n:

class Demo{
	public static void main (String[]s){
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
