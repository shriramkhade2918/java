class Dam{
	String damName="koyana Dam";
	float capacity=98.77f;

	void infoOfDam(){
		String location="koyana Nagar";
		System.out.println("Location of dam: "+location);
		int construct= 1956;
		System.out.println("Construction of dam begin : "+construct);
	}
	void usesOfDam(){
		String uses1="electricity generate";
		System.out.println("main use of dam water is: "+uses1);
		String uses2="farming";
		System.out.println("Basic use of dam water is: "+uses2);
	}
}
class waterFoundation{
	public static void main (String []s){
		Dam obj=new Dam();
	
		System.out.println(obj.damName);
		System.out.println(obj.capacity +" TMC");
		obj.infoOfDam();
		obj.usesOfDam();
	}
}



