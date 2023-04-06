package homework3;


import java.util.*;


public class homework3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }


    // 1. Дан произвольный список целых чисел, удалить из него четные числа.
    private static void ex1() {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(20));
        }
        System.out.println(nums);

        nums.removeIf(x -> x % 2 == 0);
        System.out.println(nums);

//        Iterator<Integer> numsIterator = nums.iterator();
//        while (numsIterator.hasNext()){
//            Integer nextInt = numsIterator.next();
//            if (nextInt % 2 == 0){
//                numsIterator.remove();
//            }
      //  }

    }

    // 2. Задан целочисленный список ArrayList. Найти инимальное, максимальное и среднее
    // арифметическое из этого списка.
    private static void ex2() {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            nums.add(random.nextInt(20));
        }
        System.out.println(nums);

        int max = 0;
        int min = nums.get(0);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max){
                max = nums.get(i);
            }
            if (nums.get(i) < min){
                min = nums.get(i);
            }
            sum += nums.get(i);
        }
        int middle = sum/ nums.size();
        System.out.printf("Максимальное: %s. Минимальное: %s. " +
                "Среднее арифметическое: %s", max, min, middle);
    }


    // 3. Пройтись по списку и удалить повторяющиеся элементы.
    private static void ex3() {
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

        List<String> res = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i + 1)) == false) {
                res.add(list.get(i));
            }
        }
        res.add(list.get(list.size() - 1));
        System.out.println(res);
    }

    // 4. Создать список типа ArrayList<String>. Поместить в него как строки,
    // так и целые числа. Пройти по списку, найти и удалить целые числа.
    private static void ex4() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("5", "l", "d", "4", "t", "33", "g", "2"));
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (NumberFormatException ignored) {

            }
        }
        System.out.println(list);
    }
}

