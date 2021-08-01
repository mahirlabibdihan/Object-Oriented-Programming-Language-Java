package com.dihu;

class ImplementsRunnable implements Runnable{
    public Thread t;
    ImplementsRunnable(){
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Starting Implements thread.");
        try{
            for(int n=5;n>0;n--){
                System.out.println("Implements thread: "+n);
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Implements thread interrupted");
        }
        System.out.println("Exiting Implements  thread");
    }
}
class ExtendsThread extends Thread{
    ExtendsThread(){
        start();
    }
    @Override
    public void run(){
        System.out.println("Starting Extends thread.");
        try{
            for(int n=5;n>0;n--){
                System.out.println("Extends thread: "+n);
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Extends thread interrupted");
        }
        System.out.println("Exiting Extends thread");
    }
}
public class MainThread {

    public static void main(String[] args){
	// write your code here
        System.out.println("Starting parent thread.");
        Thread t1=new ExtendsThread();
        ImplementsRunnable t2=new ImplementsRunnable();
        Thread t3=new Thread(MainThread::f1);
        t3.start();

        try{
            System.out.println("Waiting for threads to finish");
            t1.join();
            System.out.println("Join Finished");
            t2.t.join();
            System.out.println("Join Finished");
            t3.join();
            System.out.println("Join Finished");
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }


        System.out.println("Exiting parent thread");
    }

    public static void f1(){
        System.out.println("Starting method thread.");
        try{
            for(int n=5;n>0;n--){
                System.out.println("Method thread: "+n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Method thread interrupted");
        }
        System.out.println("Exiting method thread");
    }
}
