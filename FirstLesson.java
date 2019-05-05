package lesson1;

public class FirstLesson {
    public static void main(String[] args) {

//      Упражнение 2. Инициализация всех типов переменных
        byte low = 64;
        short medium = 128;
        int usual = 65536;
        long bigboy = 2147483648L;

        boolean arg = true;

        double defaultIrr = 10.0;
        float nonDefaultIrr = 5.5F;

        char char1 = 'c';
        String word = "Word";

//      Упражнение 3. Расчёт уравнения a * (b + (c / d)). На вход передаются 4 значения типа double, возвращается
//      ответ типа double
        math(5, 3, 3, 2);

//      Упражнение 4. Передаются 2 числа типа int. Числа складываются и проверяется, что сумма попадает в промежуток
//      от 10 до 20 (включительно). Если попадает, то вовращается true, если нет - false
        checkGap(15, 5);

//      Упражнение 5. Передаётся число типа int.  Если число положительное или 0, в консоль печатается
//      "Число положительное", если число отрицательное - "Число отрицательное"
        printSign(0);

//      Упражнение 6. Передаётся число типа int. Если число отрицательное, возвращается значение true,
//      если передаётся положительное число или 0 - false
        checkSign(-2);

//      Упражнение 7. Передаётся строка с именем. В консоль выводится "Привет, %ИМЯ!"
        printName("Нео");

//      Упражнение 8. Передаётся число типа int с годом. Если год високосный, то в консоль выводится
//      "Указанный год является високосным", если год не високосный - "Указанный год не является високосным"
        printLeapYear(2000);

    }

    public static double math(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean checkGap(int x, int y) {
        int sum = x + y;
        if ((sum > 10) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printSign(int inputNumber) {
        if (inputNumber < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean checkSign(int inputNumber) {
        if (inputNumber < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void printLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Указанный год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Указанный год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println("Указанный год является високосным");
        } else {
            System.out.println("Указанный год не является високосным");
        }
    }
}
