package Homework05;

public class UpdatedListOfNumbers {

    public static void main (String[] args){
        for (int i =0; i<=10; i++){
            if (i==5){
             System.out.print("five, ");
                continue;
            }
            else if (i==7){
                continue;
            }
            System.out.print(i +", ");
        }
    }
}
