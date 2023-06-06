package java_week5_hw;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class CompareArrayListsProgramme11 {

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // can do this way Type 1
        /** if ( c1.equals(c2)){
         System.out.println("The two ArrayList are equal ");

         }else {
         System.out.println("The two ArrayList are not equal ");
         }*/

        // or can be shown this way Type 2

        // Create a copy of c1
        ArrayList<String> commonElements = new ArrayList<>(c1);

        // Retain only the common elements between c1 and c2
        commonElements.retainAll(c2);

        System.out.println("Common elements between c1 and c2:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }
}