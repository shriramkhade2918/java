class Demo{
	public static void main (String[]s){
		int  n1=12;
		int n2=32;
		int n3=32;
	
		if(n1>n2 && n1> n3){
			System.out.println(n1+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else if(n2>n1 && n2>n3){
			System.out.println(n2+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else if(n3>n2 && n3>n1){
			System.out.println(n3+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else if(n1==n2 && n2>n3){
			System.out.println(n1+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else if(n1>n2 && n1==n3){
			System.out.println(n3+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else if(n3==n2 && n1<n2){
			System.out.println(n2+"is maximum number between"+n1+" "+ n2+" and"+n3);
		}
		else{
			System.out.println("invalid number");
		}
	}
}
