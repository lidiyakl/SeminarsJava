package homework6;

import java.util.Objects;

public class Laptop {
    int id;
    String brand;
    String model;
    String color;
    int screenDiagonalInch;
    int randomAccessMemoryGB;
    int totalMemoryGB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return id == laptop.id && screenDiagonalInch == laptop.screenDiagonalInch &&
                randomAccessMemoryGB == laptop.randomAccessMemoryGB &&
                totalMemoryGB == laptop.totalMemoryGB && brand.equals(laptop.brand) &&
                model.equals(laptop.model) && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, screenDiagonalInch, randomAccessMemoryGB,
                totalMemoryGB);
    }

    public String toString() {
        return String.format("%d %s %s %s %d %d %d", id, brand, model, color, screenDiagonalInch,
                randomAccessMemoryGB, totalMemoryGB);
    }

    public Laptop(int id, String brand, String model, String color, int screenDiagonalInch,
                  int randomAccessMemoryGB, int totalMemoryGB) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.screenDiagonalInch = screenDiagonalInch;
        this.randomAccessMemoryGB = randomAccessMemoryGB;
        this.totalMemoryGB = totalMemoryGB;
    }
}
