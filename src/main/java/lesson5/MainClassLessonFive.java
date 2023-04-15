package lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassLessonFive {
    public static void main(String[] args) {
        ex0();
        System.out.println(ex1("MMCMXCIX"));
    }


    // Создать структуру для хранения номеров паспортов и фамилий сотрудников организации.
    // Вывести данные по сотрудникам с фамилией Иванов.
    private static void ex0() {
        Map<String, String> pasportsToFamilySurnameMap = new HashMap<>();
        pasportsToFamilySurnameMap.put("134234", "Иванов");
        pasportsToFamilySurnameMap.put("483948", "Петров");
        pasportsToFamilySurnameMap.put("599388", "Васильев");

        System.out.println(pasportsToFamilySurnameMap);

        for (Map.Entry<String, String> entry : pasportsToFamilySurnameMap.entrySet()) {
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }

//      Другой способ:
//        for (String key : pasportsToFamilySurnameMap.keySet()){
//            System.out.printf("%s\t%s%n", key,pasportsToFamilySurnameMap.get(key));
//        }

//       Еще один способ
//        pasportsToFamilySurnameMap.forEach((key,value) -> System.out.printf(
//                "%s\t%s%n",
//                key,value));
    }

    // Написать метод, который переведет римское число в арабское.
    //MMCMXCIX
    private static int ex1(String num) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);

        int res = 0;
        int next = -1;
        for (int i = 0; i < num.length() - 1; i++) {
            int current = numbers.get(num.charAt(i) + "");
            next = numbers.get(num.charAt(i + 1) + "");
            if (current < next) {
                res -= current;
            } else {
                res += current;
            }
        }
        res += next;
        return res;
    }
}
