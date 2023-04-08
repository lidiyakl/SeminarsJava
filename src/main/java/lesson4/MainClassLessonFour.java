package lesson4;

import java.util.*;

public class MainClassLessonFour {
    public static void main(String[] args) {
        //ex0();
        ex1();
    }


    //Замерьте время, за которое в ArrayList добавятся 1000000 элементов.
    // Замерьте время, за которое в LinkedList добавятся 1000000 элементов.
    // Сравните с предыдущим.
    private static void ex0() {
        final int SIZE = 1_000_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arraydList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arraydList.add(random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }

   // Реализовать консольное приложение, которое:
//    1. Принимает от пользователя строку вида text~num
//    2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка.
    private static void ex1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Введите строку-позицию: ");
            String text = scanner.nextLine();

            String[] arr = text.split("\\~");
            int num = Integer.parseInt(arr[1]);
            String val = arr[0];

            if (val.equals("print")){
                if (list.get(num) == null){
                    System.out.println("Значение отсутствует.");
                } else {
                    System.out.println(list.get(num));
                    list.remove(num);
                }
            }else {
                if (num > list.size()) {
                    for (int i = 0; i < num - list.size() + 1; i++) {
                        list.add(null);
                    }
                    list.add(val);
                } else if (num < list.size()){
                    list.set(num, val);
                }else {
                    list.add(val);
                }
            }
            System.out.println(list);
            }

        }
    }

