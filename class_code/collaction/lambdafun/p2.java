interface add{
	int sum();
}
 class Demo{
	 public static void main(String[]s){
		 int x=10;int y=20;
		 add a=()->
		 { 
			 int sum=x+y;
			return sum;

		 };
		 System.out.println(a.sum());
	 }
 }
