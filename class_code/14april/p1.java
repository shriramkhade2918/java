import java.io.*;
class Demo{
	public static void main(String[]s) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter row number:");
		int row = Integer.parseInt(br.readLine());
		char ch='A';
		int i=1;
		char x;
		while(i<=row){
			ch++;
			i++;
		}x=ch;
		for(int j=1;j<=row;j++){
			for(int k=1;k<=row;k++){
				if(j%2==1){
				System.out.print("x"+i +" ");
				i--;
				x--;
			}
			else{
				System.out.print("ch"+i +" ");
				i++;
				ch++;
			}
			}

			System.out.println();
		}
	}
}


