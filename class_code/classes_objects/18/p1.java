class travelAgency{
	int seatNo= 10;
	String pasengerName="vivek";
       static int busNo=2915;
       void travelInfo(){
	       System.out.println("Seat number = "+seatNo);
	       System.out.println("Pasenger name = "+pasengerName);
	       System.out.println("Bus number = "+busNo);
       }
}
class user{
	public static void main(String []s){
		travelAgency tr1=new travelAgency();
		travelAgency tr2=new travelAgency();
		tr1.travelInfo();
		tr2.travelInfo();
		System.out.println("---------------------------");

		tr2.seatNo=15;
		tr2.pasengerName="kunal";
		tr2.busNo=4086;

		tr1.travelInfo();
		tr2.travelInfo();

	}
}
             	       

