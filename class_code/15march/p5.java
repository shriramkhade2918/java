//take n as input count all factorial and print it:

class Demo{
	public static void main(String[]s){
		int n=8;
		int num=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				num++;
			}
		}
		System.out.println(num);
	}
}
