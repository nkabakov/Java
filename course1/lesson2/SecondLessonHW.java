package lesson2;

import java.util.Arrays;

public class SecondLessonHW {

    public static void main(String[] args) {

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr1 = {1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
//        System.out.println(Arrays.toString(arr1));

//    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
//        System.out.println(Arrays.toString(arr2));


//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
//        System.out.println(Arrays.toString(arr3));


//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) arr4[i][j] = 1;
//                System.out.print(arr4[i][j]+" ");
            }
//            System.out.println();
        }

//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrMin = arr5[0];
        int arrMax = arr5[0];

        for (int i = 0; i < arr5.length; i++) {
            if (arrMin > arr5[i]) arrMin = arr5[i];
            if (arrMax < arr5[i]) arrMax = arr5[i];
        }
//        System.out.println("Минимальный элемент в массиве " + arrMin);
//        System.out.println("Максимальный элемент в массиве " + arrMax);


//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//    если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.

        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
//        System.out.println(checkBalance(arr6));

    }

//    Метод checkBalance для упражнения 6 из домашнего задания
//    Не смог разобраться, как заставить метод работать правильно. По моей идее у нас есть переменная, которая
//    считает сумму элементов с начала и переменная, которая считает сумму элементов с конца. Если находится место, где
//    эти суммы равны, то возвращается true, но я не смог придумать, как заставить циклы считать, например, только от 0
//    элемента до N и от последнего до N+1 и сравнивать суммы.

    public static boolean checkBalance(int[] arr) {
        int sumArrRight = 0;
        int sumArrLeft = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                sumArrLeft += arr[i];
                sumArrRight += arr[j];
                if (sumArrLeft == sumArrRight) return true;
            }
        }
        return false;
    }
}



