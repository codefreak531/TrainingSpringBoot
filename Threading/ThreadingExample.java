package com.javatraining;

public class ThreadingExample extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadingExample t  = new ThreadingExample();
        t.start();
    }
}
