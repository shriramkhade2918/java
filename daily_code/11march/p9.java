class demo{
	public static void main(String[]s){
		int x=3;
		int y=4;
		int z=5;
		if((x*x)+( y*y)==z*z){
			System.out.println("it is a pythagoraen triplet");
		}
		else if((y*y)+(z*z)==x*x){
			System.out.println("it is a pythagoraen triplet");
		}
		else if((z*z )+(x*x)==y*y){
			System.out.println("it is a pythagoraen triplet");
		}
		else{

			System.out.println("it is a not  pythagoraen triplet");
		}
	}
}

