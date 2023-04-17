package lesson6;

import java.util.Objects;

public class Cat {
    int id;
    String name;
    int age;
    String type;
    String ownerSurname;

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getId(int id) {
        return id;
    }

    public String toString() {
        return String.format("%d %s %d %s %s", id, name, age, type, ownerSurname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return id == cat.id && age == cat.age && name.equals(cat.name) && type.equals(cat.type) && ownerSurname.equals(cat.ownerSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, type, ownerSurname);
    }

    //    public boolean equals(Object o){
//      var t = (Cat) o;
//      return id == t.id && name == t.name;  // коты равны, если уних id и name одинаковые
//    }
    public static void meow(){
        System.out.println("meow");
    }

    public Cat(int id) {
        this.id = id;
    }
}
