//Find armstrome number:

class Demo{
	public static void main(String[]s){
		int n=153;
		int temp1=n;
		int temp=n;
		int sum=0;
		int rem=0;
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		while(temp1!=0){
			rem=temp1%10;
			int multi=1;
			for(int i=1;i<=count;i++){
				multi=multi*rem;
			}
			temp1=temp1/10;
			sum=sum+multi;
		}
		if(sum==temp){
			System.out.println("Armstrome number");
		}
		else{
			System.out.println("not Armstrome number");
		}
	}
}



