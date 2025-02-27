class Demo{
	public static void main (String[]s){
		int i=1;
		int sum=0;
		int var=1;
		while(i<=10){
		
			if(i%2==0){
				sum=sum+i;
			}
			else{
				var=var*i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(var);
	}
}


