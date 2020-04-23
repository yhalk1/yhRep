package pack;

public class Methods3 {
    public static void main (String[] args){
        System.out.println( "The number is even - " + isEven(23));
        System.out.println( "The number is even - " + isEven(20));


    }
    public static boolean isEven(int number){
        if (number%2 == 0){
            return true;
        }
        return false;
    }
}
