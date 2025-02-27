class Demo{
	public static void main(String[]s){
		int x=942111423;
		int i=0;
		while(x!=0){
			i=x%10;
			if(i%2==0){
				System.out.println(i*i);
			}
			x=x/10;
		}
	}
}
