//arm


class Demo{
	public static void main(String []s){
		int n=5;
		int a=0;
		int b=1;
		int sum=0;
		for( int i=1; ;i++){
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			if(sum>n){
                                break;
                        }
		}
	}
}

