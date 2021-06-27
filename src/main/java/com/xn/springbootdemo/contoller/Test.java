package com.xn.springbootdemo.contoller;


import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author XiaoNing
 * @date 2021/4/1
 */
class Test {
    private static Queue<String> queue = new ConcurrentLinkedQueue<>();
    private static final int MAX_CUSTOMER_NUM = 3;


    public static void main(String[] args) {
        ProductVinThread it = new ProductVinThread();
        it.start();
        SendCardThread pt;
        for (int i = 0; i < MAX_CUSTOMER_NUM; i++) {
            pt = new SendCardThread();
            pt.start();
        }

    }

    public static boolean insert(String str) {
        System.out.println("insert=" + str + " , queue.size=" + queue.size());
        queue.offer(str);

        if (queue.size() > 20000) {
            // do some thing ,wait 2s
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public synchronized static String get() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    public static boolean isWorkOk() {
        return queue.isEmpty();
    }
}

class SendCardThread extends Thread {
    public SendCardThread() {

    }

    @Override
    public void run() {
        String str;
        while (true) {
            str = Test.get();
            if (str == null) {
                System.out.println("任务池为空！");
                try {
                    Thread.sleep(5 * 1000L);
                    if (Test.isWorkOk()) {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "消费：" + str);
            }

        }

    }
}

class ProductVinThread extends Thread {
    public ProductVinThread() {

    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Test.insert("生产" + (i++));
                if (i > 10) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
