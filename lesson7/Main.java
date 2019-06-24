package lesson7;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //      Объявляем сканеры
        Scanner sc = new Scanner(System.in);
        Scanner check = new Scanner(System.in);

        int userFood;
        int food = 0;

        //      Создаём массив котов
        Cat cat[] = new Cat[4];
        cat[0] = new Cat("Мурзик", 14);
        cat[1] = new Cat("Валентин", 11);
        cat[2] = new Cat("Толстопуз", 20);
        cat[3] = new Cat("Котёнок", 5);

        for (; ; ) {
            //      Спрашиваем у пользователя, сколько еды положить в тарелку\
            System.out.println("Сколько грамм еды Вы хотите положить в тарелку?");
            userFood = sc.nextInt();
            food = food + userFood;

            //      Создаём тарелку
            Plate plate = new Plate(food);

            //      Выводим первой строкой количество еды в тарелке, пытаемся покормить кота, второй строкой выводим получилось или нет
            //      Также выполняется проверка на сытость. Если кот уже поел, то второй раз он есть не будет. Информация о том, что кот сыт выводится до того момента, пока он не поест
            for (int i = 0; i < cat.length; i++) {
                if (!cat[i].isSatiety()) {
                    plate.infoPlate(plate.getFood());
                    cat[i].eat(plate);
                    System.out.println(cat[i].getName() + cat[i].isCatSatiety());
                }
            }

            //      Выводим количество еды в тарелке после еды
            plate.infoPlate(plate.getFood());
            System.out.println();

            //      Присваиваем количество оставшейся еды в тарелке значению food, чтобы мы могли добавить к нему еще еды
            food = plate.getFood();

            //      Спрашиваем пользователя, хочет ли он продолжить
            System.out.println("Хотите ли добавить еды в тарелку?");
            System.out.println("Напишите 1, если хотите положить и что угодно, если хотите выйти");
            int answer = check.nextInt();
            if (answer != 1) break;

        }
    }
}
