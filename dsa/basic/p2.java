class Demo{
	public static void main(String[]s){
		//int n=arr[0];
		int arr[]=new int[]{3,2,1,56,10000,167};
		int n=arr[0];
		int x=arr[0];
		for(int i=0;i<6;i++){
			if(n<arr[i])
				n=arr[i];
		}
		for(int i=0;i<6;i++){
			if(x>arr[i])
				x=arr[i];
		}
		System.out.println(n +"  "+x );
	}
}


