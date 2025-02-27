import java.util.*;

class Demo{
	public static void main (String[]s){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
                System.out.println("enter element");

		int arr []=new int[size];
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elemnts");
		                         
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

