class company{
	int noOfEmploy=50;
	String companyName="binecaps";
	void companyInfo(){
		String Founder="shashi Bagal";
		System.out.println("founder: "+Founder);
		System.out.println("company name: "+companyName);
		System.out.println("no of employee: "+noOfEmploy);
	}
}
class user{
	public static void main(String[]s){
		company obj =new company();
		obj.companyInfo();
	}
}

		

