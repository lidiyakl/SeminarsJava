package lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        size2();
        // inputNameAndPrint();
    }
    //Написать программу, которая запросит пользователя ввести
//<Имя> в консоли.
//        Получит введенную строку и выведет в консоль сообщение
//        “Привет, <Имя>!”
    private static void inputNameAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // или in.nextLine()
        System.out.printf("Hello, %s!", name);
        scanner.close(); // необязательно
    }

    //    Дан массив двоичных чисел, например [1,1,0,1,1,1],
//    вывести максимальное количество подряд идущих 1.
    private static void size2() {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};
        int k = 0;
        int max = 0;
        for (int num : arr) {
            if (num == 1) {
                k++;
                if (k > max) {
                    max = k;
                }
            } else {
                k = 0;
            }
        }
        System.out.printf("Большая последовательность, %s", max);
    }
}
