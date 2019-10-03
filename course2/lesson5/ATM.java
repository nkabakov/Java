package course2.lesson5;

public class ATM {
    private int money;

    public ATM(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public synchronized void take(int amount, String userName) {
        if (money >= amount) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money -= amount;
            System.out.println(userName + " получил " + amount + " рублей");
        } else {
            System.out.println(userName + " не смог получить деньги");
        }
    }

    public void info() {
        System.out.println("ATM : " + money);
    }
}
