package pack;

public class Methods {
    public static void main (String[] args){
        int number1 = 123;
        int number2 = 321;
        System.out.println("The sum is: " + add(number1,number2));
    }
    public static double add(int num1, int num2){
        double sum = num1+num2;
        return sum;
    }
}
