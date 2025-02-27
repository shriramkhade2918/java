class largElem{
	public static void main(String[]s){
		int size=7;
		int arr[]=new int[]{1,2,0,3,2,4,5};
		int larg=0;
		for(int i=0;i<arr.length;i++){
			if(larg<arr[i]){
				larg=arr[i];
			}
		}
		System.out.println(larg);
	}
}
