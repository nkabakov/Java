package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Котик", 6);
        Animal cat2 = new Cat("Барсик", 2);
        Dog dog1 = new Dog("Пёсич", 13);
        Animal dog2 = new Dog("Бетмен", 3);



//        Расстояние бега/плаванья или высота прыжка рассчитывается, исходя из возраста животного.
//        К 2 годам достигается максимальная физическая форма, а потом она начинает падать. Ниже методы, с помощью
//        которых можно узнать максимальные показатели бега/прыжка/плаванья животного в определённом возрасте

//        System.out.println(((Cat) cat2).getMaxLenghtRun(5));
//        System.out.println(cat1.getMaxLenghtRun(4));
//        System.out.println(dog1.getMaxLenghtSwim(3));
//        System.out.println(((Dog) dog2).getMaxHeightJump(8));
//        System.out.println(dog1.getMaxLenghtRun(10));

        cat1.getMaxLenghtRun(6);
        cat1.getMaxHeightJump(6);

        ((Cat) cat2).getMaxLenghtRun(2);
        ((Cat) cat2).getMaxHeightJump(2);

        dog1.getMaxLenghtRun(13);
        dog1.getMaxHeightJump(13);
        dog1.getMaxLenghtSwim(13);

        ((Dog) dog2).getMaxLenghtRun(3);
        ((Dog) dog2).getMaxHeightJump(3);
        ((Dog) dog2).getMaxLenghtSwim(3);

        System.out.println("Результаты котиков: ");
        System.out.println();
        cat1.info();
        System.out.println("run: "+cat1.run(150));
        System.out.println("jump over: " + cat1.jumpOver(120));
        System.out.println("swim: " + cat1.swim(20));
        System.out.println();
        cat2.info();
        System.out.println("run: "+cat2.run(150));
        System.out.println("jump over: " + cat2.jumpOver(120));
        System.out.println("swim: " + cat2.swim(20));

        System.out.println();
        System.out.println("Результаты пёсиков: ");
        System.out.println();
        dog1.info();
        System.out.println("run: "+dog1.run(400));
        System.out.println("jump over: " + dog1.jumpOver(30));
        System.out.println("swim: " + dog1.swim(5));
        System.out.println();
        dog2.info();
        System.out.println("run: "+dog2.run(400));
        System.out.println("jump over: " + dog2.jumpOver(30));
        System.out.println("swim: " + dog2.swim(5));
    }
}
