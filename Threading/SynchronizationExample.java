package com.javatraining;

public class SynchronizationExample {
    public static void main(String[] args)
    {
        Counter obj = new Counter();
        MyThread1 t1 = new MyThread1(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {
    // Reference variable of type counter.
    Counter counter;
    MyThread1(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            counter.increment();
        }
        System.out.println(this.counter.getCount());
    }
}


class Counter {
    int count = 0;
    public void increment()
    {
        synchronized (this){
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }
}