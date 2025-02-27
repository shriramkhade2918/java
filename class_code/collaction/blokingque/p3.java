import java.util.concurrent.*;
import java.util.*;
class BlockingQueueDemo{
        public static void main(String[]s)throws InterruptedException{

                BlockingQueue bQueue = new PriorityBlockingQueue();

                bQueue.put(10);
                bQueue.put(20);
                bQueue.put(30);
                bQueue.put(40);
                bQueue.put(50);
                bQueue.put(60);
                bQueue.put(70);
                bQueue.put(80);
                bQueue.put(90);
                bQueue.put(110);
                bQueue.put(120);

                System.out.println(bQueue);
                bQueue.put(33);

        System.out.println(bQueue);
        ArrayList al=new ArrayList();
        System.out.println("ArrayList:"+al);
        bQueue.drainTo(al);
        System.out.println("ArrayList:"+al);
        System.out.println(bQueue);
        }
}


