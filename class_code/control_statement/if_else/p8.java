class ifElseDemo{
	public static void main(String[]s){
		int units=200;
		if (units>100){
			System.out.println("total bill:"+ ((units-100)*2+100));
		}
		else if(units<=100){
			System.out.println("total bill:"+units*2);
		}
	}
}
