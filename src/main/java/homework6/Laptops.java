package homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "Lenovo", "LV-4562", "black",
                16, 8, 256);
        Laptop laptop2 = new Laptop(2, "DEXP", "Aquilon", "silver",
                14, 4, 128);
        Laptop laptop3 = new Laptop(3, "Asus", "F515KA", "White",
                16, 4, 128);
        Laptop laptop4 = new Laptop(4, "Huawei", "WF H9", "gray",
                16, 16, 512);
        Laptop laptop5 = new Laptop(5, "Acer", "AC-4886", "black",
                17, 8, 256);

        List<Laptop> laptops = new ArrayList<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
        print(laptops);
    }

    private static void print(List<Laptop> list) {
        System.out.println("Введите нужный цвет: ");
        Scanner scanner = new Scanner(System.in);
        String clr = scanner.nextLine().toString();
        for (int i = 0; i < list.size(); i++) {
            if (clr.equals(list.get(i).color)){
                System.out.println(list.get(i));
            }
        }

    }
}
