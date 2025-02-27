class Employee{
	int empId=10;
	String name="kanha";
	static int y=50;
	void empInfo(){
		System.out.println("Id = "+empId);
		System.out.println("name = "+name);
		System.out.println("y = "+y);
	}
}
class mainDemo{
	public static void main(String[]s){
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.empInfo();
		emp2.empInfo();

		emp2.empId=20;
		emp2.name="rahul";
		emp2.y=200;
		System.out.println("----------------");

		emp1.empInfo();
		emp2.empInfo();
	}
}
