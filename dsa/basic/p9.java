class largNum{
	public static void main(String[]s){
		int x=11;
		int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
		
		for(int i=0;i<arr.length;i++){
			int num=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					num++;
				}

			}
			if(num%2==0){
			System.out.println(arr[i]);
			}
		}
	
	}
}

