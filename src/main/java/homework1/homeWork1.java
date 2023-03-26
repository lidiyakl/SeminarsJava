package homework1;

import java.util.Arrays;
import java.util.Random;

public class homeWork1 {
    public static void main(String[] args) {
        //printMinAndMax(10);
        changeArr();
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

//    2. Дан массив nums = [3,2,2,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести эти элементы
//    в конец массива.
//    Таким образом, первые несколько (или все) элементов массива должны быть отличны
//    от заданного, а остальные - равны ему.

    private static void changeArr() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        int arr = 0;
        while (left <= size/2) {
            if (nums[left] == val) {
                if (nums[right] == val) {
                    right = right - 1;
                }
                arr = nums[left];
                nums[left] = nums[right];
                nums[right] = arr;
            }
            left++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
