package week04.collections.set.tree_set_example;

import java.util.TreeSet;

public class TreeSetExample03 {
        public static void main(String[] args) {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(2);
            numbers.add(5);
            numbers.add(4);
            numbers.add(6);
            System.out.println("TreeSet: " + numbers);

            // Using pollFirst()
            System.out.println("Removed First Element: " + numbers.pollFirst()); //ilk öğeyi siler

            // Using pollLast()
            System.out.println("Removed Last Element: " + numbers.pollLast()); //son öge yi siler

            System.out.println("New TreeSet: " + numbers);
        }

}
