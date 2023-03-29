package lesson2;

public class MainClassFromLessonTwo {
    public static void main(String[] args) {
        task1();
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


}
