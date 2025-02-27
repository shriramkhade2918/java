class OperatorDemo{
	public static void main(String[]s){
		int x=10;
		int y=20;
		int ans=++x + y++ + x++;
		System.out.println(ans);
		System.out.println(x);
		System.out.println(y);
	}
}

