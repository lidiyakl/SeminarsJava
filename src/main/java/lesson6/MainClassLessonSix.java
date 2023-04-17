package lesson6;

import java.util.*;

public class MainClassLessonSix {
    public static void main(String[] args) {
        ex0();
        ex1();
        ex2();
    }

    //    1. Создайте HashSet, заполните его следующими числами: 1, 2, 3,2, 4, 5, 6, 3.
//    Распечатайте содержимое данного множества.
//    2. Создайте LinkedHashSet, заполните его следующими числами: 1, 2, 3,2, 4, 5, 6, 3.
//    Распечатайте содержимое данного множества.
//    3. Создайте TreeSet, заполните его следующими числами: 1, 2, 3,2, 4, 5, 6, 3.
//    Распечатайте содержимое данного множества.
    private static void ex0() {
        List<?> data = List.of(1, 3, 2, 4, 5, 6, 2, 1, 4);
        var dataNew = new ArrayList<>(data);
        Collections.reverse(dataNew);

        System.out.println(new HashSet<>(dataNew));
        System.out.println(new LinkedHashSet<>(dataNew));
        System.out.println(new TreeSet<>(dataNew));
    }

//    1. Напишите метод, который заполнит массив из 1000 элементов случаными
//            цифрами от 0 до 1000.
//    2. Создайте метод, в который передайте заполненный выше массив и с помощью
//            Set вычислите процент уникальных значений в данном массиве и верните
//            его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//    процент Уникальных чисел= количество уникальных чисел*100/ общее кол-во чисел
//            в массиве.
    private static void ex1() {
        int n = 1000;
        Integer [] arr = fillArray(n);
        System.out.println(Arrays.toString(arr));
        double uniqValue = uniqueValue(arr);
        System.out.println(uniqValue);
    }

    private static Integer [] fillArray(Integer size) {
        Random random = new Random();
        Integer [] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    private static double uniqueValue(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        System.out.println(set);
        return 1.0 * set.size() * 100 / array.length;

    }

//    Продумайте структуру класса Кот. Какие поля и методы будут актуальны
//    для приложения, которое являтся
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю.Д.Куклачева
//    Можно записать в текстовом виде, не обязательно реализовывать в java.
    private static void ex2() {
    }


//    Реализуйте один из вариантов класса Cat из предыдущего задания, можно
//    использовать не все придуманные поля и методы. Создайте несколько
//    экземпляров этого класса, выведите иx в консоль.
//    Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//    его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
}
