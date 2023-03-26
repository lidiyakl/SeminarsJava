package homework1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        //printMinAndMax(10);
        //changeArr();
        inputNameAndPrint();
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

//3*. В консоли запросить имя пользователя. В зависимости от текущего времени,
//    вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    private static void inputNameAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if ((5 <= hour) && (hour < 12)){
            System.out.printf("Доброе утро, %s!", name);
        } else if ((12 <= hour) && (hour < 18)){
            System.out.printf("Добрый день, %s!", name);
        } else if ((18 <= hour) && (hour < 23)){
            System.out.printf("Добрый вечер, %s!", name);
        } else if ((23 == hour) | (hour < 5)){
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}

