//take integer n as intput.print whether n isperfect number or not:
 
class Demo{
	public static void main (String[]s){
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println("perfect number");
		}
		else{
			System.out.println("not perfect number");
		}
	}
}
