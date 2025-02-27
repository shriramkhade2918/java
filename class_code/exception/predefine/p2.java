
import java.io.*;
class Demo{
	public static void main(String[]s)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		System.out.println(x/y);
	}
}
