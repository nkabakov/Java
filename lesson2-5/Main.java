package course2.HW.lesson5;

import static course2.HW.lesson5.MultiThread.*;

public class Main {

    public static void main(String[] args) {
        // заполняем массив единицами
        setArr(soloArr);

        // начинаем считать время для однопоточного вычисления
        long timerStart = System.currentTimeMillis();

        // проводим вычисления в потоке main
        for (int i = 0; i < SIZE; i++) {
            soloArr[i] = (float) (soloArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        // выводим данные о времени вычислений
        System.out.println("Однопоточное вычисление выполнено за " + (System.currentTimeMillis() - timerStart) + " мс");

        // заполняем массив единицами
        setArr(multiArr);

        // начинаем считать время для многопоточного вычисления
        timerStart = System.currentTimeMillis();

        // объявляем вспомогательные массивы
        float[] a1 = new float[H];
        float[] a2 = new float[H];

        // разбиваем основной массив на 2
        System.arraycopy(multiArr, 0, a1, 0, H);
        System.arraycopy(multiArr, H, a2, 0, H);

        // создаём и запускаем 2 параллельных потока с вычислениями
        Thread arrMathMultiT1 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                synchronized (a1) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread arrMathMultiT2 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                synchronized (a2) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        arrMathMultiT1.start();
        arrMathMultiT2.start();

        // приостанавливаем поток main на время выполнения двухпоточного вычисления
        try {
            arrMathMultiT1.join();
            arrMathMultiT2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // склеиваем вычисленные массивы в один
        System.arraycopy(a1, 0, multiArr, 0, H);
        System.arraycopy(a2, 0, multiArr, H, H);

        // выводим данные о времени вычислений
        System.out.println("Многопоточное вычисление выполнено за " + (System.currentTimeMillis() - timerStart) + " мс");
    }
}
