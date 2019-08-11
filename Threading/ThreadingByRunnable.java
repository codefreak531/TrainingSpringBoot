package com.javatraining;

public class ThreadingByRunnable{
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m,"MYThread");
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("thread by runnable");
        System.out.println(Thread.currentThread().getName());
    }
}


