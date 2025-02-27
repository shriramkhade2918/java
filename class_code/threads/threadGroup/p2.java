class MyThread extends Thread{
	MyThread(){

	}

        MyThread (String str){
                super(str);
        }
        public void run(){
                System.out.println(getName());
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getThreadGroup());
        }

}
class ThreadGroupDemo{
        public static void main(String []s){
                MyThread obj=new MyThread("xyz");
                obj.start();
                MyThread obj1=new MyThread("shree");
                obj1.start();
                MyThread obj2=new MyThread();
                obj2.start();
        }
}
