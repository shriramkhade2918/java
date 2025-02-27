class prodect{
	public static void main(String[]s){
		int x=1;
		int y=4;
		int z=y-x+1;
		int arr[]=new int[z];
		for(int i=0;i<arr.length;i++){
			arr[i]=x;
			x++;
		}
		int pro=1;
		for(int i=0;i<arr.length;i++){
			pro=pro*arr[i];
		}
		System.out.println("product:"+pro);
	}
}

