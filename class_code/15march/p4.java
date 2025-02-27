//take n as input print all facors of given number:

class Demo{
	public static void main(String[]s){
		int n=9;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}
