package lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';


    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Человечество победило");
                break;
            }

            if (isMapFull()) {
                System.out.println();
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Человечество проиграло в этой войне");
                break;
            }

            if (isMapFull()) {
                System.out.println();
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static boolean isMapFull() {
        int empty = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    empty++;
                }
            }
        }
        return empty == 0;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");

        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {

            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X, Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {

        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;

        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;

    }

    public static boolean checkWin(char symbol) {

//Логика в методе такая: есть переменная checker, которая увеличивается, если попадаются при проверке одинаковые символы
//после проверки частного случая checker сбрасывается. Если получается, что checker становится равен количеству фишек
//для победы, то метод возвращает true. Если нет, то false

        int checker = 0;

//      Проверка главной диагонали
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol){
                checker++;
            }
        }

        if (checker==DOTS_TO_WIN) return true;
        checker = 0;

//      Проверка побочной диагонали
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 1; j <= 0; j--) {
                if (map[i][j] == symbol){
                    checker++;
                }
            }
        }

        if (checker==DOTS_TO_WIN) return true;
        checker = 0;

//      Проверка столбцов по очереди
        for (int i = 0; i < SIZE; i++) {
            int j = 0;
            if (map[i][j] == symbol) checker++;
            j++;
        }

        if (checker==DOTS_TO_WIN) return true;
        checker = 0;

//      Проверка строк по очереди
        for (int i = 0; i < SIZE; i++) {
            int j = 0;
            if (map[j][i] == symbol) checker++;
            j++;
        }

        if (checker==DOTS_TO_WIN) return true;

        return false;
    }

}
