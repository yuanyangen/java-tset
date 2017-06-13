package com.yyg.test.functional.thread;

import org.junit.Test;
import scala.Int;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yuanyangen on 6/7/17.
 */
public class ThreadTest {





    @Test
    public void test1() {
        Integer total = 0;
        //AtomicInteger total = new AtomicInteger(0);
        CountDownLatch latch = new CountDownLatch(1000);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 100, 10000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
        Task task = new Task(total, latch);

        for (int i = 0; i < 1000; i++) {
            executor.execute(task);
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(total);
    }


    @Test
    public void test2() {
        AtomicInteger total = new AtomicInteger(0);
        CountDownLatch latch = new CountDownLatch(1000);
        TestInt tt = new TestInt();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 1000, 10000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1));

        for (int i = 0; i < 1000; i++) {
            executor.execute(() -> {total.incrementAndGet(); tt.incr();latch.countDown();
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(total);
        System.out.println(tt.get());
    }
}

class TestInt{
    private static volatile Integer a = 0;
    public void incr() {
        a++;
    }
    public Integer get() {
        return a;
    }



}

class Task implements Runnable {
    Integer cnt;
    CountDownLatch latch;

    public Task(Integer cnt, CountDownLatch latch) {
        this.cnt = cnt;
        this.latch = latch;
    }

    @Override
    public void run() {
        cnt++;
        latch.countDown();
    }
}

