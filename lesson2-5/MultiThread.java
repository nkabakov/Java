package course2.HW.lesson5;

public class MultiThread {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;
    static float[] multiArr = new float[SIZE];
    static float[] soloArr = new float[SIZE];

    public static void setArr(float arr[]) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = i;
        }
    }

    public MultiThread() {
    }
}
