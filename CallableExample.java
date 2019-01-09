package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class CallableExample implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println("now after sleep method");
        return "hello";
    }
    public static void main(String[] args){
        Callable a = new CallableExample();
        FutureTask  task = new FutureTask(a);
        //below is calling callable
        Thread t = new Thread(task);
        t.start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

