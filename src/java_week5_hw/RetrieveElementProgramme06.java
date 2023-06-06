package java_week5_hw;

import java.util.ArrayList;
import java.util.Scanner;

/**Write a Java program to retrieve an element (at a specified index) from a given
 array list*/


public class RetrieveElementProgramme06 {

        public static void main(String[] args) {
            ArrayList<String> elements = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Add elements to the ArrayList
            elements.add("Apple");
            elements.add("Banana");
            elements.add("Orange");
            elements.add("Mango");

            System.out.print("Enter the index of the element to retrieve: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < elements.size()) {
                String element = elements.get(index);
                System.out.println("Element at index " + index + ": " + element);
            } else {
                System.out.println("Invalid index!");
            }
        }
    }

