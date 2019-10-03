package course1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    //    Информация о наполненности тарелки
    public void infoPlate(int food) {
        if (food == 0) {
            System.out.println("Тарелка пуста");
        } else {
            System.out.println("В тарелке " + food + " грамм еды");
        }
    }

    //    Проверка тарелки на возможность покушать из неё (если еды меньше, чем нужно коту, то из тарелки нельзя есть)
    public boolean checkPlate(int amount) {
        if (getFood() < amount) {
            return false;
        } else {
            return true;
        }
    }

}
