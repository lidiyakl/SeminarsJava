package lesson3;

import java.util.*;

public class MainClassLessonThree {
    public static void main(String[] args) {
        //ex0();
        //ex1();
        ex2();
    }


//    Даны следующие строки, cравнить их с помощью == и метода
//    equals() класса Object
//    String s1 = "hello";
//    String s2 = "hello";
//    String s3 = s1;
//    String s4 = "h" + "e" + "l" + "l" + "o";
//    String s5 = new String("hello");
//    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
    }

//    Заполнить список десятью случайными числами.
//    Отсортировать список методом sort() и вывести его на экран.

    private static void ex1() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        Collections.sort(list);
        //list.sort(Comparator.reverseOrder()); сортировка в обратном порядке
        // встроенным методом (можно выбрать разные типы сортировки)
        System.out.println(list);
    }

//    Заполнить список названиями планет Солнечной системы в произвольном
//    порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке.
//
//    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

    private static void ex2() {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Uranus", "Neptun", "Pluto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        List<String> resList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < 29; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                resList.add(list.get(i));
                resList.add(Integer.toString(count));
                count = 1;
            }
        }
        resList.add(list.get(list.size() - 1));
        resList.add(Integer.toString(count));
        System.out.println(resList);

        List<String> res = new ArrayList<>();
        for (int i = 0; i < 29; i++) {
            if (list.get(i).equals(list.get(i + 1)) == false) {
                res.add(list.get(i));
            }
        }
        resList.add(list.get(list.size() - 1));
        System.out.println(res);

        // Вариант преподавателя
//        List<String> planetNames = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter",
//                "Saturn", "Uranus", "Neptun", "Pluto"); // получаем список (неизменяемую коллекцию)
//        List<String> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 30; i++) {
//            list.add(planetNames.get(random.nextInt(9)));
//        }
//        System.out.println(list);
//
//        list.sort(Comparator.naturalOrder());
//        StringBuilder sb = new StringBuilder();
//        System.out.println(list);
//        int count = 1;
//        for (int i = 0; i < list.size()-1; i++) {
//            if (list.get(i).equals(list.get(i+1))) {
//                count++;
//            } else {
//                sb.append(list.get(i))
//                        .append(": ")
//                        .append(count)
//                        .append("; ");
//                count=1;
//            }
//        }
//        sb.append((list.get(list.size()-1) + ": "))
//                .append(count).append(".");
//        System.out.println(sb);
    }
}
