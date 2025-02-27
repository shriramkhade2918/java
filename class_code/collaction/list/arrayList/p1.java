
import java.util.*;
class ArrayListDemo{
	public static void main(String[]s){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add("shri");
		al.add(10);
		System.out.println(al);
		//size()
		System.out.println(al.size());
		//boolean contains(object )
		System.out.println(al.contains("shri"));
		//int indexOf(object)
		System.out.println(al.indexOf(10));
		//int lastIndexOf(object)
		System.out.println(al.lastIndexOf(10));
		al.set(3,50);
		System.out.println(al);
		System.out.println(al.get(1));
		//addAll();
		ArrayList al1=new ArrayList();
		al1.add("rahul");
		al1.add("kunal");
		al1.add("keshav");
		al1.add("vaibhav");
		System.out.println(al1);

		al.addAll(al1);
		System.out.println(al);
		//addAll(int ,obj)
		al.addAll(2,al1);
		System.out.println(al);
		al.clear();
		System.out.println(al);






	}
}
