import java.io.*;
class fileDemo{
	public static void main(String[]s)throws IOException{
		File fobj=new File("shri","java.txt");
		fobj.createNewFile();
	}
}

