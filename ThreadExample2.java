package thread;
import java.lang.*;

    public class ThreadExample2 implements Runnable  {

        @Override
        public void run(){
            for (int i=0; i<5;i++){
                System.out.println("thread name:"+Thread.currentThread());
                System.out.println(i);
            }
        }
        public static void main (String[] args){
            System.out.println("inside main method:"+Thread.currentThread());
            ThreadExample t1 = new ThreadExample();
            t1.setName("Neha");
            t1.start();
            ThreadExample t2 = new ThreadExample();
            t2.start();
            t2.setName("Java");
            ThreadExample t3= new ThreadExample();
            t3.start();
        }



}
