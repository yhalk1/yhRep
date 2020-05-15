package Homework05;
import java.util.Scanner;

public class SumEvenAndOdd {

    public static void main (String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        String input = "";
        int[] intArray = new int[8];

        while ( a <= 7) {
            System.out.println(" Please enter 8 numbers and then we'll do a magic");
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                intArray[a] = Integer.parseInt(input);
                a++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }

        for (int i=0; i<intArray.length; i++){
            if (intArray[i]%2 == 0){
                b = b + intArray[i];
            }
            else{
                c = c + intArray[i];
            }

        }
        System.out.println("The sum of evev numbers is " + b);
        System.out.println("The sum of odd numbers is " + c);
        }

    }



