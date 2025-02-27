import java.io.*;
class Demo{
	public static void main(String[]s)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter str1:");
  		String str1=br.readLine();
		System.out.println("enter str2:");
		String str2=br.readLine();
		int len1=mystrlen(str1);
		int len2=mystrlen(str2);
		if(len1==len2){
	   	 System.out.println("equal");
		}
		else{
			int x=len1 - len2;
		System.out.println("distance between two strings are="+ x);
		}
	}
        static int mystrlen(String str){
	
		int count =0;
      		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			count++;
		}
		return count;
	}
}	

