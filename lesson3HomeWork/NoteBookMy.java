package lesson3HomeWork;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*Создать класс Notebook с полями (price(double), ram(int))
1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort) */

public class NoteBookMy {
    private double price;
    private int ram;

    public NoteBookMy(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Notebook [price=" + price + ", ram=" + ram + "]";
    }

    public static void main(String[] args) {
        List<NoteBookMy> notebooks = new ArrayList<>();

        notebooks.add(new NoteBookMy(500.0, 4));
        notebooks.add(new NoteBookMy(900.0, 8));
        notebooks.add(new NoteBookMy(700.0, 16));
        notebooks.add(new NoteBookMy(1200.0, 32));
        notebooks.add(new NoteBookMy(300.0, 8));

        System.out.println("Welcome to the notebook catalog!");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Select an action:");
                System.out.println("1 - price in ascending order");
                System.out.println("2 - ram in ascending order");
                System.out.println("3 - Sort by memory first, then by price");
                int option = scanner.nextInt();
                if (option == 1) {
                    notebooks.sort(Comparator.comparing(NoteBookMy::getPrice));
                    System.out.println(notebooks);

                } else if (option == 2) {
                     notebooks.sort(Comparator.comparing(NoteBookMy::getRam));
                     System.out.println(notebooks);

                } else if (option == 3){
                    notebooks.sort(Comparator.comparing(NoteBookMy::getRam).thenComparing(NoteBookMy::getPrice));
                    System.out.println(notebooks);

                    /*
                     * // Sort by price using Collections.sort
                     * System.out.println("Sort by price using Collections.sort:");
                     * Collections.sort(notebooks, Comparator.comparing(Notebook::getPrice));
                     * System.out.println(notebooks);
                     * 
                     * // Sort by memory using Collections.sort
                     * System.out.println("Sort by memory using Collections.sort:");
                     * Collections.sort(notebooks, Comparator.comparing(Notebook::getRam));
                     * System.out.println(notebooks);
                     * 
                     * // Sort by memory first, then by price using Collections.sort
                     * System.out.
                     * println("Sort by memory first, then by price using Collections.sort:");
                     * Collections.sort(notebooks,
                     * Comparator.comparing(Notebook::getRam).thenComparing(Notebook::getPrice));
                     * System.out.println(notebooks);
                     */


                  

                }
            }
        }
    }
}
