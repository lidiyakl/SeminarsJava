package lesson2;

public class MainClassFromLessonTwo {
    public static void main(String[] args) {
        //task1();
        task2();
    }


    //    Дано число N (>0) и два символа с1 и с2.
//    Нужно вывести на экран строку из символов с1 и с2,
//    начиная с с1. Количество символов равно N.
    private static void task1() {
        int n = 7;
        String c1 = "a";
        String c2 = "B";
        StringBuilder a = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 > 0) {
                a.append(c1);
            } else {
                a.append(c2);
            }
        }
        System.out.println(a);
    }
//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd. Выход: a4b3cd2

    private static void task2() {
        String a = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                res.append(a.charAt(i));
                if (count > 1) {
                    res.append(count);
                }
                count = 0;
            }
            count++;
        }
        res.append(a.charAt(a.length() - 1));
        if (count > 1) {       //или res.append(count > 1 ? count : "");
            res.append(count); // т.е. если count >1, то добавляем count,
        }                      // иначе ничего не добавляем (пустая строка)
        System.out.println(res);
    }
}

