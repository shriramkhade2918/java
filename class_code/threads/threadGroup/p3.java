class MyThread extends Thread{
        MyThread (ThreadGroup tp ,String str){
                super(tp,str);
        }
        public void run(){
                
                System.out.println(Thread.currentThread());
        }

}
class ThreadGroupDemo{
        public static void main(String []s){
		ThreadGroup ptg=new ThreadGroup("c2w");

                MyThread obj=new MyThread(ptg,"xyz");
                obj.start();
                MyThread obj1=new MyThread(ptg,"shree");
                obj1.start();
                MyThread obj2=new MyThread(ptg,"khade");
                obj2.start();
        }
}
