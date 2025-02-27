class Demo {
	public static void main(String[]s){
		String str1="shahsi";
		String str2="shashi";
		int dif=mystrdif(str1,str2);
		System.out.println(dif);
	}
	static int mystrdif(String st,String tr){
		int x=0;
		char ch[]=st.toCharArray();
		char ch1[]=tr.toCharArray();
		if (ch.length>=ch1.length){
			for(int i=0;i<ch.length;i++){
				x=ch[i]-ch1[i];
			}
			return x;
		}
		else{
			for (int i=0;i<ch1.length;i++){
			       x=ch[i]-ch1[i];
			}
	 		return x;
		}
	}

}	
