package homework5;

import java.util.*;
import java.util.stream.Collectors;

public class homework5 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3999: ");
        int num = scanner.nextInt();
        if (num > 0 && num < 4000) {
            System.out.println(ex3(num));
        } else System.out.println("Введено некорректное значение");
    }

    //    1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//    что 1 человек может иметь несколько телефонов.
    private static void ex1() {
        Map<String, List> phone = new HashMap<>();
        phone.put("Иванов Николай", Arrays.asList(2333574, 2333575));
        phone.put("Петров Иван", Arrays.asList(2333674));
        phone.put("Соколова Мария", Arrays.asList(2483574, 2483654));

        phone.forEach((key,value) -> System.out.printf(
                "%s\t%s%n",
                key,value));
        }

//        2. Пусть дан список сотрудников.
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.

private static void ex2() {
     List<String> names = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
             "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
             "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
             "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
     List<String> firstNames = new ArrayList<>();
    for (int i = 0; i < names.size(); i++) {
        String[] arr = names.get(i).split(" ");
        firstNames.add(arr[0]);
    }
    firstNames.sort(Comparator.naturalOrder());
 //   System.out.println(firstNames);

    Map<String, Integer> repeatNames = new HashMap<>();
    int count = 1;
    for (int i = 0; i < firstNames.size() - 1; i++) {
        if (firstNames.get(i).equals(firstNames.get(i + 1))) {
            count++;
        } else {
            if (count > 1){
                repeatNames.put(firstNames.get(i), count);
                count = 1;
            }

        }
    }
    if (firstNames.get(firstNames.size() - 1).equals(firstNames.get(firstNames.size() - 2))) {
        repeatNames.put(firstNames.get(firstNames.size() - 1), count);
    }

    for (String key : repeatNames.keySet()){
        System.out.printf("%s\t%s%n", key,repeatNames.get(key));
    }

    repeatNames = repeatNames.entrySet().stream().sorted(Map.Entry.comparingByValue()).
            collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap::new
    ));


    List<String> resNames = new ArrayList<>(repeatNames.keySet());
    Collections.reverse(resNames);
    System.out.println("Список имен по убыванию популярности: ");
    System.out.println(resNames);
}

//            3***. Написать метод, который переведёт данное целое число в римский формат.
private static String ex3(int n) {
        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(1000, "M");
        numbers.put(900, "DM");
        numbers.put(500, "D");
        numbers.put(400, "CD");
        numbers.put(100, "C");
        numbers.put(90, "XC");
        numbers.put(50, "L");
        numbers.put(40, "XL");
        numbers.put(10, "X");
        numbers.put(9, "IX");
        numbers.put(5, "V");
        numbers.put(4, "IV");
        numbers.put(1, "I");
        int maxKey = numbers.floorKey(n);
        if (n == maxKey){
            return numbers.get(n);
        }
        return numbers.get(maxKey) + ex3(n -maxKey);
      }
    }

