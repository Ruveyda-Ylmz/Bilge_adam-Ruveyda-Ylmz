package week04.collections.set.tree_set_example;

import java.util.TreeSet;

public class TreeSetExample02 {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(2);
            numbers.add(5);


            numbers.add(4);
            numbers.add(6);
            System.out.println("TreeSet: " + numbers);

            // Using higher()
            System.out.println("Using higher: " + numbers.higher(4));

            // Using lower()
            System.out.println("Using lower: " + numbers.lower(4));

            // Using ceiling()
            System.out.println("Using ceiling: " + numbers.ceiling(3));

            // Using floor()
            System.out.println("Using floor: " + numbers.floor(3)); //taban sayıyı getirmeye çalılır
            //3 den önce en büyük çıktıyı verir

        }
}
