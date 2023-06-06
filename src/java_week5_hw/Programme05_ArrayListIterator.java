package java_week5_hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme05_ArrayListIterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element (one element per line, 'done' to finish: ");
        String input = sc.nextLine();

        while (!input.equalsIgnoreCase("done")){
            list.add(input);
            input = sc.nextLine();
        }

        System.out.println("\nElements: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }

}