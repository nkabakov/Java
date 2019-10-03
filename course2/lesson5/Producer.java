package course2.lesson5;

public class Producer implements Runnable {
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
//            создаётся товар
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
//            покупается товар
            store.get();
        }
    }
}

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупатель смог купить 1 товар");
        System.out.println("Остаток товара на складе: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Продавец добавил 1 товар");
        System.out.println("Остаток товара на складе: " + product);
        notify();
    }
}

class MainT {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();









    }
}
