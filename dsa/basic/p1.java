import java.util.*;
class Demo{
	public static void main(String[]s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter "+n+" elements:");
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the any element which can be present or not in array:");
		int x=sc.nextInt();
		int y=-1;
		for(int i=0;i<n;i++){
			if(arr[i]==x){
				 y=i;
			}

		}
		if(y==-1){
			System.out.println("Element is not present");
		}
		else{
			System.out.println("Elemebt is fount at Index: "+y);

		}
	}
}

		
