class range{
	public static void main(String[]s){
		int x=2,y=5;

		int arr[]=new int[]{1,4,5,2,7,8,3};
		for(int i=0;i<arr.length;i++){
			if(arr[i]>x && arr[i]<y){
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}
}
