package pack;

import java.util.Scanner;

public class SeasonApp {


    public enum SeasonEnum{ SUMMER, AUTUMN,  WINTER, SPRING }

    public static void main (String[] args ){
        System.out.println("Hello, please type a name of a month and I'll guess what season is it)))");
        System.out.println("(e.g. one of January, February, March, April, May, June, July, August, September, October, November, December)");
        Scanner myScanner = new Scanner(System.in);
        String currentMonth = myScanner.nextLine();

        switch(currentMonth.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("It's a " + SeasonEnum.WINTER + " and so clod brrrr");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("It's a " + SeasonEnum.SPRING + " and we should stay home because of f.cking Coronavirus");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("It's a " + SeasonEnum.SUMMER + " Rivers, lakes, sea are waiting");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("It's a " + SeasonEnum.AUTUMN + " Gold Autumn");
                break;
            default:
                 System.out.println("Ooops, be nice and enter correct name)");



        }
    }

}


