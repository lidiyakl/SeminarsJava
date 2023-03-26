package homework1;

import java.util.Arrays;
import java.util.Random;

public class homeWork1 {
    public static void main(String[] args) {
        printMinAndMax(10);
    }

    // 1. Задать одномерный массив и найти в нем минимальный и
    // максимальный элементы
    private static void printMinAndMax(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = 0;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Минимальный элемент равен %s. Максимальный элемент равен %s", min, max);
    }
}
