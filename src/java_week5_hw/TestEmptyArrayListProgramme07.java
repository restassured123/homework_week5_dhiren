package java_week5_hw;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class TestEmptyArrayListProgramme07 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //Adding the elements to list1

        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");
        list1.add("Mango");

        if (list1.isEmpty()){
            System.out.println("list1 is empty");
        }else {
            System.out.println("list1 is not empty");
        }
        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        }else {
            System.out.println("list2 is not empty" );
        }

    }
    public static  boolean isEmpty(ArrayList<?> list){
        return list.isEmpty();
    }


}
