/*
package thread;
import com.sun.xml.internal.fastinfoset.tools.PrintTable;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodSynchronizationExample  {
    public static void main(String[] args){
        PrintTable1 table= new PrintTable1();
        PrintTable1 table1 = new PrintTable1();
        MyThread thread = new MyThread(table1);
        MyThread thread2 = new MyThread(table);
        thread.start();
        thread2.start();
        }
    }
    class PrintTable1{
    static synchronized void printTable(int n){
        for( int i= 1; i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }
    class MyThread extends Thread{
    PrintTable t;
    MyThread(PrintTable t){
        this.t = t;
    }
    }
   */
/* @Override
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        ExecutorService ExecutorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<2;i++){
            ExecutorService executorService = ExecutorService;
        }
    }
}
*/
