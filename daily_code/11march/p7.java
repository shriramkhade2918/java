class Demo{
	public static void main(String[]s){
	       float sellingprice=1300f;
	       float costprice =1000f;
	       float pr=sellingprice- costprice;
	       if(pr>0){
		       System.out.println("profit is"+pr);
	       }
	       else if(pr<0){
		       System.out.println("loss is"+(pr*-1));
	       }
	       else{
		       System.out.println("no profit or no loss");
	       }
	}
}
