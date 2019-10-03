package course2.HW.lesson2;

import static course2.HW.lesson2.Arrays.testArrRight;

//        testArrRight - таблица 4х4 с правильными данными
//        testArrWrongSize - таблица неверного размера
//        testArrWrongData - таблица с нечисловыми данными

public class Main {

    public static void main(String[] args) {
        System.out.println(sumArr(testArrRight));
    }

    public static int sumArr(String arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j].length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Размер таблицы не соответствует требуемому");
                } else
                    try {
                        sum = sum + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Нечисловые данные в строке " + (i + 1) + " столбце " + (j + 1), i, j);
                    }
            }
        }
        return sum;
    }
}



