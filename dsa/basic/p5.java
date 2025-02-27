class largElem{
	public static void main(String[]s){
		int arr[]=new int[]{10,200,400,5000};
		 int x=0;
		 for(int i=0;i<arr.length;i++){
			 if(x<arr[i]){
				 x=arr[i];
			 }
		 }
		 System.out.println(x);
	}
}
