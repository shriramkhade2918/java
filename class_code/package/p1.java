

import java.util.*;
import mathform.arithfun.Addition;

class Client{
	public static void main(String[]s){

                System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Addition obj=new Addition(x,y);
		int sum= obj.add();
		System.out.println(sum);
	}
}

