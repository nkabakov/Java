package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    //    Метод проверяет можно ли есть из тарелки, если да, то отнимает значение аппетита кошки из наполненности тарелки
    //    и присваивает коту статус сытости true, если поесть не удалось - false
    public void eat(Plate plate) {
        if (plate.checkPlate(getAppetite())) {
            plate.decreaseFood(getAppetite());
            satiety = true;
        } else {
            satiety = false;
        }
    }

    //   Метод проверяет, сыт ли кот и возвращает строку с этими данными
    public String isCatSatiety() {
        if (isSatiety()) {
            return " покушал и сыт!";
        } else {
            return " остался голоден :(";
        }

    }
}
