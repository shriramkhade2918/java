class ifElseDemo{
	public static void main(String[]s){
		int x=15;
		if(x%3==0 && x%5==0){
			System.out.println("fizz -buzz");
		}
		else if(x%3==0){
			System.out.println("fizz");
		}
		else if(x%5==0){
			System.out.println("buzz");
		}
		else {
			System.out.println("not devisible by both");
		}
	}
}
