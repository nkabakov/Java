package course2.lesson5;

public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//
////        t1.start();
////        t2.start();
//
//        t1.run();
//        t2.run();

//        через Runnable
//        Thread t1 = new Thread(new MyRunnable("t1"));
//        Thread t2 = new Thread(new MyRunnable("t2"));
//
//        t1.start();
//        t2.start();

//       через анонимные классы

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();

//        через лямбда выражения

//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        });
//
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.print(i + " ");
//            }
//        });
//
//
//        t1.start();
//
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("END");

//синхронизация по методу (synchronized в методе)
//        Counter counter = new Counter();
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < 1000000; i++) {
//                counter.inc();
//            }
//        });
//
//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < 1000000; i++) {
//                counter.dec();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());

//        синхронизация по объекту

//        Counter counter = new Counter();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (counter) {
//                    counter.inc();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (counter) {
//                    counter.dec();
//                }
//            }
//
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());

//        Задача про банкомат
//        ATM atm = new ATM(100);
//
//        Thread t1 = new Thread(() -> {
//            atm.take(50, "user 1");
//        });
//
//        Thread t2 = new Thread(() -> {
//            atm.take(50, "user 2");
//        });
//
//
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        atm.info();

//        про завершение программы при окончании основного потока

//        Thread t1 = new Thread(new Runnable() {
//            int seconds = 0;
//
//            @Override
//            public void run() {
//                while (true){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    seconds++;
//                    System.out.print(seconds + " ");
//                }
//
//            }
//        });
//
//        t1.setDaemon(true);
//        t1.start();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print("END ");

//        задача про склад




    }
}
