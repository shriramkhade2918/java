import mathform.Area;
class Demo{
	public static void main(String []s){
		int x=10;
		int y=20;
		Area m1=new Area(x);
		System.out.println("sqare:"+m1.sqr());
		Area m2=new Area(x,y);
		System.out.println("rectangle:"+m2.rect());
		}
}

