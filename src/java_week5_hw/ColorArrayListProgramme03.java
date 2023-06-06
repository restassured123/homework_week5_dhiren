package java_week5_hw;
//Write a Java program to create a new array list, add some colours (string) and
// printout the collection using for each loop.

import java.util.ArrayList;
import java.util.Scanner;

public class ColorArrayListProgramme03 {
    public static void main(String[] args) {

        //ArrayList list = new ArrayList();  // we can contain any type of elements(string, Integer etc..

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter colour (one colour per line,'done' to finish :");
        String colour = scanner.nextLine();

        while (!colour.equalsIgnoreCase("done")){
                list.add(colour);
                colour = scanner.nextLine();
        }

        for (  String s:  list){
            System.out.println(s);
        }

    }
}