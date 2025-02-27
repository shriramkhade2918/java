class MyThread extends Thread{
        public void run(){
                for(int i=0;i<10;i++){
                        System.out.println("in run");
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException ie){//(InturruptException ie){

                        }
                }
        }
}
class Demo extends Thread{
        public void run(){
                for(int i=0;i<10;i++){
                        System.out.println("in run");
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException ie){//(InturruptException ie){

                        }
                }
        }
}
class TreadDemo{
        public static void main(String[]s) throws InterruptedException  {
                MyThread obj=new MyThread();
                Demo obj1=new Demo();
                obj1.start();
                obj.start();
                for(int i=0;i<10;i++){
                        System.out.println("in main");
                        Thread.sleep(2000);
                }
        }
}
