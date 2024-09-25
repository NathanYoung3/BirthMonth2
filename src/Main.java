import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        int monthNum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your birth month as an integer (1-12).");
        if (scan.hasNextInt()) {
            monthNum = scan.nextInt();
            switch (monthNum) {
                case 1 ->
                    System.out.println("Your birth month is January.");
                case 2->
                    System.out.println("Your birth month is February.");
                case 3->
                    System.out.println("Your birth month is March.");
                case 4->
                    System.out.println("Your birth month is April.");
                case 5->
                    System.out.println("Your birth month is May.");
                case 6->
                    System.out.println("Your birth month is June.");
                case 7->
                    System.out.println("Your birth month is July.");
                case 8->
                    System.out.println("Your birth month is August.");
                case 9->
                    System.out.println("Your birth month is September.");
                case 10->
                    System.out.println("Your birth month is October.");
                case 11->
                    System.out.println("Your birth month is November.");
                case 12->
                    System.out.println("Your birth month is December.");
                default-> {
                    System.out.println("You entered an invalid value.");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("You entered an invalid data type.");
            System.exit(0);
        }
    }
}