package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class homework4 {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

//    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Введите строку: ");
            String val = scanner.nextLine().toString();
            if (val.equals("print")) {
                for (int i = stack.size() - 1; i >= 0 ; i--) {
                    System.out.println(stack.get(i));
                }
                //System.out.println(stack);
            } else if (val.equals("revert")) {
                stack.pop();
            }
             else {
                stack.add(val);
            }
        }
    }

    // 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static void ex2() {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        LinkedList<String> listRes = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            listRes.add(list.get(i));
        }
        System.out.println(listRes.toString());
    }
}
