package java_week5_hw;

import java.util.Scanner;

/**
 * Write a java program using if else and while loop, Program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 and 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme02_week5_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        int mathMarks, scienceMarks, englishMarks;

        do {
            System.out.println("Enter Math marks (0-100): ");
            mathMarks= scanner.nextInt();
        }while (mathMarks <0 || mathMarks >100);

        do{
            System.out.println("Enter Science marks(0-100): ");
            scienceMarks = scanner.nextInt();
        } while (scienceMarks<0 || scienceMarks>100);

        do{
            System.out.println("Enter English marks(0-100): ");
            englishMarks = scanner.nextInt();
        }while ( englishMarks <0 || englishMarks>100);

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage= (totalMarks/3.0);

        String result, grade;
        if (percentage>=35) {
            result = "Pass";
            if (percentage >= 80)
                grade = "A+";
            else if (percentage >= 60)
                grade = "A";
            else if (percentage >= 50)
                grade = "B";
            else
                grade = "C";
        }else{
                result = "Fail";
                grade = "-";
            }
        System.out.println("\n_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|_____________________________|");
        System.out.println("| Name    : " + name);
        System.out.println("| Roll No : " + rollNo);
        System.out.println("|_____________________________|");
        System.out.println("| Subjects:    Marks           |");
        System.out.println("|_____________________________|");
        System.out.println("| Math    : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|_____________________________|");
        System.out.println("| Total   : " + totalMarks);
        System.out.println("|_____________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result     : " + result);
        System.out.println("| Grade      : " + grade);
        System.out.println("|_____________________________|");

        }

    }

