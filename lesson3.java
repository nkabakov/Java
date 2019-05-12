package lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        for (int count = 0; true; count++) {

            int inputNumber = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);

            if (inputNumber > randNumber) {

                System.out.println("Загаданное число меньше");
                System.out.println();

            } else if (inputNumber < randNumber) {

                System.out.println("Загаданное число больше");
                System.out.println();

            } else {

                System.out.println("Ура! Вы угадали!");
                System.out.println();
                break;
            }
            if (count == 2) {

                System.out.println("У вас кончились жизни. Хотите попробовать снова?");
                System.out.println("Введите 1, если хотите или 0, если не хотите");

                int check = getNumberFromScanner("", 0, 1);
                if (check == 0) {
                    break;
                } else {
                    count = 0;
                }
            }

        }
    }


    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}

