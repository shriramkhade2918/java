class replace{
	public static void main(String[]s){
		int a=1005;
		int temp=a;
		int arr[]=new int[4];
		int i=(arr.length-1);
		while(temp!=0){
			arr[i]=temp%10;
			i--;
			temp=temp/10;
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]==0){
				arr[j]=5;
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
		
		}
		System.out.println();
	}
}

		
