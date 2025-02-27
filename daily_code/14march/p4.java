class Demo{
	public static void main(String[]s){
		int x=942111423;
		int i=0;
		int num=0;

		while(x!=0){
			num=x%10;
			if(num%2!=0){
				i++;
			}
			x=x/10;
		}
		System.out.println(i);
	}
}

