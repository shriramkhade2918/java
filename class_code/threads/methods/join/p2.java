class MyThread extends Thread{
        public void run(){
                System.out.println("in run");
                System.out.println(Thread.currentThread());
		for (int i=0;i<10;i++){
			System.out.println("shree");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){

			}
		}
        }
}
class ThreadDemo{
        public static void main (String[]s)throws InterruptedException{
                MyThread obj= new MyThread();
                obj.start();
                obj.join();

                System.out.println(Thread.currentThread());
        }
}
