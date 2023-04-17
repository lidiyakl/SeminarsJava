package lesson6;

public class Cats {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1);
        cat1.name = "Barsik";
        cat1.age = 5;
        cat1.type = "British";
        cat1.ownerSurname = "Ivanov";

        Cat cat2 = new Cat(2);
        cat2.name = "Murka";
        cat2.age = 1;
        cat2.type = "Russian Siberica";
        cat2.ownerSurname = "Vasileva";

        Cat cat3 = new Cat(3);
        cat3.name = "Vasya";
        cat3.age = 3;
        cat3.type = "Siam";
        cat3.ownerSurname = "Melov";

        System.out.println(cat3);
    }

}
