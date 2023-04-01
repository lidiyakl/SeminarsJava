package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class MainClassHomeWork2 {
    public static void main(String[] args) {
        //task2_1();
        //task2_2();
        task2_3("D:\\Тестировщик\\Java\\SeminarsJava\\src\\main\\java\\homework1");
    }


//    1. Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).

    private static void task2_1() {
        System.out.printf("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(str2));
    }

//            2. Напишите метод, который составит строку, состоящую из 100
//    повторений слова TEST и метод, который запишет эту строку в простой
//    текстовый файл, обработайте исключения.

    private static void task2_2() {
        int n = 100;
        String txt = "TEST";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(txt).append(" ");
            }
        System.out.println(str);
        try(PrintWriter pw = new PrintWriter("src/main/resources/output.txt")) {
            pw.print(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


//3*.Напишите метод, который определит тип (расширение) файлов из текущей
//    папки и выведет в консоль результат вида:
//            1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//            4 Расширение файла: jpg
    private static void task2_3(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return;
        }

        String[] dirListNames = file.list();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dirListNames.length; i++) {
            String fileName = dirListNames[i];
            sb.append(i + 1).append(" Расширение файла: ").
                    append(fileName.substring(fileName.lastIndexOf(".") + 1)).
                    append(System.lineSeparator());
        }
        System.out.println(sb);
    }

}

