package course3.HW;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        Array arr = new Array(10000);
        Random random = new Random();
        // Тут колхоз немного ниже, потому что не смог придумать, как достать длину массива до того, как мы его заполним, поэтому ручками указал длину.
        // Заполнение массива рандомными данными
        for (int i = 0; i < 10000; i++) {
            arr.insert(random.nextInt(100));
        }
        // Удаление элемента по индексу
        // arr.remove(1);

        int len = arr.getSize();
        long start, finish;

        // Заполнение трёх разных массивов данными из "рандомного" массива
        int[] arr1 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = arr.arrFull(i);
        }
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = arr.arrFull(i);
        }
        int[] arr3 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = arr.arrFull(i);
        }

        // start - запись времени до сортировки, finish - после, в консоль выводится результат
        start = System.currentTimeMillis();
        Sort.sortBubble(arr1);
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения пузырьковой сортировки " + (finish-start) + " мс");

        start = System.currentTimeMillis();
        Sort.sortSelect(arr2);
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения выборочной сортировки " + (finish-start) + " мс");

        start = System.currentTimeMillis();
        Sort.sortInsert(arr3);
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения сортировки вставкой " + (finish-start) + " мс");
    }

}

class Array {

    public int[] arr;
    private int size;

    public int getSize() {
        return size;
    }

    Array(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    void insert(int value) {
        arr[size] = value;
        size++;
    }
    // Передаём в метод индекс элемента, который хотим удалить и после сдвигаем массив влево, начиная с этого индекса. Также в конце уменьшаем длину
    void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int arrFull(int index) {
        return arr[index];
    }

    boolean find(int value) {
        boolean b = false;
        int j;
        for (j = 0; j < size; j++) {
            if (arr[j] == value) {
                b = true;
                break;
            }
        }
        return b;
    }

}

class Sort {

    /**
     * Sort Bubble
     * O(n^2)
     */
    static void sortBubble(int[] mass) {
        int in, out;
        int len = mass.length;
        for (out = len - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (mass[in] > mass[in + 1]) {
                    change(in, in + 1, mass);
                }
            }
        }
    }

    /**
     * Sort Select
     * O(n)
     */

    static void sortSelect(int[] mass) {
        int in, out, mark;
        int len = mass.length;
        for (out = 0; out < len; out++) {
            mark = out;
            for (in = out + 1; in < len; in++) {
                if (mass[in] < mass[mark]) {
                    mark = in;
                }
            }
            change(out, mark, mass);
        }
    }

    /**
     * Sort Insert
     * O(n)
     */

    static void sortInsert(int[] mass) {
        int in, out;
        int len = mass.length;
        for (out = 1; out < len; out++) {
            int temp = mass[out];
            in = out;
            while (in > 0 && mass[in - 1] >= temp) {
                mass[in] = mass[in - 1];
                --in;
            }
            mass[in] = temp;
        }
    }

    private static void change(int a, int b, int[] mass) {
        int temp = mass[a];
        mass[a] = mass[b];
        mass[b] = temp;
    }
}


