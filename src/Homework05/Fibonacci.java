package Homework05;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {

        int a = 0;
        int a1 = 1;
        int a2;
        int b = 0;
        String input = "";
        boolean bool = true;


        System.out.println(" Please enter positive number to see Fibonacci numbers!");
        while (bool == true) {
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                b = Integer.parseInt(input);
                bool = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }

        System.out.println("So here your are first " +b+ " Fibonacci numbers)");
        System.out.print(a+ ", " +a1);

        for (int i=2; i<b; i++){
            {
                a2=a+a1;
                System.out.print(", "+a2);
                a=a1;
                a1=a2;
            }
        }

    }
}


