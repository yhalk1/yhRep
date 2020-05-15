package Homework05;
import java.util.Scanner;

public class Calculation {

    public static void main (String[] args) {

        int a = 0;
        int b = 0;
        int a1 = 1;
        String input = "";
        boolean bool = true;
        boolean bool1 = true;
        System.out.println(" Please enter a positive number: ");

        while (bool == true) {
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                a = Integer.parseInt(input);
                bool = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
        System.out.println(" Please enter another positive number: ");
        while (bool1 == true) {
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                b = Integer.parseInt(input);
                bool1 = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
        System.out.println("Let's find the value of " + a + " raised to the power of " +b);

        for (int i=0; i<b; i++){
            a1=a1*a;
        }
        System.out.println("So the result is: " +a1);
    }
}


